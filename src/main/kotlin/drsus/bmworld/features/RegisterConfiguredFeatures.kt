package drsus.bmworld.features

import drsus.bmworld.BogusMogusWorld
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature

object RegisterConfiguredFeatures {
    fun createKey(string: String): ResourceKey<ConfiguredFeature<*, *>> {
        return ResourceKey.create<ConfiguredFeature<*, *>>(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, string)
        )
    }
    fun initialize(){}
    // CONFIGURED FEATURE
    val ORE_IRON_SHALE: ResourceKey<ConfiguredFeature<*, *>> = createKey("ore_iron_shale")
    val ORE_MAGNESIUM_SHALE: ResourceKey<ConfiguredFeature<*, *>> = createKey("ore_magnesium_shale")
    val ORE_FOSSIL_SHALE: ResourceKey<ConfiguredFeature<*, *>> = createKey("ore_fossil_shale")
    val ORE_COBALT_SHALE: ResourceKey<ConfiguredFeature<*, *>> = createKey("ore_cobalt_shale")
    val ORE_YELLOW_BRICKEARTH: ResourceKey<ConfiguredFeature<*, *>> = createKey("ore_yellow_brickearth")

}