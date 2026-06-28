package drsus.bmworld.client.datagen

import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.blocks.ModBlocks
import drsus.bmworld.items.ModItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.ItemTagProvider(output, registriesFuture) {
        val CONTAINS_IRON: TagKey<Item> =
        TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "contains_iron"))

    override fun addTags(wrapperLookup: HolderLookup.Provider) {
        valueLookupBuilder(CONTAINS_IRON)
            .add(ModBlocks.SHALE_IRON.asItem())
            .add(ModBlocks.SHALE_IRON_GLAZED.asItem())
            .add(Items.RAW_IRON)
            .setReplace(true)
        valueLookupBuilder(ItemTags.FOX_FOOD)
            .add(ModItems.GRAPES)
            .setReplace(false)
    }
}
