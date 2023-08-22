package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class GraveSteelArmorInit {
	public static final ModArmorItem GRAVE_STEEL = new ModArmorItem(
			new int[] {350, 450, 480, 400},
			new int[] {3, 6, 8, 3},
			15,
			SoundEvents.ARMOR_EQUIP_IRON,
			Ingredient.of(ItemInit.GRAVE_STEEL_INGOT::get),
			"grave_steel_armor",
			2f,
			0.05f
			);
}
