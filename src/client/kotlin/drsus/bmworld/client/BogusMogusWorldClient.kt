package drsus.bmworld.client

import drsus.bmworld.client.entityrenderer.ModEntityModelLayers
import drsus.bmworld.client.entityrenderer.SkullCrawlerEntityRenderer
import drsus.bmworld.entities.ModEntityTypes
import net.fabricmc.api.ClientModInitializer
import net.minecraft.client.renderer.entity.EntityRenderers

object BogusMogusWorldClient : ClientModInitializer {
    override fun onInitializeClient() {
        ModEntityModelLayers.registerModelLayers()
        EntityRenderers.register(ModEntityTypes.SKULL_CRAWLER, ::SkullCrawlerEntityRenderer)
    }
}
