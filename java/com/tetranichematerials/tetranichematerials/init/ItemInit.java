package com.tetranichematerials.tetranichematerials.init;

import com.tetranichematerials.tetranichematerials.TetraNicheMaterials;
import com.tetranichematerials.tetranichematerials.init.gear.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
    // Create a Deferred Register to hold Blocks which will all be registered under the "TetraNicheMaterials" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TetraNicheMaterials.MOD_ID);
    // Create a Deferred Register to hold Items which will all be registered under the "TetraNicheMaterials" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TetraNicheMaterials.MOD_ID);
    
    // Pulverized coal can be used in furnaces as a more efficient fuel, or in crafting recipes
    public static final RegistryObject<Item> PULVERIZED_COAL = ITEMS.register("pulverized_coal", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)) {
    			@Override
    			public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
    				return 2000;
    			}
    		});
    
    // Various powders, used for crafting alloys
    public static final RegistryObject<Item> COPPER_POWDER = ITEMS.register("copper_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> IRON_POWDER = ITEMS.register("iron_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> GOLD_POWDER = ITEMS.register("gold_powder",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> STEEL_POWDER = ITEMS.register("steel_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> LAPIS_POWDER = ITEMS.register("lapis_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    // Steel gets added because with only coal dust and iron as ingredients, you could get it vanilla
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", 
    		() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
    				.strength(15)
    				.explosionResistance(600)
    				));
    
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", 
    		() -> new BlockItem(STEEL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	// Why would you ever mess with an old dooferfish? To become the boss of the sea, that's why.
	public static final RegistryObject<Item> DOOFERFISH_SCALES = ITEMS.register("dooferfish_scales",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> DOOFERFISH_ARMOR_HELMET = ITEMS.register("dooferfish_armor_helmet",
			() -> new DooferfishArmorItem(
					// material
					DooferfishArmorInit.DOOFERFISH,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DOOFERFISH_ARMOR_CHEST = ITEMS.register("dooferfish_armor_chest",
			() -> new DooferfishArmorItem(
					// material
					DooferfishArmorInit.DOOFERFISH,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DOOFERFISH_ARMOR_LEGS = ITEMS.register("dooferfish_armor_legs",
			() -> new DooferfishArmorItem(
					// material
					DooferfishArmorInit.DOOFERFISH,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DOOFERFISH_ARMOR_FEET = ITEMS.register("dooferfish_armor_feet",
			() -> new DooferfishArmorItem(
					// material
					DooferfishArmorInit.DOOFERFISH,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	//"We don't want the players farming the Warden", they said of the big, glorified zombie
	public static final RegistryObject<Item> DARKBOTTOM_BONE = ITEMS.register("darkbottom_bone",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> DARKBOTTOM_ARMOR_HELMET = ITEMS.register("darkbottom_armor_helmet",
			() -> new DarkbottomArmorItem(
					// material
					DarkbottomArmorInit.DARKBOTTOM,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DARKBOTTOM_ARMOR_CHEST = ITEMS.register("darkbottom_armor_chest",
			() -> new DarkbottomArmorItem(
					// material
					DarkbottomArmorInit.DARKBOTTOM,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DARKBOTTOM_ARMOR_LEGS = ITEMS.register("darkbottom_armor_legs",
			() -> new DarkbottomArmorItem(
					// material
					DarkbottomArmorInit.DARKBOTTOM,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> DARKBOTTOM_ARMOR_FEET = ITEMS.register("darkbottom_armor_feet",
			() -> new DarkbottomArmorItem(
					// material
					DarkbottomArmorInit.DARKBOTTOM,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

    // "Culuminum" is based loosely on Aluminum 2014, an Aluminum alloy composed of 3-5% copper plus others.
    // Used primarily in aerospace engineering, it's as light as Aluminum, but much more durable.
    public static final RegistryObject<Block> CULUMINUM_BLOCK = BLOCKS.register("culuminum_block", 
    		() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
    				.strength(3)
    				.explosionResistance(6)
    				));
    
    public static final RegistryObject<Item> CULUMINUM_BLOCK_ITEM = ITEMS.register("culuminum_block", 
    		() -> new BlockItem(CULUMINUM_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    
    public static final RegistryObject<Item> CULUMINUMIN_POWDER = ITEMS.register("culuminum_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> CULUMINUMIN_INGOT = ITEMS.register("culuminum_ingot", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    // "White Gold" is not totally beholden to strict practices and can involve wide range of metals,
    //But for sanity's sake, in this case we pretend it's 75% gold and 25% nickel
    public static final RegistryObject<Block> WHITE_GOLD_BLOCK = BLOCKS.register("white_gold_block", 
    		() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
    				.strength(3)
    				.explosionResistance(6)
    				));
    
    public static final RegistryObject<Item> WHITE_GOLD_BLOCK_ITEM = ITEMS.register("white_gold_block", 
    		() -> new BlockItem(WHITE_GOLD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    
    public static final RegistryObject<Item> WHITE_GOLD_POWDER = ITEMS.register("white_gold_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> WHITE_GOLD_INGOT = ITEMS.register("white_gold_ingot", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> WHITE_GOLD_ARMOR_HELMET = ITEMS.register("white_gold_armor_helmet", 
    		() -> new GoldArmorItem(
    				// material
    				WhiteGoldArmorInit.WHITE_GOLD, 
    				// slot
    				EquipmentSlot.HEAD,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> WHITE_GOLD_ARMOR_CHEST = ITEMS.register("white_gold_armor_chest", 
    		() -> new GoldArmorItem(
    				// material
    				WhiteGoldArmorInit.WHITE_GOLD, 
    				// slot
    				EquipmentSlot.CHEST,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> WHITE_GOLD_ARMOR_LEGS = ITEMS.register("white_gold_armor_legs", 
    		() -> new GoldArmorItem(
    				// material
    				WhiteGoldArmorInit.WHITE_GOLD, 
    				// slot
    				EquipmentSlot.LEGS,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> WHITE_GOLD_ARMOR_FEET = ITEMS.register("white_gold_armor_feet", 
    		() -> new GoldArmorItem(
    				// material
    				WhiteGoldArmorInit.WHITE_GOLD, 
    				// slot
    				EquipmentSlot.FEET,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));

	// "Red Gold", or "Rose Gold" is also not adherent to strict engineering practices, but should be available
	// to our vanilla players since gold and copper are both present, and that's what it's made of!
	public static final RegistryObject<Block> RED_GOLD_BLOCK = BLOCKS.register("red_gold_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3)
					.explosionResistance(6)
			));

	public static final RegistryObject<Item> RED_GOLD_BLOCK_ITEM = ITEMS.register("red_gold_block",
			() -> new BlockItem(RED_GOLD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> RED_GOLD_POWDER = ITEMS.register("red_gold_powder",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> RED_GOLD_INGOT = ITEMS.register("red_gold_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> RED_GOLD_ARMOR_HELMET = ITEMS.register("red_gold_armor_helmet",
			() -> new GoldArmorItem(
					// material
					RedGoldArmorInit.RED_GOLD,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> RED_GOLD_ARMOR_CHEST = ITEMS.register("red_gold_armor_chest",
			() -> new GoldArmorItem(
					// material
					RedGoldArmorInit.RED_GOLD,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> RED_GOLD_ARMOR_LEGS = ITEMS.register("red_gold_armor_legs",
			() -> new GoldArmorItem(
					// material
					RedGoldArmorInit.RED_GOLD,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> RED_GOLD_ARMOR_FEET = ITEMS.register("red_gold_armor_feet",
			() -> new GoldArmorItem(
					// material
					RedGoldArmorInit.RED_GOLD,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));
    
    // "Bronnum" is based on aluminum bronze, which is actually a bit harder than tin bronze.
	// Instead of aluminum, this uses Redstone so that it can be crafted with vanilla materials
    public static final RegistryObject<Block> BRONNUM_BLOCK = BLOCKS.register("bronnum_block", 
    		() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
    				.strength(3)
    				.explosionResistance(6)
    				));
    
    public static final RegistryObject<Item> BRONNUM_BLOCK_ITEM = ITEMS.register("bronnum_block", 
    		() -> new BlockItem(BRONNUM_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    
    public static final RegistryObject<Item> BRONNUM_POWDER = ITEMS.register("bronnum_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> BRONNUM_INGOT = ITEMS.register("bronnum_ingot", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> BRONNUM_ARMOR_HELMET = ITEMS.register("bronnum_armor_helmet", 
    		() -> new ArmorItem(
    				// material
    				BronnumArmorInit.BRONNUM,
    				// slot
    				EquipmentSlot.HEAD,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> BRONNUM_ARMOR_CHEST = ITEMS.register("bronnum_armor_chest", 
    		() -> new ArmorItem(
    				// material
    				BronnumArmorInit.BRONNUM, 
    				// slot
    				EquipmentSlot.CHEST,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> BRONNUM_ARMOR_LEGS = ITEMS.register("bronnum_armor_legs", 
    		() -> new ArmorItem(
    				// material
    				BronnumArmorInit.BRONNUM, 
    				// slot
    				EquipmentSlot.LEGS,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> BRONNUM_ARMOR_FEET = ITEMS.register("bronnum_armor_feet", 
    		() -> new ArmorItem(
    				// material
    				BronnumArmorInit.BRONNUM, 
    				// slot
    				EquipmentSlot.FEET,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    // "Marel" is based loosely on UNS K93120 steel, which has a high Brinell hardness and a lot of yield strength
    public static final RegistryObject<Block> MAREL_BLOCK = BLOCKS.register("marel_block", 
    		() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
    				.strength(50)
    				.explosionResistance(1200)
    				));
    
    public static final RegistryObject<Item> MAREL_BLOCK_ITEM = ITEMS.register("marel_block", 
    		() -> new BlockItem(MAREL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    
    public static final RegistryObject<Item> MAREL_POWDER = ITEMS.register("marel_powder", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> MAREL_INGOT = ITEMS.register("marel_ingot", 
    		() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> MAREL_ARMOR_HELMET = ITEMS.register("marel_armor_helmet", 
    		() -> new ArmorItem(
    				// material
    				MarelArmorInit.MAREL,
    				// slot
    				EquipmentSlot.HEAD,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> MAREL_ARMOR_CHEST = ITEMS.register("marel_armor_chest", 
    		() -> new ArmorItem(
    				// material
    				MarelArmorInit.MAREL, 
    				// slot
    				EquipmentSlot.CHEST,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> MAREL_ARMOR_LEGS = ITEMS.register("marel_armor_legs", 
    		() -> new ArmorItem(
    				// material
    				MarelArmorInit.MAREL, 
    				// slot
    				EquipmentSlot.LEGS,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));
    
    public static final RegistryObject<Item> MAREL_ARMOR_FEET = ITEMS.register("marel_armor_feet", 
    		() -> new ArmorItem(
    				// material
    				MarelArmorInit.MAREL, 
    				// slot
    				EquipmentSlot.FEET,
    				//properties
    				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
    				));

	// "Blurine" is a purely fictional metal based loosely on high grade steels, using Lapis and glowstone
	// It exists mainly to provide something to players who don't have access to nickel.
	public static final RegistryObject<Block> BLURINE_BLOCK = BLOCKS.register("blurine_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(50)
					.explosionResistance(1200)
			));

	public static final RegistryObject<Item> BLURINE_BLOCK_ITEM = ITEMS.register("blurine_block",
			() -> new BlockItem(BLURINE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> BLURINE_POWDER = ITEMS.register("blurine_powder",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> BLURINE_INGOT = ITEMS.register("blurine_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> BLURINE_ARMOR_HELMET = ITEMS.register("blurine_armor_helmet",
			() -> new ArmorItem(
					// material
					BlurineArmorInit.BLURINE,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> BLURINE_ARMOR_CHEST = ITEMS.register("blurine_armor_chest",
			() -> new ArmorItem(
					// material
					BlurineArmorInit.BLURINE,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> BLURINE_ARMOR_LEGS = ITEMS.register("blurine_armor_legs",
			() -> new ArmorItem(
					// material
					BlurineArmorInit.BLURINE,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> BLURINE_ARMOR_FEET = ITEMS.register("blurine_armor_feet",
			() -> new ArmorItem(
					// material
					BlurineArmorInit.BLURINE,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	// Adding smithing upgrades for some existing armors

	public static final RegistryObject<Item> RED_GOLD_DIAMOND_ARMOR_HELMET = ITEMS.register("red_gold_diamond_armor_helmet",
			() -> new GoldArmorItem(
					// material
					RedGoldDiamondArmorInit.RED_GOLD_DIAMOND,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> WHITE_GOLD_DIAMOND_ARMOR_HELMET = ITEMS.register("white_gold_diamond_armor_helmet",
			() -> new GoldArmorItem(
					// material
					WhiteGoldDiamondArmorInit.WHITE_GOLD_DIAMOND,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	// Support for Twilight Forest

	public static final RegistryObject<Item> IRONWOOD_POWDER = ITEMS.register("ironwood_powder",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	// Combine Ironwood with carbon to get Lockwood

	public static final RegistryObject<Block> LOCKWOOD_BLOCK = BLOCKS.register("lockwood_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(50)
					.explosionResistance(1200)
			));

	public static final RegistryObject<Item> LOCKWOOD_BLOCK_ITEM = ITEMS.register("lockwood_block",
			() -> new BlockItem(LOCKWOOD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> LOCKWOOD_POWDER = ITEMS.register("lockwood_powder",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> LOCKWOOD_INGOT = ITEMS.register("lockwood_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> LOCKWOOD_ARMOR_HELMET = ITEMS.register("lockwood_armor_helmet",
			() -> new ArmorItem(
					// material
					LockwoodArmorInit.LOCKWOOD,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> LOCKWOOD_ARMOR_CHEST = ITEMS.register("lockwood_armor_chest",
			() -> new ArmorItem(
					// material
					LockwoodArmorInit.LOCKWOOD,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> LOCKWOOD_ARMOR_LEGS = ITEMS.register("lockwood_armor_legs",
			() -> new ArmorItem(
					// material
					LockwoodArmorInit.LOCKWOOD,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> LOCKWOOD_ARMOR_FEET = ITEMS.register("lockwood_armor_feet",
			() -> new ArmorItem(
					// material
					LockwoodArmorInit.LOCKWOOD,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	//Fiery blood or tears can be used on steel to make Burning Steel
	public static final RegistryObject<Block> BURNING_STEEL_BLOCK = BLOCKS.register("burning_steel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(50)
					.explosionResistance(1200)
			));

	public static final RegistryObject<Item> BURNING_STEEL_BLOCK_ITEM = ITEMS.register("burning_steel_block",
			() -> new BlockItem(BURNING_STEEL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> BURNING_STEEL_INGOT = ITEMS.register("burning_steel_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> BURNING_STEEL_ARMOR_HELMET = ITEMS.register("burning_steel_armor_helmet",
			() -> new BurningArmorItem(
					// material
					BurningSteelArmorInit.BURNING_STEEL,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
			));

	public static final RegistryObject<Item> BURNING_STEEL_ARMOR_CHEST = ITEMS.register("burning_steel_armor_chest",
			() -> new BurningArmorItem(
					// material
					BurningSteelArmorInit.BURNING_STEEL,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
			));

	public static final RegistryObject<Item> BURNING_STEEL_ARMOR_LEGS = ITEMS.register("burning_steel_armor_legs",
			() -> new BurningArmorItem(
					// material
					BurningSteelArmorInit.BURNING_STEEL,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
			));

	public static final RegistryObject<Item> BURNING_STEEL_ARMOR_FEET = ITEMS.register("burning_steel_armor_feet",
			() -> new BurningArmorItem(
					// material
					BurningSteelArmorInit.BURNING_STEEL,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
			));

	//Corruption makes dark iron, so corruption also works on steel
	public static final RegistryObject<Block> GRAVE_STEEL_BLOCK = BLOCKS.register("grave_steel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(50)
					.explosionResistance(1200)
			));

	public static final RegistryObject<Item> GRAVE_STEEL_BLOCK_ITEM = ITEMS.register("grave_steel_block",
			() -> new BlockItem(GRAVE_STEEL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> GRAVE_STEEL_INGOT = ITEMS.register("grave_steel_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<Item> GRAVE_STEEL_ARMOR_HELMET = ITEMS.register("grave_steel_armor_helmet",
			() -> new GraveArmorItem(
					// material
					GraveSteelArmorInit.GRAVE_STEEL,
					// slot
					EquipmentSlot.HEAD,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> GRAVE_STEEL_ARMOR_CHEST = ITEMS.register("grave_steel_armor_chest",
			() -> new GraveArmorItem(
					// material
					GraveSteelArmorInit.GRAVE_STEEL,
					// slot
					EquipmentSlot.CHEST,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> GRAVE_STEEL_ARMOR_LEGS = ITEMS.register("grave_steel_armor_legs",
			() -> new GraveArmorItem(
					// material
					GraveSteelArmorInit.GRAVE_STEEL,
					// slot
					EquipmentSlot.LEGS,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));

	public static final RegistryObject<Item> GRAVE_STEEL_ARMOR_FEET = ITEMS.register("grave_steel_armor_feet",
			() -> new GraveArmorItem(
					// material
					GraveSteelArmorInit.GRAVE_STEEL,
					// slot
					EquipmentSlot.FEET,
					//properties
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
			));
    
    public static class Tags {
    	public static final TagKey<Item> COPPER_POWDER = ItemTags.create(new ResourceLocation("forge", "dusts/copper"));
    	public static final TagKey<Item> IRON_POWDER = ItemTags.create(new ResourceLocation("forge", "dusts/iron"));
		public static final TagKey<Item> GOLD_POWDER = ItemTags.create(new ResourceLocation("forge", "dusts/gold"));
    	public static final TagKey<Item> STEEL_POWDER = ItemTags.create(new ResourceLocation("forge", "dusts/steel"));
    	public static final TagKey<Item> STEEL_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/steel"));
		public static final TagKey<Item> STEEL_BLOCK_ITEM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/steel"));
		public static final TagKey<Block> STEEL_BLOCK = BlockTags.create(new ResourceLocation("forge", "storage_blocks/steel"));
    	public static final TagKey<Item> PIGLIN_LOVED = ItemTags.create(new ResourceLocation("minecraft", "piglin_loved"));

		public static final TagKey<Item> DUSTS = ItemTags.create(new ResourceLocation("forge", "dusts"));
		public static final TagKey<Item> INGOTS = ItemTags.create(new ResourceLocation("forge", "ingots"));
		public static final TagKey<Item> STORAGE_BLOCKS = ItemTags.create(new ResourceLocation("forge", "storage_blocks"));

		//Fixes for Vivecraft and Tetra
		public static final TagKey<Item> VIVE_CROSSBOWS = ItemTags.create(new ResourceLocation("vivecraft", "crossbows"));
		public static final TagKey<Item> VIVE_SHIELDS = ItemTags.create(new ResourceLocation("vivecraft", "shields"));
		public static final TagKey<Item> VIVE_SWORDS = ItemTags.create(new ResourceLocation("vivecraft", "swords"));
		public static final TagKey<Item> VIVE_TOOLS = ItemTags.create(new ResourceLocation("vivecraft", "tools"));

		//Empty tags for Forge compatability
		public static final TagKey<Item> ALUMINUM_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/aluminum"));
		public static final TagKey<Item> BRONZE_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/bronze"));
		public static final TagKey<Item> ELECTRUM_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/electrum"));
		public static final TagKey<Item> LEAD_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/lead"));
		public static final TagKey<Item> NICKEL_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/nickel"));
		public static final TagKey<Item> OSMIUM_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/osmium"));
		public static final TagKey<Item> SILVER_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/silver"));
		public static final TagKey<Item> TIN_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/tin"));
		public static final TagKey<Item> PLATINUM_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/platinum"));
		public static final TagKey<Item> URANIUM_INGOT = ItemTags.create(new ResourceLocation("forge", "ingots/uranium"));

		public static final TagKey<Item> ALUMINUM_ORE = ItemTags.create(new ResourceLocation("forge", "ores/aluminum"));
		public static final TagKey<Item> BRONZE_ORE = ItemTags.create(new ResourceLocation("forge", "ores/bronze"));
		public static final TagKey<Item> ELECTRUM_ORE = ItemTags.create(new ResourceLocation("forge", "ores/electrum"));
		public static final TagKey<Item> LEAD_ORE = ItemTags.create(new ResourceLocation("forge", "ores/lead"));
		public static final TagKey<Item> NICKEL_ORE = ItemTags.create(new ResourceLocation("forge", "ores/nickel"));
		public static final TagKey<Item> OSMIUM_ORE = ItemTags.create(new ResourceLocation("forge", "ores/osmium"));
		public static final TagKey<Item> SILVER_ORE = ItemTags.create(new ResourceLocation("forge", "ores/silver"));
		public static final TagKey<Item> TIN_ORE = ItemTags.create(new ResourceLocation("forge", "ores/tin"));
		public static final TagKey<Item> PLATINUM_ORE = ItemTags.create(new ResourceLocation("forge", "ores/platinum"));
		public static final TagKey<Item> URANIUM_ORE = ItemTags.create(new ResourceLocation("forge", "ores/uranium"));

		public static final TagKey<Item> ALUMINUM_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/aluminum"));
		public static final TagKey<Item> BRONZE_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/bronze"));
		public static final TagKey<Item> ELECTRUM_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/electrum"));
		public static final TagKey<Item> LEAD_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/lead"));
		public static final TagKey<Item> NICKEL_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/nickel"));
		public static final TagKey<Item> OSMIUM_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/osmium"));
		public static final TagKey<Item> SILVER_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/silver"));
		public static final TagKey<Item> TIN_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/tin"));
		public static final TagKey<Item> PLATINUM_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/platinum"));
		public static final TagKey<Item> URANIUM_DUST = ItemTags.create(new ResourceLocation("forge", "dusts/uranium"));
    }

}
