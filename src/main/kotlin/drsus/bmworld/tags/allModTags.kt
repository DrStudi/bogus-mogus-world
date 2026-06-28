package drsus.bmworld.tags

import drsus.bmworld.BogusMogusWorld
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.biome.Biome

object allModTags {
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

    val CONTAINS_IRON: TagKey<Item> =
        TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "contains_iron"))

}