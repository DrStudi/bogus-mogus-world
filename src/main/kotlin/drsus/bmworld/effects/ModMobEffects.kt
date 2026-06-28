package drsus.bmworld.effects

import drsus.bmworld.BogusMogusWorld
import drsus.bmworld.BogusMogusWorld.logger
import net.fabricmc.api.ModInitializer
import net.minecraft.core.Holder
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.Identifier
import net.minecraft.world.effect.MobEffect


object ModMobEffects {
    fun initialize(){
        logger.info("initializing mod effects")

    }


        val ON_FIRE: Holder<MobEffect> = Registry.registerForHolder(
            BuiltInRegistries.MOB_EFFECT,
            Identifier.fromNamespaceAndPath(BogusMogusWorld.mod_id, "on_fire"),
            ModEffectOnFire()
        )
}