package drsus.bmworld.features
import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.tags.allModTags.SHALE_IRON_BIOMES
import drsus.bmworld.tags.allModTags.SHALE_FOSSIL_BIOMES
import drsus.bmworld.tags.allModTags.SHALE_COBALT_BIOMES
import drsus.bmworld.tags.allModTags.SHALE_MAGNESIUM_BIOMES
import drsus.bmworld.tags.allModTags.YELLOW_BRICKEARTH_BIOMES

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.tags.TagKey
import net.minecraft.world.level.biome.Biome
import net.minecraft.world.level.levelgen.GenerationStep
import net.minecraft.world.level.levelgen.placement.PlacedFeature
import java.util.function.Predicate



object BiomeModification {
    var biomeSelector: Predicate<BiomeSelectionContext> = BiomeSelectors.foundInOverworld()

    fun newOreInBiome(biomeTag: TagKey<Biome>, feature: ResourceKey<PlacedFeature>){

        biomeSelector = BiomeSelectors.tag(biomeTag)
        BiomeModifications.addFeature(
            biomeSelector,
            GenerationStep.Decoration.UNDERGROUND_ORES,
            feature
        )
        BogusMogusWorld.logger.info("Adding " + feature.registry().namespace)
    }
    fun initialize() {
        newOreInBiome(SHALE_IRON_BIOMES, RegisterPlacedFeatures.ORE_IRON_SHALE)
        newOreInBiome(SHALE_FOSSIL_BIOMES, RegisterPlacedFeatures.ORE_FOSSIL_SHALE)
        newOreInBiome(SHALE_COBALT_BIOMES, RegisterPlacedFeatures.ORE_COBALT_SHALE)
        newOreInBiome(SHALE_MAGNESIUM_BIOMES, RegisterPlacedFeatures.ORE_MAGNESIUM_SHALE)
        newOreInBiome(YELLOW_BRICKEARTH_BIOMES, RegisterPlacedFeatures.ORE_YELLOW_BRICKEARTH)

    }
}
