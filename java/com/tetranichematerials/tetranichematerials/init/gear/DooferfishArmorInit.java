package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class DooferfishArmorInit {
	public static final ModArmorItem DOOFERFISH = new ModArmorItem(
			new int[] {420, 560, 600, 500},
			new int[] {3, 6, 8, 3},
			20, 
			SoundEvents.ARMOR_EQUIP_LEATHER,
			Ingredient.of(ItemInit.DOOFERFISH_SCALES::get),
			"dooferfish_armor",
			3f,
			0.0f
			);
}
