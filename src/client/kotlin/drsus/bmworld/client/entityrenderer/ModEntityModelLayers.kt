package drsus.bmworld.client.entityrenderer

import drsus.bmworld.BogusMogusWorld
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.resources.Identifier


object ModEntityModelLayers {
    val SKULLCRAWLER: ModelLayerLocation = createMain("skull_crawler")

    private fun createMain(name: String): ModelLayerLocation {
        return ModelLayerLocation(Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, name), "main")
    }

    fun registerModelLayers() {
        EntityModelLayerRegistry.registerModelLayer(
            ModEntityModelLayers.SKULLCRAWLER,
            SkullCrawlerModel::createBodyLayer
        )
    }
}
