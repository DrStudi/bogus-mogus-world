package drsus.bmworld.client

import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.blocks.ModBlocks
import drsus.bmworld.client.entityrenderer.ModEntityModelLayers
import drsus.bmworld.client.entityrenderer.SkullCrawlerEntityRenderer
import drsus.bmworld.entities.ModEntityTypes
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.chunk.ChunkSectionLayer
import net.minecraft.client.renderer.entity.EntityRenderers

object BogusMogusWorldClient : ClientModInitializer {
    override fun onInitializeClient() {
        ModEntityModelLayers.registerModelLayers()
        EntityRenderers.register(ModEntityTypes.SKULL_CRAWLER, ::SkullCrawlerEntityRenderer)

        BlockRenderLayerMap.putBlock(ModBlocks.OAK_TRELLIS, ChunkSectionLayer.TRANSLUCENT);
    }
}
