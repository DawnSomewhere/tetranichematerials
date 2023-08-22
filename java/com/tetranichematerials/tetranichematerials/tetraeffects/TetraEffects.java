package com.tetranichematerials.tetranichematerials.tetraeffects;

import com.tetranichematerials.tetranichematerials.init.gear.BurningArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import se.mickelus.tetra.effect.EffectHelper;
import se.mickelus.tetra.effect.ItemEffect;
import se.mickelus.tetra.items.modular.IModularItem;


public class TetraEffects {
	
	private static final ItemEffect innateFireAspect = ItemEffect.get("tetranichematerials.innateFireAspect");
	private static final ItemEffect innateSmiting = ItemEffect.get("tetranichematerials.innateSmiting");
	private static final ItemEffect innatePoison = ItemEffect.get("tetranichematerials.innatePoison");
	private static final ItemEffect innateWither = ItemEffect.get("tetranichematerials.innateWither");
	private static final ItemEffect lifeBane = ItemEffect.get("tetranichematerials.lifeBane");
	
	@SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
		LivingEntity sourceEntity = (LivingEntity) event.getSource().getEntity();
		LivingEntity target = event.getEntity();

		// If the attacker is a player
		if (sourceEntity instanceof Player) {

			net.minecraft.world.item.ItemStack itemStack = sourceEntity.getMainHandItem();

			//Check if they're holding a modular item
			if (itemStack.getItem() instanceof IModularItem) {
				int innateFireAspectLevel = EffectHelper.getEffectLevel(itemStack, innateFireAspect);
				int innateSmitingLevel = EffectHelper.getEffectLevel(itemStack, innateSmiting);
				int innatePoisonLevel = EffectHelper.getEffectLevel(itemStack, innatePoison);
				int innateWitherLevel = EffectHelper.getEffectLevel(itemStack, innateWither);
				int lifeBaneLevel = EffectHelper.getEffectLevel(itemStack, lifeBane);

				//If they have a specific Improvement, apply its effect
				if (innateFireAspectLevel > 0) {
					target.setSecondsOnFire(innateFireAspectLevel);
				}
				if (innateSmitingLevel > 0 && MobType.UNDEAD.equals(target.getMobType())) {
					event.setAmount(event.getAmount() + (float)innateSmitingLevel);
				}
				if (lifeBaneLevel > 0 && !MobType.UNDEAD.equals(target.getMobType())) {
					event.setAmount(event.getAmount() + (float)lifeBaneLevel);
				}
				if (innatePoisonLevel > 0 && !MobType.UNDEAD.equals(target.getMobType())) {
					target.addEffect(new MobEffectInstance(MobEffects.POISON, innatePoisonLevel, 0), target);
				}
				if (innateWitherLevel > 0 ) {
					target.addEffect(new MobEffectInstance(MobEffects.WITHER, innateWitherLevel, 0), target);
				}
			}
		}

		//If the target is the player

	}
}
