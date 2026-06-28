package drsus.bmworld.items

import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.blocks.ModBlocks
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.component.Consumable
import net.minecraft.world.item.component.Consumables
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect
import java.util.List
import java.util.function.Supplier


object ModItems {
    val CUSTOM_CREATIVE_BLOCK_TAB_KEY: ResourceKey<CreativeModeTab> = ResourceKey.create<CreativeModeTab>(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "creative_tab_blocks")
    )
    val BOGUS_MOGUS_WORLD_BLOCK_CREATIVE_TAB: CreativeModeTab = FabricItemGroup.builder()
        .icon(Supplier { ItemStack(ModBlocks.SHALE_IRON) })
        .title(Component.translatable("itemGroup." + BogusMogusWorld.mod_id + ".blocks"))
        .displayItems(DisplayItemsGenerator { params: ItemDisplayParameters?, output: CreativeModeTab.Output? ->
        })
        .build()
    val CUSTOM_CREATIVE_ITEM_TAB_KEY: ResourceKey<CreativeModeTab> = ResourceKey.create<CreativeModeTab>(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "creative_tab")
    )
    val BOGUS_MOGUS_WORLD_ITEM_CREATIVE_TAB: CreativeModeTab = FabricItemGroup.builder()
        .icon(Supplier { ItemStack(ModItems.GRAPES) })
        .title(Component.translatable("itemGroup." + BogusMogusWorld.mod_id + ".items"))
        .displayItems(DisplayItemsGenerator { params: ItemDisplayParameters?, output: CreativeModeTab.Output? ->
        })
        .build()


    fun <T : Item> register(
        name: String,
        itemFactory: (properties: Item.Properties) -> T,
        settings: Item.Properties
    ): T {
        // Create the item key.
        val itemKey: ResourceKey<Item> =
            ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, name))

        // Create the item instance.
        val item: T = itemFactory(settings.setId(itemKey))

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item)

        return item
    }

    fun initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModItems.CUSTOM_CREATIVE_BLOCK_TAB_KEY, ModItems.BOGUS_MOGUS_WORLD_BLOCK_CREATIVE_TAB);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModItems.CUSTOM_CREATIVE_ITEM_TAB_KEY, ModItems.BOGUS_MOGUS_WORLD_ITEM_CREATIVE_TAB);

        CompostingChanceRegistry.INSTANCE.add(ModItems.GRAPES, 0.1f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.IVY, 0.1f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.SEA_MOSS, 0.2f);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_CREATIVE_ITEM_TAB_KEY)
            .register(ModifyEntries { itemGroup: FabricItemGroupEntries? ->
                itemGroup!!.accept(GRAPES)
                itemGroup.accept(IVY)
                itemGroup.accept(SEA_MOSS)
            })

    }


    val GRAPES: Item =
        register("grapes",
            { properties: Item.Properties? -> Item(properties!!) },
            Item.Properties()
                .food(FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build()))

    val IVY: Item =
        register("ivy",
            { properties: Item.Properties? -> Item(properties!!) },
            Item.Properties()
                .food(FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).alwaysEdible().build(),
                    ModConsumables.IVY))
    val SEA_MOSS: Item =
        register("sea_moss",
            { properties: Item.Properties? -> Item(properties!!) },
            Item.Properties()
                .food(FoodProperties.Builder().nutrition(3).saturationModifier(0.2F).build()))

}
