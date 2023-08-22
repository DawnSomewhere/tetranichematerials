package com.tetranichematerials.tetranichematerials.init.gear;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeItem;

public class DooferfishArmorItem extends ArmorItem implements IForgeItem {

	public DooferfishArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
		super(material, slot, properties);
	}

	int ticks;

	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{
		ticks++;
		if (ticks >= 200) {
			player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 4, true, false));
			player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 300, 0, true, false));
			ticks = 0;
		}
	}

}
