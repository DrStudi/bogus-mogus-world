package drsus.bmworld.blocks

import com.mojang.serialization.MapCodec
import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.blocks.state.AttachedCrop
import drsus.bmworld.items.ModItems
import drsus.bmworld.items.loot_table.ModLootTables
import drsus.bmworld.tags.allModTags
import kotlinx.serialization.descriptors.PrimitiveKind
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.resources.ResourceKey
import net.minecraft.server.level.ServerLevel
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.tags.BlockTags
import net.minecraft.tags.ItemTags
import net.minecraft.util.RandomSource
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.*
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.*
import net.minecraft.world.level.material.Fluid
import net.minecraft.world.level.material.FluidState
import net.minecraft.world.level.material.Fluids
import net.minecraft.world.level.storage.loot.LootTable
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape
import java.util.function.Function
import kotlin.math.min

class TrellisBlock(properties: Properties) : HorizontalDirectionalBlock(properties), SimpleWaterloggedBlock, BonemealableBlock  {


    val CODEC: MapCodec<TrellisBlock> = BlockBehaviour.simpleCodec<TrellisBlock>(Function { properties: Properties -> TrellisBlock(properties) })
    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(
            HorizontalDirectionalBlock.FACING,
            WATERLOGGED,
            CROP,
            AGE

        )
    }
    companion object {
        var FACING: EnumProperty<Direction> = BlockStateProperties.HORIZONTAL_FACING
        var WATERLOGGED: BooleanProperty = BlockStateProperties.WATERLOGGED
        const val MAX_AGE: Int = 4
        val AGE: IntegerProperty = BlockStateProperties.AGE_4

        var CROP: EnumProperty<AttachedCrop> = EnumProperty.create<AttachedCrop>("crop", AttachedCrop::class.java)
        val SHAPE_OCCLUSION: MutableMap<Direction.Axis, VoxelShape> = Shapes.rotateHorizontalAxis(
            Shapes.or(box(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), box(14.0, 5.0, 7.0, 16.0, 16.0, 9.0))
        )
        val SHAPE_COLLISION: MutableMap<Direction.Axis, VoxelShape> =
            Shapes.rotateHorizontalAxis(column(16.0, 4.0, 0.0, 16.0))
        val SHAPES: MutableMap<Direction.Axis, VoxelShape> = Shapes.rotateHorizontalAxis(cube(16.0, 16.0, 4.0))

    }
    init {
        registerDefaultState(
            stateDefinition
                .any()
                .setValue<Direction, Direction>(FACING, Direction.NORTH)
                .setValue<AttachedCrop, AttachedCrop>(CROP, AttachedCrop.BARE)
                .setValue<Boolean, Boolean>(WATERLOGGED, false)
        )
    }

    override fun getCollisionShape(
        blockState: BlockState,
        blockGetter: BlockGetter,
        blockPos: BlockPos,
        collisionContext: CollisionContext
    ): VoxelShape {
        val axis = (blockState.getValue<Direction>(FACING)).axis
        return SHAPE_COLLISION.get(axis) as VoxelShape
    }

    override fun getShape(
        blockState: BlockState,
        blockGetter: BlockGetter,
        blockPos: BlockPos,
        collisionContext: CollisionContext
    ): VoxelShape {
        val axis = (blockState.getValue<Direction>(FACING)).axis
        return SHAPES.get(axis) as VoxelShape
    }
    override fun getOcclusionShape(blockState: BlockState): VoxelShape {
        val axis = blockState.getValue<Direction>(FACING).axis
        return SHAPE_OCCLUSION.get(axis) as VoxelShape
    }
    override fun getStateForPlacement(blockPlaceContext: BlockPlaceContext): BlockState {
        return this.defaultBlockState().setValue<Direction, Direction>(
            FACING,
            blockPlaceContext.horizontalDirection.opposite,

        ).setValue<Boolean, Boolean>(
            WATERLOGGED,
            blockPlaceContext.level.getFluidState(blockPlaceContext.clickedPos) == Fluids.WATER
        )

    }
    override fun updateShape(
        blockState: BlockState,
        levelReader: LevelReader,
        scheduledTickAccess: ScheduledTickAccess,
        blockPos: BlockPos,
        direction: Direction,
        blockPos2: BlockPos,
        blockState2: BlockState,
        randomSource: RandomSource
    ): BlockState {
        if (blockState.getValue<Boolean>(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader))
        }

        return super.updateShape(
            blockState,
            levelReader,
            scheduledTickAccess,
            blockPos,
            direction,
            blockPos2,
            blockState2,
            randomSource
        )
    }
    override fun getFluidState(blockState: BlockState): FluidState {
        return if (blockState.getValue<Boolean>(WATERLOGGED)) Fluids.WATER.getSource(false) else super.getFluidState(
            blockState
        )
    }
    override fun canPlaceLiquid(
        livingEntity: LivingEntity?,
        blockGetter: BlockGetter,
        blockPos: BlockPos,
        blockState: BlockState,
        fluid: Fluid
    ): Boolean {
        return super.canPlaceLiquid(livingEntity, blockGetter, blockPos, blockState, fluid)
    }
    override fun placeLiquid(
        levelAccessor: LevelAccessor,
        blockPos: BlockPos,
        blockState: BlockState,
        fluidState: FluidState
    ): Boolean {
        return super.placeLiquid(levelAccessor, blockPos, blockState, fluidState)
    }


    override fun randomTick(
        blockState: BlockState,
        serverLevel: ServerLevel,
        blockPos: BlockPos,
        randomSource: RandomSource
    ) {
        if (!isBare(blockState) && getAge(blockState) < MAX_AGE) serverLevel.setBlock(blockPos, blockState.setValue(AGE, getAge(blockState)+1),2)

        if (getCrop(blockState) !== AttachedCrop.SEA_MOSS) {
            spreadCrop(blockState, blockPos, blockPos.above(1), serverLevel, 2)
            spreadCrop(blockState, blockPos, blockPos.below(1), serverLevel, 0)
        }
        if (blockState.getValue(WATERLOGGED) && isBare(blockState) && serverLevel.getBiome(blockPos).`is`(allModTags.SEA_MOSS_GROWABLE_IN)) {
            serverLevel.setBlock(blockPos, blockState.setValue(CROP, AttachedCrop.SEA_MOSS).setValue(AGE,0),2)
        }
        if (getCrop(blockState) == AttachedCrop.IVY) {
            when (blockState.getValue(FACING)) {
                Direction.NORTH -> {
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x+1,blockPos.y,blockPos.z), serverLevel, 2)
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x-1,blockPos.y,blockPos.z), serverLevel, 2)
                }
                Direction.SOUTH -> {
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x+1,blockPos.y,blockPos.z), serverLevel, 2)
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x-1,blockPos.y,blockPos.z), serverLevel, 2)
                }
                Direction.WEST -> {
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x,blockPos.y,blockPos.z+1), serverLevel, 2)
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x,blockPos.y,blockPos.z-1), serverLevel, 2)
                }
                Direction.EAST -> {
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x,blockPos.y,blockPos.z+1), serverLevel, 2)
                    spreadCrop(blockState, blockPos, BlockPos(blockPos.x,blockPos.y,blockPos.z-1), serverLevel, 2)
                }
                else -> {}
            }
        }
        super.randomTick(blockState, serverLevel, blockPos, randomSource)
    }
    override fun useItemOn(
        itemStack: ItemStack,
        blockState: BlockState,
        level: Level,
        blockPos: BlockPos,
        player: Player,
        interactionHand: InteractionHand,
        blockHitResult: BlockHitResult
    ): InteractionResult {
        val belowBlock = level.getBlockState(blockPos.below(1))
        if (!isBare(blockState) && itemStack.item==Items.SHEARS) {
            if (level is ServerLevel){
                val serverLevel: ServerLevel = level
                harvestCrop(blockState,blockPos,level,player, false)
                serverLevel.setBlock(blockPos,blockState.setValue(CROP, AttachedCrop.BARE).setValue(AGE,0), 2)
                serverLevel.playSound(
                    null,
                    blockPos,
                    SoundEvents.SHEARS_SNIP,
                    SoundSource.BLOCKS,
                    1.0f,
                    0.8f + serverLevel.random.nextFloat() * 0.4f)
                itemStack.hurtAndBreak(1, player,interactionHand)
            }
            return InteractionResult.SUCCESS
        }
        if (!isBare(blockState) && itemStack.`is`(ItemTags.HOES) )  {
            val d: Int = harvestColumn(blockState,blockPos,level,player)
            itemStack.hurtAndBreak(d, player,interactionHand)
            return InteractionResult.SUCCESS

        }

            if (isBare(blockState)) {
            if (itemStack.item==ModItems.IVY) {
                plantCrop(itemStack, AttachedCrop.IVY, blockPos, blockState, level)
                return InteractionResult.SUCCESS
            }
            if ((belowBlock.`is`(BlockTags.DIRT) || (belowBlock.block==blockState.block && getCrop(belowBlock) == itemToCrop(itemStack) && getAge(belowBlock)>1))) when (itemStack.item) {
                ModItems.GRAPES -> {
                    plantCrop(itemStack, AttachedCrop.GRAPEVINE,blockPos,blockState,level)
                    return InteractionResult.SUCCESS
                }
            }
        }

        return super.useItemOn(itemStack, blockState, level, blockPos, player, interactionHand, blockHitResult)

    }
    fun harvestColumn(blockState: BlockState, blockPos: BlockPos, level: Level, player: Player): Int{

        val i: Int = harvestBlockAbove(blockState,blockPos, level, player, 0)
        BogusMogusWorld.logger.info("$i Blocks harvested")
        return i
    }
    fun harvestBlockAbove(blockState: BlockState, blockPos: BlockPos, level: Level, player: Player, count: Int): Int
    {
        val j: Int = count+1
        var k: Int = j
        val blockAbovePos: BlockPos = blockPos.above(1)
        val blockAbove: BlockState = level.getBlockState(blockAbovePos)
        if (blockAbove.block == blockState.block)
        {
            if (getCrop(blockAbove) == getCrop(blockState)){
                k = harvestBlockAbove(blockAbove,blockAbovePos,level, player, j)
            }
        }
        harvestCrop(blockState,blockPos, level, player, false)

        return k

    }
    fun plantCrop(itemStack: ItemStack, crop: AttachedCrop, blockPos: BlockPos, blockState: BlockState, level: Level){
        level.setBlock(blockPos, blockState.setValue(CROP, crop).setValue(AGE,0), 2)
        itemStack.shrink(1)
    }
    override fun useWithoutItem(
        blockState: BlockState,
        level: Level,
        blockPos: BlockPos,
        player: Player,
        blockHitResult: BlockHitResult
    ): InteractionResult {
        if (getAge(blockState)==4 && !isBare(blockState)) {
            harvestCrop(blockState,blockPos,level,player,true)
            return InteractionResult.SUCCESS
        }
        return super.useWithoutItem(blockState, level, blockPos, player, blockHitResult)
    }
    private fun isBare(blockState: BlockState): Boolean {
        return blockState.getValue(CROP) == AttachedCrop.BARE
    }
    private fun getAge(blockState: BlockState): Int {
        return blockState.getValue(AGE)
    }
    private fun getCrop(blockState: BlockState): AttachedCrop {
        return blockState.getValue(CROP)
    }
    private fun itemToCrop(itemStack: ItemStack): AttachedCrop{
        when (itemStack.item) {
            ModItems.GRAPES -> return AttachedCrop.GRAPEVINE
            ModItems.IVY -> return AttachedCrop.IVY

        }
        return AttachedCrop.BARE
    }
    private fun harvestCrop(blockState: BlockState, blockPos: BlockPos, level: Level, player: Player, ivyEffect: Boolean): Boolean{
        if (level is ServerLevel){
            val serverLevel: ServerLevel = level
            if (getAge(blockState)==4 && !isBare(blockState)) when (getCrop(blockState)){
                AttachedCrop.GRAPEVINE -> return harvestAffect(blockState,blockPos,level,serverLevel,player, ModLootTables.GRAPE_VINE)
                AttachedCrop.PEA -> TODO()
                AttachedCrop.BARE -> TODO()
                AttachedCrop.TOMATO -> TODO()
                AttachedCrop.SEA_MOSS -> {
                    harvestAffect(blockState,blockPos,level,serverLevel,player, ModLootTables.SEA_MOSS)
                    serverLevel.setBlock(blockPos,blockState.setValue(CROP, AttachedCrop.BARE).setValue(AGE,0),2)
                    return true
                }
                AttachedCrop.IVY -> {
                    if (ivyEffect) {
                        player.addEffect(MobEffectInstance(MobEffects.POISON, 60, 1), player)
                    } else {
                        harvestAffect(blockState,blockPos,level,serverLevel,player, ModLootTables.IVY)
                        serverLevel.setBlock(blockPos,blockState.setValue(CROP, AttachedCrop.BARE).setValue(AGE,0),2)
                    }
                    return true
                }
            }
        }
        return false
    }
    private fun harvestAffect(blockState: BlockState, blockPos: BlockPos, level: Level,serverLevel: ServerLevel,player: Player, resourceKey: ResourceKey<LootTable>): Boolean{
        var c: Int= blockPos.x
        var d: Int= blockPos.z

        if (blockState.getValue(FACING) == Direction.EAST || blockState.getValue(FACING) == Direction.WEST)
        {
            c = blockPos.x + (player.blockPosition().x-blockPos.x).coerceIn(-1, 1)

        } else
        {
            d  = blockPos.z + (player.blockPosition().z-blockPos.z).coerceIn(-1, 1)
        }
        dropFromBlockInteractLootTable(
            serverLevel,
            resourceKey,
            blockState,
            level.getBlockEntity(blockPos),
            null,
            player
        ) { serverLevelx: ServerLevel?, itemStack: ItemStack? ->
            popResource(
                serverLevelx!!,
                BlockPos(c, blockPos.y, d),
                itemStack!!
            )
        }
        serverLevel.setBlock(blockPos,blockState.setValue(AGE,2),2)
        return true
    }
    private fun spreadCrop(blockState: BlockState, blockPos: BlockPos, spreadBlockPos: BlockPos, serverLevel: ServerLevel, ageThreshold: Int){
        val spreadBlock: BlockState = serverLevel.getBlockState(spreadBlockPos)
        if (getAge(blockState) > ageThreshold && spreadBlock.block == blockState.block && spreadBlock.getValue(CROP) == AttachedCrop.BARE) {
            serverLevel.setBlock(spreadBlockPos,spreadBlock.setValue(CROP, getCrop(blockState)).setValue(AGE, 0), 2)
        }
    }
    override fun codec(): MapCodec<out TrellisBlock> = CODEC
    override fun isValidBonemealTarget(
        levelReader: LevelReader,
        blockPos: BlockPos,
        blockState: BlockState
    ): Boolean {
        return !isBare(blockState) &&
            blockState.getValue<Int>(AGE) <4
    }

    override fun isBonemealSuccess(
        level: Level,
        randomSource: RandomSource,
        blockPos: BlockPos,
        blockState: BlockState
    ): Boolean {
        return true
    }

    override fun performBonemeal(
        serverLevel: ServerLevel,
        randomSource: RandomSource,
        blockPos: BlockPos,
        blockState: BlockState
    ) {
        val i = min(4, blockState.getValue<Int>(AGE) + 1)
        serverLevel.setBlock(blockPos, blockState.setValue<Int, Int>(AGE, i), 2)
    }
}


