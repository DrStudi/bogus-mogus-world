package drsus.bmworld.items.loot_table

import drsus.bmworld.BogusMogusWorld
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.storage.loot.BuiltInLootTables
import net.minecraft.world.level.storage.loot.LootTable

object ModLootTables {
    val LOCATIONS: MutableSet<ResourceKey<LootTable>> = HashSet()

    private fun register(string: String): ResourceKey<LootTable> {
        return register(
            ResourceKey.create<LootTable>(
                Registries.LOOT_TABLE,
                Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, string)
            )
        )
    }
    private fun register(resourceKey: ResourceKey<LootTable>): ResourceKey<LootTable> {
        if (LOCATIONS.add(resourceKey)) {
            return resourceKey
        } else {
            throw IllegalArgumentException(
                resourceKey.identifier().toString() + " is already a registered modded loot table"
            )
        }
    }
    val GRAPE_VINE: ResourceKey<LootTable> =
        register("harvest/grapevine")
    val IVY: ResourceKey<LootTable> =
        register("harvest/ivy")
    val SEA_MOSS: ResourceKey<LootTable> =
        register("harvest/sea_moss")
    fun initialize(){}
}
