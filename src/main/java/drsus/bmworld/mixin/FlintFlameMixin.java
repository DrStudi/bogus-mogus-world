package drsus.bmworld.mixin;

import drsus.bmworld.BogusMogusWorld;
import drsus.bmworld.effects.ModMobEffects;
import drsus.bmworld.items.ItemComponents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class FlintFlameMixin {



    @Inject(at = @At("TAIL"), method = "onAttack")
    public void activateFlame(CallbackInfo info) {
        Player player = (Player) (Object) this;
        ItemStack itemStack = player.getWeaponItem();
        if (Boolean.TRUE.equals(itemStack.get(ItemComponents.INSTANCE.getFLINTFLAME_UPGRADE())) && !player.getCooldowns().isOnCooldown(itemStack)) {
            player.addEffect(new MobEffectInstance(ModMobEffects.INSTANCE.getON_FIRE(), 50, 2), player);
            player.getCooldowns().addCooldown(itemStack, 200);
        }



    }


}