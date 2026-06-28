package drsus.bmworld.client.datagen

import drsus.bmworld.blocks.ModBlocks
import drsus.bmworld.items.ModItems
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.client.data.models.BlockModelGenerators
import net.minecraft.client.data.models.ItemModelGenerators
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator
import net.minecraft.client.data.models.model.ModelTemplate
import net.minecraft.client.data.models.model.ModelTemplates
import net.minecraft.client.data.models.model.TexturedModel


class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
        blockStateModelGenerator.family(ModBlocks.SHALE_COBALT)
            .stairs(ModBlocks.SHALE_COBALT_STAIRS)
            .slab(ModBlocks.SHALE_COBALT_SLAB)
            .wall(ModBlocks.SHALE_COBALT_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_COBALT_GLAZED)
            .stairs(ModBlocks.SHALE_COBALT_GLAZED_STAIRS)
            .slab(ModBlocks.SHALE_COBALT_GLAZED_SLAB)
            .wall(ModBlocks.SHALE_COBALT_GLAZED_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_FOSSIL)
            .stairs(ModBlocks.SHALE_FOSSIL_STAIRS)
            .slab(ModBlocks.SHALE_FOSSIL_SLAB)
            .wall(ModBlocks.SHALE_FOSSIL_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_FOSSIL_GLAZED)
            .stairs(ModBlocks.SHALE_FOSSIL_GLAZED_STAIRS)
            .slab(ModBlocks.SHALE_FOSSIL_GLAZED_SLAB)
            .wall(ModBlocks.SHALE_FOSSIL_GLAZED_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_IRON)
            .stairs(ModBlocks.SHALE_IRON_STAIRS)
            .slab(ModBlocks.SHALE_IRON_SLAB)
            .wall(ModBlocks.SHALE_IRON_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_IRON_GLAZED)
            .stairs(ModBlocks.SHALE_IRON_GLAZED_STAIRS)
            .slab(ModBlocks.SHALE_IRON_GLAZED_SLAB)
            .wall(ModBlocks.SHALE_IRON_GLAZED_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_MAGNESIUM)
            .stairs(ModBlocks.SHALE_MAGNESIUM_STAIRS)
            .slab(ModBlocks.SHALE_MAGNESIUM_SLAB)
            .wall(ModBlocks.SHALE_MAGNESIUM_WALL);
        blockStateModelGenerator.family(ModBlocks.SHALE_MAGNESIUM_GLAZED)
            .stairs(ModBlocks.SHALE_MAGNESIUM_GLAZED_STAIRS)
            .slab(ModBlocks.SHALE_MAGNESIUM_GLAZED_SLAB)
            .wall(ModBlocks.SHALE_MAGNESIUM_GLAZED_WALL);

        blockStateModelGenerator.family(ModBlocks.SHALE_COBALT_BRICKS)
            .stairs(ModBlocks.SHALE_COBALT_BRICK_STAIRS)
            .slab(ModBlocks.SHALE_COBALT_BRICK_SLAB)
            .wall(ModBlocks.SHALE_COBALT_BRICK_WALL);
        blockStateModelGenerator.createAxisAlignedPillarBlock(ModBlocks.SHALE_COBALT_PILLAR, TexturedModel.COLUMN_ALT);

        blockStateModelGenerator.family(ModBlocks.SHALE_FOSSIL_BRICKS)
            .stairs(ModBlocks.SHALE_FOSSIL_BRICK_STAIRS)
            .slab(ModBlocks.SHALE_FOSSIL_BRICK_SLAB)
            .wall(ModBlocks.SHALE_FOSSIL_BRICK_WALL);
        blockStateModelGenerator.createAxisAlignedPillarBlock(ModBlocks.SHALE_FOSSIL_PILLAR, TexturedModel.COLUMN_ALT);

        blockStateModelGenerator.family(ModBlocks.SHALE_IRON_BRICKS)
            .stairs(ModBlocks.SHALE_IRON_BRICK_STAIRS)
            .slab(ModBlocks.SHALE_IRON_BRICK_SLAB)
            .wall(ModBlocks.SHALE_IRON_BRICK_WALL);
        blockStateModelGenerator.createAxisAlignedPillarBlock(ModBlocks.SHALE_IRON_PILLAR, TexturedModel.COLUMN_ALT);

        blockStateModelGenerator.family(ModBlocks.SHALE_MAGNESIUM_BRICKS)
            .stairs(ModBlocks.SHALE_MAGNESIUM_BRICK_STAIRS)
            .slab(ModBlocks.SHALE_MAGNESIUM_BRICK_SLAB)
            .wall(ModBlocks.SHALE_MAGNESIUM_BRICK_WALL);
        blockStateModelGenerator.createAxisAlignedPillarBlock(ModBlocks.SHALE_MAGNESIUM_PILLAR, TexturedModel.COLUMN_ALT);

        blockStateModelGenerator.family(ModBlocks.YELLOW_STOCK_BRICKS)
            .stairs(ModBlocks.YELLOW_STOCK_BRICK_STAIRS)
            .slab(ModBlocks.YELLOW_STOCK_BRICK_SLAB)
            .wall(ModBlocks.YELLOW_STOCK_BRICK_WALL);
        blockStateModelGenerator.createTrivialCube(ModBlocks.YELLOW_STOCK_BRICKS_CHISELED)

        blockStateModelGenerator.family(ModBlocks.YELLOW_STOCK_TILES)
            .stairs(ModBlocks.YELLOW_STOCK_TILE_STAIRS)
            .slab(ModBlocks.YELLOW_STOCK_TILE_SLAB)
            .wall(ModBlocks.YELLOW_STOCK_TILE_WALL);

        blockStateModelGenerator.family(ModBlocks.YELLOW_BRICKEARTH)
            .stairs(ModBlocks.YELLOW_BRICKEARTH_STAIRS)
            .slab(ModBlocks.YELLOW_BRICKEARTH_SLAB)
            .wall(ModBlocks.YELLOW_BRICKEARTH_WALL);

    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(ModItems.GRAPES, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(ModItems.IVY, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(ModItems.SEA_MOSS, ModelTemplates.FLAT_ITEM)


    }

    override fun getName(): String {
        return "ModelProvider"
    }
}