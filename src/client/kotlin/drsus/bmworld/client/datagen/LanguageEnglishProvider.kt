package drsus.bmworld.client.datagen

import drsus.bmworld.BogusMogusWorld
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider.TranslationBuilder
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture


class LanguageEnglishProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<HolderLookup.Provider>
    ) : FabricLanguageProvider(dataOutput, "en_us", registryLookup) {
        override fun generateTranslations(holderLookup: HolderLookup.Provider, translationBuilder: TranslationBuilder) {
            generateTranslationBlockSetStone("cobalt_shale", "Cobalt Shale", translationBuilder)
            generateTranslationBlockSetStone("fossil_shale", "Fossil Shale", translationBuilder)
            generateTranslationBlockSetStone("iron_shale", "Iron Shale", translationBuilder)
            generateTranslationBlockSetStone("magnesium_shale", "Magnesium Shale", translationBuilder)

            generateTranslationBlockSetStone("glazed_cobalt_shale", "Glazed Cobalt Shale", translationBuilder)
            generateTranslationBlockSetStone("glazed_fossil_shale", "Glazed Fossil Shale", translationBuilder)
            generateTranslationBlockSetStone("glazed_iron_shale", "Glazed Iron Shale", translationBuilder)
            generateTranslationBlockSetStone("glazed_magnesium_shale", "Glazed Magnesium Shale", translationBuilder)

            generateTranslationBlockSetBricks("cobalt_shale_brick", "Cobalt Shale Brick", translationBuilder)
            generateTranslationBlockSetBricks("fossil_shale_brick", "Fossil Shale Brick", translationBuilder)
            generateTranslationBlockSetBricks("iron_shale_brick", "Iron Shale Brick", translationBuilder)
            generateTranslationBlockSetBricks("magnesium_shale_brick", "Magnesium Shale Brick", translationBuilder)

            generateTranslationBlockSetBricks("yellow_stock_brick", "Yellow Stock Brick", translationBuilder)
            generateTranslationBlockSetBricks("yellow_stock_tile", "Yellow Stock Tile", translationBuilder)
            translationBuilder.add("block." + BogusMogusWorld.mod_id + ".chiseled_yellow_stock_bricks", "Chiseled Yellow Stock Bricks");

            generateTranslationBlockSetStone("yellow_brickearth", "Yellow Brickearth", translationBuilder)

            generateTranslationBlockWoodSet("trellis","Trellis", translationBuilder)
            translationBuilder.add("itemGroup." + BogusMogusWorld.mod_id + ".blocks", "Bogus Mogus Blocks")
            translationBuilder.add("itemGroup." + BogusMogusWorld.mod_id + ".items", "Bogus Mogus Items")

            translationBuilder.add("block." + BogusMogusWorld.mod_id + ".cobalt_shale_pillar", "Cobalt Shale Pillar");
            translationBuilder.add("block." + BogusMogusWorld.mod_id + ".fossil_shale_pillar", "Fossil Shale Pillar");
            translationBuilder.add("block." + BogusMogusWorld.mod_id + ".iron_shale_pillar", "Iron Shale Pillar");
            translationBuilder.add("block." + BogusMogusWorld.mod_id + ".magnesium_shale_pillar", "Magnesium Shale Pillar");

            translationBuilder.add("effect." + BogusMogusWorld.mod_id + ".on_fire", "Flintflame Fire");
            generateItemTranslation("grapes","Grapes",translationBuilder)
            generateItemTranslation("ivy","Ivy",translationBuilder)
            generateItemTranslation("sea_moss","Sea Moss",translationBuilder)

        }
}
fun generateItemTranslation(item: String,name: String,translationBuilder: TranslationBuilder){
    translationBuilder.add("item." + BogusMogusWorld.mod_id + ".$item", name)
}
fun generateTranslationBlockSetStone(block: String, name: String, translationBuilder: TranslationBuilder){
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block, name);
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_slab", "$name Slab");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_stairs", "$name Stairs");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_wall", "$name Wall");
}
fun generateTranslationBlockSetBricks(block: String, name: String, translationBuilder: TranslationBuilder){
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "s", name+"s");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_slab", "$name Slab");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_stairs", "$name Stairs");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + "." + block + "_wall", "$name Wall");
}
fun generateTranslationBlockWoodSet(block: String, name: String, translationBuilder: TranslationBuilder) {
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".acacia_$block", "Acacia $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".bamboo_$block", "Bamboo $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".birch_$block", "Birch $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".cherry_$block", "Cherry $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".dark_oak_$block", "Dark Oak $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".jungle_$block", "Jungle $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".mangrove_$block", "Mangrove $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".oak_$block", "Oak $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".pale_oak_$block", "Pale Oak $name");
    translationBuilder.add("block." + BogusMogusWorld.mod_id + ".spruce_$block", "Spruce $name");
}