package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class BronnumArmorInit {
	public static final ModArmorItem BRONNUM = new ModArmorItem(
			new int[] {350, 450, 490, 370}, 
			new int[] {3, 6, 8, 3}, 
			11, 
			SoundEvents.ARMOR_EQUIP_IRON, 
			Ingredient.of(ItemInit.BRONNUM_INGOT::get),
			"bronnum_armor", 
			1.9f, 
			0.10f
			);
			
}
