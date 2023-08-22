package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import com.tetranichematerials.tetranichematerials.init.gear.ModArmorItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class MarelArmorInit {
	public static final ModArmorItem MAREL = new ModArmorItem(
			new int[] {400, 500, 500, 450}, 
			new int[] {3, 6, 8, 3}, 
			9, 
			SoundEvents.ARMOR_EQUIP_IRON, 
			Ingredient.of(ItemInit.MAREL_INGOT::get),
			"marel_armor", 
			3f, 
			0.10f
			);
			
}
