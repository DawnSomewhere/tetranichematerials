package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class DarkbottomArmorInit {
	public static final ModArmorItem DARKBOTTOM = new ModArmorItem(
			new int[] {600, 800, 900, 620},
			new int[] {4, 7, 9, 4},
			20, 
			SoundEvents.ARMOR_EQUIP_LEATHER,
			Ingredient.of(ItemInit.DARKBOTTOM_BONE::get),
			"darkbottom_armor",
			3.5f,
			0.10f
			);
}
