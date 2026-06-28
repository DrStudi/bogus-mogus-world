package drsus.bmworld.features

import drsus.bmworld.BogusMogusWorld
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.levelgen.placement.PlacedFeature

object RegisterPlacedFeatures {
    fun createKey(string: String): ResourceKey<PlacedFeature> {
        BogusMogusWorld.logger.info("Registering $string")
        return ResourceKey.create<PlacedFeature>(
            Registries.PLACED_FEATURE,
            Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, string)
        )
    }
    fun initialize(){}
    // CONFIGURED FEATURE
    val ORE_IRON_SHALE: ResourceKey<PlacedFeature> = createKey("ore_iron_shale")
    val ORE_MAGNESIUM_SHALE: ResourceKey<PlacedFeature> = createKey("ore_magnesium_shale")
    val ORE_FOSSIL_SHALE: ResourceKey<PlacedFeature> = createKey("ore_fossil_shale")
    val ORE_COBALT_SHALE: ResourceKey<PlacedFeature> = createKey("ore_cobalt_shale")
    val ORE_YELLOW_BRICKEARTH: ResourceKey<PlacedFeature> = createKey("ore_yellow_brickearth")

}