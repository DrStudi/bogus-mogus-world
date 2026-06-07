package drsus.bmworld.client.entityrenderer

import net.minecraft.client.renderer.entity.state.LivingEntityRenderState
import net.minecraft.world.entity.AnimationState

class SkullCrawlerEntityRenderState : LivingEntityRenderState() {
    val dancingAnimationState: AnimationState = AnimationState()
    val walkingAnimationState: AnimationState = AnimationState()

}