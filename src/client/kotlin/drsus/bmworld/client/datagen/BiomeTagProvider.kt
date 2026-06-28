package drsus.bmworld.client.datagen

import drsus.bmworld.BogusMogusWorld
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.tags.BiomeTags
import net.minecraft.tags.TagKey
import net.minecraft.world.level.biome.Biome
import net.minecraft.world.level.biome.Biomes
import java.util.concurrent.CompletableFuture

class BiomeTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider<Biome>(
        output,
        Registries.BIOME,
        registriesFuture
    ){
    val SHALE_IRON_BIOMES: TagKey<Biome> =
        TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "iron_shale_biomes"))
    val SHALE_MAGNESIUM_BIOMES: TagKey<Biome> =
        TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "magnesium_shale_biomes"))
    val SHALE_FOSSIL_BIOMES: TagKey<Biome> =
        TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "fossil_shale_biomes"))
    val SHALE_COBALT_BIOMES: TagKey<Biome> =
        TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "cobalt_shale_biomes"))
    val YELLOW_BRICKEARTH_BIOMES: TagKey<Biome> =
            TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "yellow_brickearth_biomes"))
    val SEA_MOSS_GROWABLE_IN: TagKey<Biome> =
        TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "sea_moss_growable_in"))



    override fun addTags(wrapperLookup: HolderLookup.Provider) {
        builder(SHALE_IRON_BIOMES)
            .add(Biomes.FOREST)
            .add(Biomes.BIRCH_FOREST)
            .add(Biomes.FLOWER_FOREST)
            .add(Biomes.OLD_GROWTH_BIRCH_FOREST)
            .add(Biomes.WINDSWEPT_FOREST)
            .add(Biomes.DARK_FOREST)
            .add(Biomes.PLAINS)
            .setReplace(true)
        builder(SHALE_MAGNESIUM_BIOMES)
            .forceAddTag(BiomeTags.IS_OCEAN)
            .setReplace(true)
        builder(SHALE_FOSSIL_BIOMES)
            .forceAddTag(BiomeTags.IS_BADLANDS)
            .forceAddTag(BiomeTags.IS_TAIGA)
            .forceAddTag(BiomeTags.IS_MOUNTAIN)
            .add(Biomes.DEEP_DARK)
            .setReplace(true)
        builder(SHALE_COBALT_BIOMES)
            .forceAddTag(BiomeTags.IS_SAVANNA)
            .forceAddTag(BiomeTags.IS_JUNGLE)
            .add(Biomes.DESERT)
            .add(Biomes.DRIPSTONE_CAVES)
            .add(Biomes.LUSH_CAVES)
            .setReplace(true)
        builder(YELLOW_BRICKEARTH_BIOMES)
            .forceAddTag(BiomeTags.IS_RIVER)
            .setReplace(true)
        builder(SEA_MOSS_GROWABLE_IN)
            .add(Biomes.OCEAN)
            .add(Biomes.WARM_OCEAN)
            .add(Biomes.LUKEWARM_OCEAN)
            .add(Biomes.DEEP_LUKEWARM_OCEAN)
            .add(Biomes.BEACH)
            .setReplace(true)
        }
    override fun getName(): String {
        return "BiomeTagProvider"
    }
}