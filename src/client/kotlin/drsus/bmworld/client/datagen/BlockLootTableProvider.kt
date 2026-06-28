package drsus.bmworld.client.datagen

import drsus.bmworld.blocks.ModBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.HolderLookup
import net.minecraft.data.tags.BlockItemTagsProvider
import net.minecraft.world.level.levelgen.blockpredicates.MatchingBlockTagPredicate
import java.util.concurrent.CompletableFuture


class BlockLootTableProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<HolderLookup.Provider>
) : FabricBlockLootTableProvider(dataOutput, registryLookup) {
    override fun generate() {
        dropSelf(ModBlocks.SHALE_IRON)
        dropSelf(ModBlocks.SHALE_IRON_STAIRS)
        dropSelf(ModBlocks.SHALE_IRON_SLAB)
        dropSelf(ModBlocks.SHALE_IRON_WALL)
        dropSelf(ModBlocks.SHALE_COBALT)
        dropSelf(ModBlocks.SHALE_COBALT_STAIRS)
        dropSelf(ModBlocks.SHALE_COBALT_SLAB)
        dropSelf(ModBlocks.SHALE_COBALT_WALL)
        dropSelf(ModBlocks.SHALE_FOSSIL)
        dropSelf(ModBlocks.SHALE_FOSSIL_STAIRS)
        dropSelf(ModBlocks.SHALE_FOSSIL_SLAB)
        dropSelf(ModBlocks.SHALE_FOSSIL_WALL)
        dropSelf(ModBlocks.SHALE_MAGNESIUM)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_STAIRS)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_SLAB)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_WALL)
        dropSelf(ModBlocks.SHALE_IRON_GLAZED)
        dropSelf(ModBlocks.SHALE_IRON_GLAZED_STAIRS)
        dropSelf(ModBlocks.SHALE_IRON_SLAB)
        dropSelf(ModBlocks.SHALE_IRON_GLAZED_WALL)
        dropSelf(ModBlocks.SHALE_COBALT_GLAZED)
        dropSelf(ModBlocks.SHALE_COBALT_GLAZED_STAIRS)
        dropSelf(ModBlocks.SHALE_COBALT_GLAZED_SLAB)
        dropSelf(ModBlocks.SHALE_COBALT_GLAZED_WALL)
        dropSelf(ModBlocks.SHALE_FOSSIL_GLAZED)
        dropSelf(ModBlocks.SHALE_FOSSIL_GLAZED_STAIRS)
        dropSelf(ModBlocks.SHALE_FOSSIL_GLAZED_SLAB)
        dropSelf(ModBlocks.SHALE_FOSSIL_GLAZED_WALL)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_GLAZED)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_GLAZED_STAIRS)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_GLAZED_SLAB)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_GLAZED_WALL)
        dropSelf(ModBlocks.SHALE_IRON_BRICKS)
        dropSelf(ModBlocks.SHALE_IRON_BRICK_STAIRS)
        dropSelf(ModBlocks.SHALE_IRON_SLAB)
        dropSelf(ModBlocks.SHALE_IRON_BRICK_WALL)
        dropSelf(ModBlocks.SHALE_COBALT_BRICKS)
        dropSelf(ModBlocks.SHALE_COBALT_BRICK_STAIRS)
        dropSelf(ModBlocks.SHALE_COBALT_BRICK_SLAB)
        dropSelf(ModBlocks.SHALE_COBALT_BRICK_WALL)
        dropSelf(ModBlocks.SHALE_FOSSIL_BRICKS)
        dropSelf(ModBlocks.SHALE_FOSSIL_BRICK_STAIRS)
        dropSelf(ModBlocks.SHALE_FOSSIL_BRICK_SLAB)
        dropSelf(ModBlocks.SHALE_FOSSIL_BRICK_WALL)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_BRICKS)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_BRICK_STAIRS)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_BRICK_SLAB)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_BRICK_WALL)
        dropSelf(ModBlocks.SHALE_IRON_PILLAR)
        dropSelf(ModBlocks.SHALE_COBALT_PILLAR)
        dropSelf(ModBlocks.SHALE_FOSSIL_PILLAR)
        dropSelf(ModBlocks.SHALE_MAGNESIUM_PILLAR)
        dropSelf(ModBlocks.YELLOW_STOCK_BRICKS)
        dropSelf(ModBlocks.YELLOW_STOCK_BRICK_STAIRS)
        dropSelf(ModBlocks.YELLOW_STOCK_BRICK_SLAB)
        dropSelf(ModBlocks.YELLOW_STOCK_BRICK_WALL)
        dropSelf(ModBlocks.YELLOW_STOCK_BRICKS_CHISELED)
        dropSelf(ModBlocks.YELLOW_STOCK_TILES)
        dropSelf(ModBlocks.YELLOW_STOCK_TILE_STAIRS)
        dropSelf(ModBlocks.YELLOW_STOCK_TILE_SLAB)
        dropSelf(ModBlocks.YELLOW_STOCK_TILE_WALL)
        dropSelf(ModBlocks.YELLOW_BRICKEARTH)
        dropSelf(ModBlocks.YELLOW_BRICKEARTH_STAIRS)
        dropSelf(ModBlocks.YELLOW_BRICKEARTH_SLAB)
        dropSelf(ModBlocks.YELLOW_BRICKEARTH_WALL)
        dropSelf(ModBlocks.OAK_TRELLIS)

    }
}