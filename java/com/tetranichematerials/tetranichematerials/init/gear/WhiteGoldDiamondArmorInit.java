package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import com.tetranichematerials.tetranichematerials.init.gear.ModArmorItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class WhiteGoldDiamondArmorInit {
	public static final ModArmorItem WHITE_GOLD_DIAMOND = new ModArmorItem(
			new int[] {120, 150, 150, 120}, 
			new int[] {2, 4, 6, 2}, 
			20, 
			SoundEvents.ARMOR_EQUIP_GOLD, 
			Ingredient.of(ItemInit.WHITE_GOLD_INGOT::get),
			"white_gold_diamond_armor",
			2f,
			0.20f
			);
			
}
