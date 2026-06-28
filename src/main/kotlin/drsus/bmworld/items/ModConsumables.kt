package drsus.bmworld.items

import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.item.component.Consumable
import net.minecraft.world.item.component.Consumables
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect
import java.util.List

object ModConsumables {
    val IVY: Consumable = Consumables.defaultFood()
        .onConsume(
            ApplyStatusEffectsConsumeEffect(
                listOf<MobEffectInstance>(
                    MobEffectInstance(MobEffects.POISON, 300, 2),
                    MobEffectInstance(MobEffects.NAUSEA, 300, 0)
                )
            )
        )
        .build()
}