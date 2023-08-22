package com.tetranichematerials.tetranichematerials.init.gear;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Iterator;
import java.util.List;

public class DarkbottomArmorItem extends ArmorItem implements IForgeItem {

	public DarkbottomArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
		super(material, slot, properties);
	}

	@SubscribeEvent
	public static void onLivingDamage(LivingDamageEvent event) {
		LivingEntity sourceEntity = (LivingEntity) event.getSource().getEntity();
		LivingEntity target = event.getEntity();

		if (target instanceof Player) {

			Iterable<ItemStack> armorStack = target.getArmorSlots();

			for (ItemStack stack : armorStack) {
				if (stack.getItem() instanceof DarkbottomArmorItem){
					if (sourceEntity != null && sourceEntity instanceof Player) {
						sourceEntity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1, true, false));
					}
					break;
				}
			}
		}
	}

	int ticks;

	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{
		ticks++;
		if (ticks >= 100) {
			AABB aabb = player.getBoundingBox().inflate(20.0, 20.0, 20.0);
			List<LivingEntity> list = player.level.getEntitiesOfClass(LivingEntity.class, aabb);

			if (!list.isEmpty()) {
				for (LivingEntity entity: list ) {
					if (entity != player){
						entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 120, 1, true, false));
					}
				}
			}
			player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 2, true, false));
			ticks = 0;
		}
	}

}
