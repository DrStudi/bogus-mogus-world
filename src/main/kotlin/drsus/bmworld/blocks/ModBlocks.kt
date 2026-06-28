package drsus.bmworld.blocks


import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.items.ModItems
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument
import net.minecraft.world.level.material.MapColor


object ModBlocks {
    private fun register(
        name: String,
        blockFactory: (properties: BlockBehaviour.Properties) -> Block,
        settings: BlockBehaviour.Properties,
        shouldRegisterItem: Boolean
    ): Block {
        val blockKey = keyOfBlock(name)
        val block: Block = blockFactory(settings.setId(blockKey))
        if (shouldRegisterItem) {
            val itemKey = keyOfItem(name)
            val blockItem = BlockItem(block, Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
            Registry.register<Item, BlockItem>(BuiltInRegistries.ITEM, itemKey, blockItem)
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block)
    }
    private fun registerTrellis(
        name: String,
        blockFactory: (properties: BlockBehaviour.Properties) -> TrellisBlock,
        settings: BlockBehaviour.Properties,
        shouldRegisterItem: Boolean
    ): Block {
        val blockKey = keyOfBlock(name)
        val block: Block = blockFactory(settings.setId(blockKey))

        if (shouldRegisterItem) {
            val itemKey = keyOfItem(name)

            val blockItem = BlockItem(block, Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
            Registry.register<Item, BlockItem>(BuiltInRegistries.ITEM, itemKey, blockItem)
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block)
    }
    private fun registerStairBlock(
        name: String,
        blockFactory: (properties: BlockBehaviour.Properties) -> StairBlock,
        settings: BlockBehaviour.Properties,
        shouldRegisterItem: Boolean
    ): Block {
        val blockKey = keyOfBlock(name)
        val block: Block = blockFactory(settings.setId(blockKey))

        if (shouldRegisterItem) {
            val itemKey = keyOfItem(name)

            val blockItem = BlockItem(block, Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
            Registry.register<Item, BlockItem>(BuiltInRegistries.ITEM, itemKey, blockItem)
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block)
    }
    private fun registerSlabBlock(
        name: String,
        blockFactory: (properties: BlockBehaviour.Properties) -> SlabBlock,
        settings: BlockBehaviour.Properties,
        shouldRegisterItem: Boolean
    ): Block {
        val blockKey = keyOfBlock(name)
        val block: Block = blockFactory(settings.setId(blockKey))

        if (shouldRegisterItem) {
            val itemKey = keyOfItem(name)

            val blockItem = BlockItem(block, Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
            Registry.register<Item, BlockItem>(BuiltInRegistries.ITEM, itemKey, blockItem)
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block)
    }
    private fun registerWallBlock(
        name: String,
        blockFactory: (properties: BlockBehaviour.Properties) -> WallBlock,
        settings: BlockBehaviour.Properties,
        shouldRegisterItem: Boolean
    ): Block {
        val blockKey = keyOfBlock(name)
        val block: Block = blockFactory(settings.setId(blockKey))

        if (shouldRegisterItem) {
            val itemKey = keyOfItem(name)

            val blockItem = BlockItem(block, Item.Properties().setId(itemKey).useBlockDescriptionPrefix())
            Registry.register<Item, BlockItem>(BuiltInRegistries.ITEM, itemKey, blockItem)
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block)
    }
    fun initialize() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_TRELLIS,5,20);

        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_CREATIVE_BLOCK_TAB_KEY)
            .register(ModifyEntries { itemGroup: FabricItemGroupEntries? ->
                // IRON SHALE
                itemGroup?.accept(SHALE_IRON.asItem())
                itemGroup?.accept(SHALE_IRON_STAIRS.asItem())
                itemGroup?.accept(SHALE_IRON_SLAB.asItem())
                itemGroup?.accept(SHALE_IRON_WALL.asItem())
                itemGroup?.accept(SHALE_IRON_GLAZED.asItem())
                itemGroup?.accept(SHALE_IRON_GLAZED_STAIRS.asItem())
                itemGroup?.accept(SHALE_IRON_GLAZED_SLAB.asItem())
                itemGroup?.accept(SHALE_IRON_GLAZED_WALL.asItem())
                itemGroup?.accept(SHALE_IRON_BRICKS.asItem())
                itemGroup?.accept(SHALE_IRON_PILLAR.asItem())
                itemGroup?.accept(SHALE_IRON_BRICK_STAIRS.asItem())
                itemGroup?.accept(SHALE_IRON_BRICK_SLAB.asItem())
                itemGroup?.accept(SHALE_IRON_BRICK_WALL.asItem())
                // COBALT SHALE
                itemGroup?.accept(SHALE_COBALT.asItem())
                itemGroup?.accept(SHALE_COBALT_STAIRS.asItem())
                itemGroup?.accept(SHALE_COBALT_SLAB.asItem())
                itemGroup?.accept(SHALE_COBALT_WALL.asItem())
                itemGroup?.accept(SHALE_COBALT_GLAZED.asItem())
                itemGroup?.accept(SHALE_COBALT_GLAZED_STAIRS.asItem())
                itemGroup?.accept(SHALE_COBALT_GLAZED_SLAB.asItem())
                itemGroup?.accept(SHALE_COBALT_GLAZED_WALL.asItem())
                itemGroup?.accept(SHALE_COBALT_BRICKS.asItem())
                itemGroup?.accept(SHALE_COBALT_PILLAR.asItem())
                itemGroup?.accept(SHALE_COBALT_BRICK_STAIRS.asItem())
                itemGroup?.accept(SHALE_COBALT_BRICK_SLAB.asItem())
                itemGroup?.accept(SHALE_COBALT_BRICK_WALL.asItem())
                // FOSSIL SHALE
                itemGroup?.accept(SHALE_FOSSIL.asItem())
                itemGroup?.accept(SHALE_FOSSIL_STAIRS.asItem())
                itemGroup?.accept(SHALE_FOSSIL_SLAB.asItem())
                itemGroup?.accept(SHALE_FOSSIL_WALL.asItem())
                itemGroup?.accept(SHALE_FOSSIL_GLAZED.asItem())
                itemGroup?.accept(SHALE_FOSSIL_GLAZED_STAIRS.asItem())
                itemGroup?.accept(SHALE_FOSSIL_GLAZED_SLAB.asItem())
                itemGroup?.accept(SHALE_FOSSIL_GLAZED_WALL.asItem())
                itemGroup?.accept(SHALE_FOSSIL_BRICKS.asItem())
                itemGroup?.accept(SHALE_FOSSIL_PILLAR.asItem())
                itemGroup?.accept(SHALE_FOSSIL_BRICK_STAIRS.asItem())
                itemGroup?.accept(SHALE_FOSSIL_BRICK_SLAB.asItem())
                itemGroup?.accept(SHALE_FOSSIL_BRICK_WALL.asItem())
                // MAGNESIUM SHALE
                itemGroup?.accept(SHALE_MAGNESIUM.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_STAIRS.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_SLAB.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_WALL.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_GLAZED.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_GLAZED_STAIRS.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_GLAZED_SLAB.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_GLAZED_WALL.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_BRICKS.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_PILLAR.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_BRICK_STAIRS.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_BRICK_SLAB.asItem())
                itemGroup?.accept(SHALE_MAGNESIUM_BRICK_WALL.asItem())
                // YELLOW STOCK BRICKS
                itemGroup?.accept(YELLOW_STOCK_BRICKS.asItem())
                itemGroup?.accept(YELLOW_STOCK_BRICK_STAIRS.asItem())
                itemGroup?.accept(YELLOW_STOCK_BRICK_SLAB.asItem())
                itemGroup?.accept(YELLOW_STOCK_BRICK_WALL.asItem())
                itemGroup?.accept(YELLOW_STOCK_BRICKS_CHISELED.asItem())
                itemGroup?.accept(YELLOW_STOCK_TILES.asItem())
                itemGroup?.accept(YELLOW_STOCK_TILE_STAIRS.asItem())
                itemGroup?.accept(YELLOW_STOCK_TILE_SLAB.asItem())
                itemGroup?.accept(YELLOW_STOCK_TILE_WALL.asItem())
                itemGroup?.accept(YELLOW_BRICKEARTH.asItem())
                itemGroup?.accept(YELLOW_BRICKEARTH_STAIRS.asItem())
                itemGroup?.accept(YELLOW_BRICKEARTH_SLAB.asItem())
                itemGroup?.accept(YELLOW_BRICKEARTH_WALL.asItem())

            })
    }
    private fun keyOfBlock(name: String): ResourceKey<Block> {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, name))
    }

    private fun keyOfItem(name: String): ResourceKey<Item> {
        return ResourceKey.create<Item>(Registries.ITEM, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, name))
    }
    val SHALE_COBALT: Block = register(
        "cobalt_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.ICE)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_COBALT_STAIRS: Block = registerStairBlock(
        "cobalt_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_COBALT.defaultBlockState(), properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_COBALT_SLAB: Block = registerSlabBlock(
        "cobalt_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_COBALT_WALL: Block = registerWallBlock(
        "cobalt_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_FOSSIL: Block = register(
        "fossil_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.TERRACOTTA_BLACK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_FOSSIL_STAIRS: Block = registerStairBlock(
        "fossil_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_FOSSIL.defaultBlockState(), properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_FOSSIL_SLAB: Block = registerSlabBlock(
        "fossil_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_FOSSIL_WALL: Block = registerWallBlock(
        "fossil_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_IRON: Block = register(
        "iron_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.RAW_IRON)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_IRON_STAIRS: Block = registerStairBlock(
        "iron_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_IRON.defaultBlockState(), properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_IRON_SLAB: Block = registerSlabBlock(
        "iron_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_IRON_WALL: Block = registerWallBlock(
        "iron_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_MAGNESIUM: Block = register(
        "magnesium_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_MAGNESIUM_STAIRS: Block = registerStairBlock(
        "magnesium_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_MAGNESIUM.defaultBlockState(), properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_MAGNESIUM_SLAB: Block = registerSlabBlock(
        "magnesium_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_MAGNESIUM_WALL: Block = registerWallBlock(
        "magnesium_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_COBALT_GLAZED: Block = register(
        "glazed_cobalt_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.ICE)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_COBALT_GLAZED_STAIRS: Block = registerStairBlock(
        "glazed_cobalt_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_COBALT_GLAZED.defaultBlockState(), properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_COBALT_GLAZED_SLAB: Block = registerSlabBlock(
        "glazed_cobalt_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_COBALT_GLAZED_WALL: Block = registerWallBlock(
        "glazed_cobalt_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_COBALT.properties(),
        true
    )
    val SHALE_COBALT_BRICKS: Block = register(
        "cobalt_shale_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.ICE)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_COBALT_BRICK_STAIRS: Block = registerStairBlock(
        "cobalt_shale_brick_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_COBALT_BRICKS.defaultBlockState(), properties)},
        SHALE_COBALT_BRICKS.properties(),
        true
    )
    val SHALE_COBALT_BRICK_SLAB: Block = registerSlabBlock(
        "cobalt_shale_brick_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_COBALT_BRICKS.properties(),
        true
    )
    val SHALE_COBALT_BRICK_WALL: Block = registerWallBlock(
        "cobalt_shale_brick_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_COBALT_BRICKS.properties(),
        true
    )
    val SHALE_COBALT_PILLAR: Block = register(
        "cobalt_shale_pillar",
        { properties: BlockBehaviour.Properties -> RotatedPillarBlock(properties)},
        SHALE_COBALT_BRICKS.properties(),
        true
    )
    val SHALE_FOSSIL_GLAZED: Block = register(
        "glazed_fossil_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.TERRACOTTA_BLACK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_FOSSIL_GLAZED_STAIRS: Block = registerStairBlock(
        "glazed_fossil_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_FOSSIL_GLAZED.defaultBlockState(), properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_FOSSIL_GLAZED_SLAB: Block = registerSlabBlock(
        "glazed_fossil_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_FOSSIL_GLAZED_WALL: Block = registerWallBlock(
        "glazed_fossil_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_FOSSIL.properties(),
        true
    )
    val SHALE_FOSSIL_BRICKS: Block = register(
        "fossil_shale_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.TERRACOTTA_BLACK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_FOSSIL_BRICK_STAIRS: Block = registerStairBlock(
        "fossil_shale_brick_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_FOSSIL_BRICKS.defaultBlockState(), properties)},
        SHALE_FOSSIL_BRICKS.properties(),
        true
    )
    val SHALE_FOSSIL_BRICK_SLAB: Block = registerSlabBlock(
        "fossil_shale_brick_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_FOSSIL_BRICKS.properties(),
        true
    )
    val SHALE_FOSSIL_BRICK_WALL: Block = registerWallBlock(
        "fossil_shale_brick_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_FOSSIL_BRICKS.properties(),
        true
    )
    val SHALE_FOSSIL_PILLAR: Block = register(
        "fossil_shale_pillar",
        { properties: BlockBehaviour.Properties -> RotatedPillarBlock(properties)},
        SHALE_FOSSIL_BRICKS.properties(),
        true
    )
    val SHALE_IRON_GLAZED: Block = register(
        "glazed_iron_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.RAW_IRON)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_IRON_GLAZED_STAIRS: Block = registerStairBlock(
        "glazed_iron_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_IRON_GLAZED.defaultBlockState(), properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_IRON_GLAZED_SLAB: Block = registerSlabBlock(
        "glazed_iron_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_IRON_GLAZED_WALL: Block = registerWallBlock(
        "glazed_iron_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_IRON.properties(),
        true
    )
    val SHALE_IRON_BRICKS: Block = register(
        "iron_shale_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.RAW_IRON)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_IRON_BRICK_STAIRS: Block = registerStairBlock(
        "iron_shale_brick_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_IRON_BRICKS.defaultBlockState(), properties)},
        SHALE_IRON_BRICKS.properties(),
        true
    )
    val SHALE_IRON_BRICK_SLAB: Block = registerSlabBlock(
        "iron_shale_brick_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_IRON_BRICKS.properties(),
        true
    )
    val SHALE_IRON_BRICK_WALL: Block = registerWallBlock(
        "iron_shale_brick_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_IRON_BRICKS.properties(),
        true
    )
    val SHALE_IRON_PILLAR: Block = register(
        "iron_shale_pillar",
        { properties: BlockBehaviour.Properties -> RotatedPillarBlock(properties)},
        SHALE_IRON_BRICKS.properties(),
        true
    )
    val SHALE_MAGNESIUM_GLAZED: Block = register(
        "glazed_magnesium_shale",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_MAGNESIUM_GLAZED_STAIRS: Block = registerStairBlock(
        "glazed_magnesium_shale_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_MAGNESIUM_GLAZED.defaultBlockState(), properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_MAGNESIUM_GLAZED_SLAB: Block = registerSlabBlock(
        "glazed_magnesium_shale_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_MAGNESIUM_GLAZED_WALL: Block = registerWallBlock(
        "glazed_magnesium_shale_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_MAGNESIUM.properties(),
        true
    )
    val SHALE_MAGNESIUM_BRICKS: Block = register(
        "magnesium_shale_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.STONE)
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val SHALE_MAGNESIUM_BRICK_STAIRS: Block = registerStairBlock(
        "magnesium_shale_brick_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(SHALE_MAGNESIUM_BRICKS.defaultBlockState(), properties)},
        SHALE_MAGNESIUM_BRICKS.properties(),
        true
    )
    val SHALE_MAGNESIUM_BRICK_SLAB: Block = registerSlabBlock(
        "magnesium_shale_brick_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        SHALE_MAGNESIUM_BRICKS.properties(),
        true
    )
    val SHALE_MAGNESIUM_BRICK_WALL: Block = registerWallBlock(
        "magnesium_shale_brick_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        SHALE_MAGNESIUM_BRICKS.properties(),
        true
    )
    val SHALE_MAGNESIUM_PILLAR: Block = register(
        "magnesium_shale_pillar",
        { properties: BlockBehaviour.Properties -> RotatedPillarBlock(properties)},
        SHALE_MAGNESIUM_BRICKS.properties(),
        true
    )
    val YELLOW_STOCK_BRICKS: Block = register(
        "yellow_stock_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.SAND)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val YELLOW_STOCK_BRICK_STAIRS: Block = registerStairBlock(
        "yellow_stock_brick_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(YELLOW_STOCK_BRICKS.defaultBlockState(), properties)},
        YELLOW_STOCK_BRICKS.properties(),
        true
    )
    val YELLOW_STOCK_BRICK_SLAB: Block = registerSlabBlock(
        "yellow_stock_brick_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        YELLOW_STOCK_BRICKS.properties(),
        true
    )
    val YELLOW_STOCK_BRICK_WALL: Block = registerWallBlock(
        "yellow_stock_brick_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        YELLOW_STOCK_BRICKS.properties(),
        true
    )
    val YELLOW_STOCK_BRICKS_CHISELED: Block = register(
        "chiseled_yellow_stock_bricks",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.SAND)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val YELLOW_STOCK_TILES: Block = register(
        "yellow_stock_tiles",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.SAND)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .strength(1.5F, 6.0F),
        true
    )
    val YELLOW_STOCK_TILE_STAIRS: Block = registerStairBlock(
        "yellow_stock_tile_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(YELLOW_STOCK_TILES.defaultBlockState(), properties)},
        YELLOW_STOCK_TILES.properties(),
        true
    )
    val YELLOW_STOCK_TILE_SLAB: Block = registerSlabBlock(
        "yellow_stock_tile_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        YELLOW_STOCK_TILES.properties(),
        true
    )
    val YELLOW_STOCK_TILE_WALL: Block = registerWallBlock(
        "yellow_stock_tile_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        YELLOW_STOCK_TILES.properties(),
        true
    )
    val YELLOW_BRICKEARTH: Block = register(
        "yellow_brickearth",
        { properties: BlockBehaviour.Properties -> Block(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .mapColor(MapColor.SAND)
            .instrument(NoteBlockInstrument.HARP)
            .strength(0.6f),
        true
    )
    val YELLOW_BRICKEARTH_STAIRS: Block = registerStairBlock(
        "yellow_brickearth_stairs",
        { properties: BlockBehaviour.Properties -> StairBlock(YELLOW_BRICKEARTH.defaultBlockState(), properties)},
        YELLOW_BRICKEARTH.properties(),
        true
    )
    val YELLOW_BRICKEARTH_SLAB: Block = registerSlabBlock(
        "yellow_brickearth_slab",
        { properties: BlockBehaviour.Properties -> SlabBlock(properties)},
        YELLOW_BRICKEARTH.properties(),
        true
    )
    val YELLOW_BRICKEARTH_WALL: Block = registerWallBlock(
        "yellow_brickearth_wall",
        { properties: BlockBehaviour.Properties -> WallBlock(properties)},
        YELLOW_BRICKEARTH.properties(),
        true
    )
    val OAK_TRELLIS: Block = registerTrellis(
        "oak_trellis",
        { properties: BlockBehaviour.Properties -> TrellisBlock(properties)},
        BlockBehaviour.Properties.of()
            .sound(SoundType.WOOD)
            .mapColor(MapColor.WOOD)
            .instrument(NoteBlockInstrument.HARP)
            .noOcclusion()
            .forceSolidOn()
            .randomTicks()
            .isViewBlocking(Blocks::never)
            .strength(0.6f),
        true
    )
}