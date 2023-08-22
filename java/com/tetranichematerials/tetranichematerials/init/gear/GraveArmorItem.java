package com.tetranichematerials.tetranichematerials.init.gear;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GraveArmorItem extends ArmorItem implements IForgeItem {

	public GraveArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
		super(material, slot, properties);
	}

	@SubscribeEvent
	public static void onLivingDamage(LivingDamageEvent event) {
		LivingEntity sourceEntity = (LivingEntity) event.getSource().getEntity();
		LivingEntity target = event.getEntity();

		if (target instanceof Player) {

			Iterable<ItemStack> armorStack = target.getArmorSlots();

			for (ItemStack stack : armorStack) {
				if (stack.getItem() instanceof GraveArmorItem){
					if (sourceEntity != null) {
						if (sourceEntity.distanceToSqr(target.position()) < 4 && !MobType.UNDEAD.equals(target.getMobType())) {
							sourceEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0), sourceEntity);
						}
					}
					break;
				}
			}
		}
	}
}
