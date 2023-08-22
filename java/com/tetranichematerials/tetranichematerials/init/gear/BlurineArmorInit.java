package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class BlurineArmorInit {
	public static final ModArmorItem BLURINE = new ModArmorItem(
			new int[] {400, 500, 500, 450}, 
			new int[] {4, 7, 9, 4},
			9, 
			SoundEvents.ARMOR_EQUIP_IRON, 
			Ingredient.of(ItemInit.BLURINE_INGOT::get),
			"blurine_armor",
			2f,
			0.10f
			);
			
}
