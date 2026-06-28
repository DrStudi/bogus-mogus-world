package drsus.bmworld.client.datagen

import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.blocks.ModBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.data.tags.TagAppender
import net.minecraft.resources.Identifier
import net.minecraft.tags.BlockTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import java.util.concurrent.CompletableFuture


class BlockTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    val SHALES: TagKey<Block> =
        TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "shale"))
    val SHALES_BLOCK: TagKey<Block> =
        TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "shale_block"))
    val SHALE_MAGNESIUM_REPLACABLE: TagKey<Block> =
        TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "magnesium_shale_replaceable"))
    val BRICKEARTH_REPLACABLE: TagKey<Block> =
        TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "brickearth_replaceable"))
    val TRELLIS: TagKey<Block> =
        TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "trellis"))



    override fun addTags(wrapperLookup: HolderLookup.Provider) {
        valueLookupBuilder(SHALES_BLOCK)
                .add(ModBlocks.SHALE_IRON)
                .add(ModBlocks.SHALE_COBALT)
                .add(ModBlocks.SHALE_FOSSIL)
                .add(ModBlocks.SHALE_MAGNESIUM)
        valueLookupBuilder(SHALES)
                .add(ModBlocks.SHALE_IRON)
                .add(ModBlocks.SHALE_IRON_STAIRS)
                .add(ModBlocks.SHALE_IRON_SLAB)
                .add(ModBlocks.SHALE_IRON_WALL)
                .add(ModBlocks.SHALE_COBALT)
                .add(ModBlocks.SHALE_COBALT_STAIRS)
                .add(ModBlocks.SHALE_COBALT_SLAB)
                .add(ModBlocks.SHALE_COBALT_WALL)
                .add(ModBlocks.SHALE_FOSSIL)
                .add(ModBlocks.SHALE_FOSSIL_STAIRS)
                .add(ModBlocks.SHALE_FOSSIL_SLAB)
                .add(ModBlocks.SHALE_FOSSIL_WALL)
                .add(ModBlocks.SHALE_MAGNESIUM)
                .add(ModBlocks.SHALE_MAGNESIUM_STAIRS)
                .add(ModBlocks.SHALE_MAGNESIUM_SLAB)
                .add(ModBlocks.SHALE_MAGNESIUM_WALL)
                .setReplace(true)
        valueLookupBuilder(SHALE_MAGNESIUM_REPLACABLE)
            .add(Blocks.SAND)
            .add(Blocks.GRAVEL)
            .add(Blocks.DIRT)
            .setReplace(true)
        valueLookupBuilder(BRICKEARTH_REPLACABLE)
            .add(Blocks.SAND)
            .add(Blocks.GRAVEL)
            .add(Blocks.DIRT)
            .setReplace(true)
        valueLookupBuilder(TRELLIS)
            .add(ModBlocks.OAK_TRELLIS)
            .setReplace(true)


            // VANILLA
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .addTag(SHALES)
            .add(ModBlocks.SHALE_IRON_GLAZED)
            .add(ModBlocks.SHALE_IRON_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_IRON_SLAB)
            .add(ModBlocks.SHALE_IRON_GLAZED_WALL)
            .add(ModBlocks.SHALE_COBALT_GLAZED)
            .add(ModBlocks.SHALE_COBALT_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_COBALT_GLAZED_SLAB)
            .add(ModBlocks.SHALE_COBALT_GLAZED_WALL)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_SLAB)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_WALL)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_SLAB)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_WALL)
            .add(ModBlocks.SHALE_IRON_BRICKS)
            .add(ModBlocks.SHALE_IRON_BRICK_STAIRS)
            .add(ModBlocks.SHALE_IRON_SLAB)
            .add(ModBlocks.SHALE_IRON_BRICK_WALL)
            .add(ModBlocks.SHALE_COBALT_BRICKS)
            .add(ModBlocks.SHALE_COBALT_BRICK_STAIRS)
            .add(ModBlocks.SHALE_COBALT_BRICK_SLAB)
            .add(ModBlocks.SHALE_COBALT_BRICK_WALL)
            .add(ModBlocks.SHALE_FOSSIL_BRICKS)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_STAIRS)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_SLAB)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_WALL)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICKS)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_STAIRS)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_SLAB)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_WALL)
            .add(ModBlocks.SHALE_IRON_PILLAR)
            .add(ModBlocks.SHALE_COBALT_PILLAR)
            .add(ModBlocks.SHALE_FOSSIL_PILLAR)
            .add(ModBlocks.SHALE_MAGNESIUM_PILLAR)
            .add(ModBlocks.YELLOW_STOCK_BRICKS)
            .add(ModBlocks.YELLOW_STOCK_BRICK_SLAB)
            .add(ModBlocks.YELLOW_STOCK_BRICK_STAIRS)
            .add(ModBlocks.YELLOW_STOCK_BRICK_WALL)
            .add(ModBlocks.YELLOW_STOCK_BRICKS_CHISELED)
            .add(ModBlocks.YELLOW_STOCK_TILES)
            .add(ModBlocks.YELLOW_STOCK_TILE_SLAB)
            .add(ModBlocks.YELLOW_STOCK_TILE_STAIRS)
            .add(ModBlocks.YELLOW_STOCK_TILE_WALL)
            .setReplace(false);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(ModBlocks.YELLOW_BRICKEARTH)
            .add(ModBlocks.YELLOW_BRICKEARTH_SLAB)
            .add(ModBlocks.YELLOW_BRICKEARTH_STAIRS)
            .add(ModBlocks.YELLOW_BRICKEARTH_WALL)
            .setReplace(false);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
            .addTag(TRELLIS)
            .setReplace(false);

        valueLookupBuilder(BlockTags.FENCES)
            .addTag(TRELLIS)
            .setReplace(false);
        valueLookupBuilder(BlockTags.WOODEN_FENCES)
            .addTag(TRELLIS)
            .setReplace(false);

        valueLookupBuilder(BlockTags.STAIRS)
            .add(ModBlocks.SHALE_IRON_STAIRS)
            .add(ModBlocks.SHALE_IRON_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_IRON_BRICK_STAIRS)
            .add(ModBlocks.SHALE_COBALT_STAIRS)
            .add(ModBlocks.SHALE_COBALT_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_COBALT_BRICK_STAIRS)
            .add(ModBlocks.SHALE_FOSSIL_STAIRS)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_STAIRS)
            .add(ModBlocks.SHALE_MAGNESIUM_STAIRS)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_STAIRS)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_STAIRS)
            .add(ModBlocks.YELLOW_STOCK_BRICK_STAIRS)
            .add(ModBlocks.YELLOW_STOCK_TILE_STAIRS)
            .add(ModBlocks.YELLOW_BRICKEARTH_STAIRS)

            .setReplace(false);
        valueLookupBuilder(BlockTags.SLABS)
            .add(ModBlocks.SHALE_IRON_SLAB)
            .add(ModBlocks.SHALE_IRON_GLAZED_SLAB)
            .add(ModBlocks.SHALE_IRON_BRICK_SLAB)
            .add(ModBlocks.SHALE_COBALT_SLAB)
            .add(ModBlocks.SHALE_COBALT_GLAZED_SLAB)
            .add(ModBlocks.SHALE_COBALT_BRICK_SLAB)
            .add(ModBlocks.SHALE_FOSSIL_SLAB)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_SLAB)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_SLAB)
            .add(ModBlocks.SHALE_MAGNESIUM_SLAB)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_SLAB)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_SLAB)
            .add(ModBlocks.YELLOW_STOCK_BRICK_SLAB)
            .add(ModBlocks.YELLOW_BRICKEARTH_SLAB)
            .add(ModBlocks.YELLOW_STOCK_TILE_SLAB)

            .setReplace(false);
        valueLookupBuilder(BlockTags.WALLS)
            .add(ModBlocks.SHALE_IRON_WALL)
            .add(ModBlocks.SHALE_IRON_GLAZED_WALL)
            .add(ModBlocks.SHALE_IRON_BRICK_WALL)
            .add(ModBlocks.SHALE_COBALT_WALL)
            .add(ModBlocks.SHALE_COBALT_GLAZED_WALL)
            .add(ModBlocks.SHALE_COBALT_BRICK_WALL)
            .add(ModBlocks.SHALE_FOSSIL_WALL)
            .add(ModBlocks.SHALE_FOSSIL_GLAZED_WALL)
            .add(ModBlocks.SHALE_FOSSIL_BRICK_WALL)
            .add(ModBlocks.SHALE_MAGNESIUM_WALL)
            .add(ModBlocks.SHALE_MAGNESIUM_GLAZED_WALL)
            .add(ModBlocks.SHALE_MAGNESIUM_BRICK_WALL)
            .add(ModBlocks.YELLOW_STOCK_BRICK_WALL)
            .add(ModBlocks.YELLOW_BRICKEARTH_WALL)
            .add(ModBlocks.YELLOW_STOCK_TILE_WALL)
            .addTag(TRELLIS)


            .setReplace(false);
        valueLookupBuilder(BlockTags.AZALEA_ROOT_REPLACEABLE)
                .addTag(SHALES_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .addTag(SHALES_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.BATS_SPAWNABLE_ON)
                .addTag(SHALES_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.DRIPSTONE_REPLACEABLE)
            .addTag(SHALES_BLOCK)
            .setReplace(false);
        valueLookupBuilder(BlockTags.LUSH_GROUND_REPLACEABLE)
                .addTag(SHALES_BLOCK)
                .setReplace(false);
        valueLookupBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
            .addTag(SHALES_BLOCK)
            .setReplace(false);
        valueLookupBuilder(BlockTags.NETHER_CARVER_REPLACEABLES)
            .addTag(SHALES_BLOCK)
            .setReplace(false);
        valueLookupBuilder(BlockTags.STONE_ORE_REPLACEABLES)
            .addTag(SHALES_BLOCK)
            .setReplace(false);
        valueLookupBuilder(BlockTags.SNAPS_GOAT_HORN)
                .addTag(SHALES_BLOCK)
                .setReplace(false);
        }


    override fun getName(): String {
        return "BlockTagProvider"
    }
}