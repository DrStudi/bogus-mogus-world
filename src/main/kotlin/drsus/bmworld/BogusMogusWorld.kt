package drsus.bmworld

import drsus.bmworld.blocks.ModBlocks
import drsus.bmworld.effects.ModMobEffects
import drsus.bmworld.entities.ModEntityTypes
import drsus.bmworld.features.BiomeModification
import drsus.bmworld.features.RegisterConfiguredFeatures
import drsus.bmworld.features.RegisterPlacedFeatures
import drsus.bmworld.items.ItemComponents
import drsus.bmworld.items.ModItems
import drsus.bmworld.items.loot_table.ModLootTables
import net.fabricmc.api.ModInitializer
import net.minecraft.data.registries.VanillaRegistries
import net.minecraft.world.level.biome.Biome
import org.slf4j.LoggerFactory

object BogusMogusWorld : ModInitializer {
    val logger = LoggerFactory.getLogger("bogusmogus_world")
    val mod_id = "bogusmogus_world"
    val vanillaRegistryLookup = VanillaRegistries.createLookup()

    override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
        ModEntityTypes.registerAttributes()
        ModItems.initialize()
        ModBlocks.initialize()
        ItemComponents.initialize()
        ModMobEffects.initialize()
        RegisterConfiguredFeatures.initialize()
        RegisterPlacedFeatures.initialize()
        BiomeModification.initialize()
        ModLootTables.initialize()


    }
}