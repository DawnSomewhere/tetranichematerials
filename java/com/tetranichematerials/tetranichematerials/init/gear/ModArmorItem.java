package com.tetranichematerials.tetranichematerials.init.gear;

import com.tetranichematerials.tetranichematerials.TetraNicheMaterials;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorItem implements ArmorMaterial {

	private final int[] durabilityForSlot;
	private final int[] defenseForSlot;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final Ingredient repairMaterial;
	private final String name;
	private final float toughness;
	private final float knockbackResistance;



	public ModArmorItem(int[] durabilityForSlot, int[] defenseForSlot, int enchantability, SoundEvent equipSound, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
		this.durabilityForSlot = durabilityForSlot;
		this.defenseForSlot = defenseForSlot;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.repairMaterial = repairMaterial;
		this.name = name;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}
	

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return this.durabilityForSlot[slot.getIndex()];
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return this.defenseForSlot[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	}

	@Override
	public String getName() {
		return TetraNicheMaterials.MOD_ID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
