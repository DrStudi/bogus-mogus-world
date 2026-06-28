package drsus.bmworld.effects

import drsus.bmworld.BogusMogusWorld
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.resources.Identifier
import net.minecraft.server.level.ServerLevel
import net.minecraft.util.RandomSource
import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectCategory
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.ai.attributes.AttributeModifier
import net.minecraft.world.entity.ai.attributes.Attributes
import java.util.function.ToIntFunction


class ModEffectOnFire constructor() : MobEffect(MobEffectCategory.BENEFICIAL, 0xe9b8b3) {
    // Called every tick to check if the effect can be applied or not
    private var spawnedCount: ToIntFunction<RandomSource?>? = null

    override fun onEffectAdded(effectInstance: MobEffectInstance, entity: LivingEntity) {
        super.onEffectAdded(effectInstance, entity)
    }
    override fun shouldApplyEffectTickThisTick(duration: Int, amplifier: Int): Boolean {
        return true
    }
    override fun applyEffectTick(serverLevel: ServerLevel, livingEntity: LivingEntity, i: Int): Boolean {
        val d: Double = livingEntity.getX() + (livingEntity.random.nextDouble() * 2.0 - 1.0) * livingEntity.getBbWidth() * 0.5
        val e: Double = livingEntity.getY() + 0.05 + livingEntity.random.nextDouble()
        val f: Double = livingEntity.getZ() + (livingEntity.random.nextDouble() * 2.0 - 1.0) * livingEntity.getBbWidth() * 0.5
        val g: Double = (livingEntity.random.nextDouble() * 2.0 - 1.0) * 0.3
        val h: Double = 0.3 + livingEntity.random.nextDouble() * 0.3
        val j: Double = (livingEntity.random.nextDouble() * 2.0 - 1.0) * 0.3
        livingEntity.level().addParticle(ParticleTypes.CRIT, d, e + 1.0, f, g, h, j)

        addAttributeModifier(Attributes.ATTACK_SPEED, Identifier.withDefaultNamespace("effect." + BogusMogusWorld.mod_id + ".on_fire.attack_speed"), 1.0, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
        addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.withDefaultNamespace("effect." + BogusMogusWorld.mod_id + ".on_fire.speed"), 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)



        return super.applyEffectTick(serverLevel, livingEntity, i)
    }


    override fun onEffectRemoved(effectInstance: MobEffectInstance, entity: LivingEntity) {
        removeAttributeModifiers(entity.attributes)

        super.onEffectRemoved(effectInstance, entity)
    }
}