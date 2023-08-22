package com.tetranichematerials.tetranichematerials.init.gear;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class GoldArmorItem extends ArmorItem {

	public GoldArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
		super(material, slot, properties);
	}
	
	@Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
    {
        return true;
    }

}
