package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class LockwoodArmorInit {
	public static final ModArmorItem LOCKWOOD = new ModArmorItem(
			new int[] {400, 500, 500, 450}, 
			new int[] {3, 6, 8, 3}, 
			20,
			SoundEvents.ARMOR_EQUIP_IRON, 
			Ingredient.of(ItemInit.LOCKWOOD_INGOT::get),
			"lockwood_armor",
			3f, 
			0.10f
			);
			
}
