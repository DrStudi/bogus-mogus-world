package drsus.bmworld.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import java.util.concurrent.CompletableFuture


class RecipeProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricRecipeProvider(output, registriesFuture) {
    override fun createRecipeProvider(registryLookup: HolderLookup.Provider, exporter: RecipeOutput): RecipeProvider {
        return object : RecipeProvider(registryLookup, exporter) {
            override fun buildRecipes() {
                val itemLookup = registries.lookupOrThrow<Item>(Registries.ITEM)
                shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DIRT) // You can also specify an int to produce more than one
                    .requires(Items.COARSE_DIRT) // You can also specify an int to require more than one, or a tag to accept multiple things
                    // Create an advancement that gives you the recipe
                    .unlockedBy(getHasName(Items.COARSE_DIRT), has(Items.COARSE_DIRT))
                    .save(output);
            }
        }
    }

    override fun getName(): String {
        return "RecipeProvider"
    }
}