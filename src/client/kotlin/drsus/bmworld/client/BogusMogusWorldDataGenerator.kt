package drsus.bmworld.client

import drsus.bmworld.client.datagen.BiomeTagProvider
import drsus.bmworld.client.datagen.BlockLootTableProvider
import drsus.bmworld.client.datagen.BlockTagProvider
import drsus.bmworld.client.datagen.ItemTagProvider
import drsus.bmworld.client.datagen.LanguageEnglishProvider
import drsus.bmworld.client.datagen.ModelProvider
import drsus.bmworld.client.datagen.RecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

object BogusMogusWorldDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()
        pack.addProvider(::RecipeProvider);
        pack.addProvider(::LanguageEnglishProvider);
        pack.addProvider(::ModelProvider);
        pack.addProvider(::BlockTagProvider);
        pack.addProvider(::ItemTagProvider);

        pack.addProvider(::BlockLootTableProvider);
        pack.addProvider(::BiomeTagProvider)



    }
}