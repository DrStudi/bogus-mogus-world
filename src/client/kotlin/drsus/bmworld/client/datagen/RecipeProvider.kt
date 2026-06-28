package drsus.bmworld.client.datagen

import drsus.bmworld.blocks.ModBlocks
import drsus.bmworld.tags.allModTags.CONTAINS_IRON
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.block.Blocks
import java.util.concurrent.CompletableFuture


class RecipeProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricRecipeProvider(output, registriesFuture) {
    override fun createRecipeProvider(registryLookup: HolderLookup.Provider, exporter: RecipeOutput): RecipeProvider {
        return object : RecipeProvider(registryLookup, exporter) {
            override fun buildRecipes() {
                fun stoneSetBuilder(base: ItemLike, wall: ItemLike, stairs: ItemLike, slab: ItemLike ){
                    wallBuilder(RecipeCategory.BUILDING_BLOCKS,wall, Ingredient.of(base))
                        .unlockedBy(getHasName(base), has(base))
                        .save(output);
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, wall, base, 1)
                    stairBuilder(stairs, Ingredient.of(base)) // Using a helper method!
                        .unlockedBy(getHasName(base), has(base))
                        .save(output);
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, stairs, base, 1)

                    slabBuilder(RecipeCategory.BUILDING_BLOCKS,slab, Ingredient.of(base)) // Using a helper method!
                        .unlockedBy(getHasName(base), has(base))
                        .save(output);
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, slab, base, 2)
                }
                fun pillarBuilder(base: ItemLike, pillar: ItemLike) {
                    shaped(RecipeCategory.BUILDING_BLOCKS, pillar, 2)
                        .pattern("s")
                        .pattern("s")
                        .define('s', base)
                        .group("multi_bench")
                        .unlockedBy(getHasName(base), has(base))
                        .save(output);
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, pillar, base, 1)

                }
                fun chiseledBrickBuilder(recipeCategory: RecipeCategory, chiseled_bricks: ItemLike, slab: ItemLike, brick: ItemLike) {
                    this.shaped(recipeCategory, chiseled_bricks, 1)
                        .define('#', slab)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy(getHasName(brick), this.has(brick))
                        .save(this.output)
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, chiseled_bricks, brick, 1)
                }
                fun brickBuilder(recipeCategory: RecipeCategory, bricks: ItemLike, base: ItemLike) {
                    this.shaped(recipeCategory, bricks, 4)
                        .define('#', base)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy(getHasName(base), this.has(base))
                        .save(this.output)
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, bricks, base, 1)

                }
                val itemLookup = registries.lookupOrThrow<Item>(Registries.ITEM)
                stairBuilder(Items.OAK_DOOR, Ingredient.of(Items.OAK_BUTTON)) // Using a helper method!
                    .unlockedBy(getHasName(Items.OAK_BUTTON), has(Items.OAK_BUTTON))
                    .save(output);
                brickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHALE_COBALT_BRICKS, ModBlocks.SHALE_COBALT)
                brickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHALE_IRON_BRICKS, ModBlocks.SHALE_IRON)
                brickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHALE_FOSSIL_BRICKS, ModBlocks.SHALE_FOSSIL)
                brickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHALE_MAGNESIUM_BRICKS, ModBlocks.SHALE_MAGNESIUM)

                pillarBuilder(ModBlocks.SHALE_COBALT_GLAZED, ModBlocks.SHALE_COBALT_PILLAR)
                pillarBuilder(ModBlocks.SHALE_IRON_GLAZED, ModBlocks.SHALE_IRON_PILLAR)
                pillarBuilder(ModBlocks.SHALE_FOSSIL_GLAZED, ModBlocks.SHALE_FOSSIL_PILLAR)
                pillarBuilder(ModBlocks.SHALE_MAGNESIUM_GLAZED, ModBlocks.SHALE_MAGNESIUM_PILLAR)


                smeltingResultFromBase(ModBlocks.SHALE_COBALT_GLAZED, ModBlocks.SHALE_COBALT)
                smeltingResultFromBase(ModBlocks.SHALE_IRON_GLAZED, ModBlocks.SHALE_IRON)
                smeltingResultFromBase(ModBlocks.SHALE_FOSSIL_GLAZED, ModBlocks.SHALE_FOSSIL)
                smeltingResultFromBase(ModBlocks.SHALE_MAGNESIUM_GLAZED, ModBlocks.SHALE_MAGNESIUM)

                smeltingResultFromBase(ModBlocks.YELLOW_STOCK_BRICKS, ModBlocks.YELLOW_BRICKEARTH)

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BRICKEARTH, 8)
                    .requires(ItemTags.COALS)
                    .requires(Blocks.CALCITE, 4)
                    .requires(CONTAINS_IRON)
                    .requires(CONTAINS_IRON)
                    .requires(CONTAINS_IRON)
                    .requires(CONTAINS_IRON)
                    .unlockedBy("has_contains_iron", has(CONTAINS_IRON))
                    .save(output)

                stoneSetBuilder(ModBlocks.YELLOW_STOCK_BRICKS,ModBlocks.YELLOW_STOCK_BRICK_WALL, ModBlocks.YELLOW_STOCK_BRICK_STAIRS, ModBlocks.YELLOW_STOCK_BRICK_SLAB)
                stoneSetBuilder(ModBlocks.YELLOW_BRICKEARTH,ModBlocks.YELLOW_BRICKEARTH_WALL, ModBlocks.YELLOW_BRICKEARTH_STAIRS, ModBlocks.YELLOW_BRICKEARTH_SLAB)
                chiseledBrickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STOCK_BRICKS_CHISELED, ModBlocks.YELLOW_STOCK_BRICK_SLAB,
                    ModBlocks.YELLOW_STOCK_BRICKS)
                stoneSetBuilder(ModBlocks.YELLOW_STOCK_TILES,ModBlocks.YELLOW_STOCK_TILE_WALL, ModBlocks.YELLOW_STOCK_TILE_STAIRS, ModBlocks.YELLOW_STOCK_TILE_SLAB)
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STOCK_TILE_SLAB, ModBlocks.YELLOW_STOCK_BRICKS, 2)
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STOCK_TILE_STAIRS, ModBlocks.YELLOW_STOCK_BRICKS, 1)
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STOCK_TILE_WALL, ModBlocks.YELLOW_STOCK_BRICKS, 1)

                brickBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_STOCK_TILES, ModBlocks.YELLOW_STOCK_BRICKS)

                stoneSetBuilder(ModBlocks.SHALE_COBALT,ModBlocks.SHALE_COBALT_WALL, ModBlocks.SHALE_COBALT_STAIRS, ModBlocks.SHALE_COBALT_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_COBALT_GLAZED,ModBlocks.SHALE_COBALT_GLAZED_WALL, ModBlocks.SHALE_COBALT_GLAZED_STAIRS, ModBlocks.SHALE_COBALT_GLAZED_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_COBALT_BRICKS,ModBlocks.SHALE_COBALT_BRICK_WALL, ModBlocks.SHALE_COBALT_BRICK_STAIRS, ModBlocks.SHALE_COBALT_BRICK_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_IRON,ModBlocks.SHALE_IRON_WALL, ModBlocks.SHALE_IRON_STAIRS, ModBlocks.SHALE_IRON_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_IRON_GLAZED,ModBlocks.SHALE_IRON_GLAZED_WALL, ModBlocks.SHALE_IRON_GLAZED_STAIRS, ModBlocks.SHALE_IRON_GLAZED_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_IRON_BRICKS,ModBlocks.SHALE_IRON_BRICK_WALL, ModBlocks.SHALE_IRON_BRICK_STAIRS, ModBlocks.SHALE_IRON_BRICK_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_FOSSIL,ModBlocks.SHALE_FOSSIL_WALL, ModBlocks.SHALE_FOSSIL_STAIRS, ModBlocks.SHALE_FOSSIL_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_FOSSIL_GLAZED,ModBlocks.SHALE_FOSSIL_GLAZED_WALL, ModBlocks.SHALE_FOSSIL_GLAZED_STAIRS, ModBlocks.SHALE_FOSSIL_GLAZED_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_FOSSIL_BRICKS,ModBlocks.SHALE_FOSSIL_BRICK_WALL, ModBlocks.SHALE_FOSSIL_BRICK_STAIRS, ModBlocks.SHALE_FOSSIL_BRICK_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_MAGNESIUM,ModBlocks.SHALE_MAGNESIUM_WALL, ModBlocks.SHALE_MAGNESIUM_STAIRS, ModBlocks.SHALE_MAGNESIUM_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_MAGNESIUM_GLAZED,ModBlocks.SHALE_MAGNESIUM_GLAZED_WALL, ModBlocks.SHALE_MAGNESIUM_GLAZED_STAIRS, ModBlocks.SHALE_MAGNESIUM_GLAZED_SLAB)
                stoneSetBuilder(ModBlocks.SHALE_MAGNESIUM_BRICKS,ModBlocks.SHALE_MAGNESIUM_BRICK_WALL, ModBlocks.SHALE_MAGNESIUM_BRICK_STAIRS, ModBlocks.SHALE_MAGNESIUM_BRICK_SLAB)
            }
        }
    }

    override fun getName(): String {
        return "RecipeProvider"
    }
}