package com.tetranichematerials.tetranichematerials;



import com.tetranichematerials.tetranichematerials.init.gear.BurningArmorItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.tetranichematerials.tetranichematerials.init.ItemInit;
import com.tetranichematerials.tetranichematerials.tetraeffects.TetraEffects;


import net.minecraftforge.eventbus.api.IEventBus;


@Mod("tetranichematerials")
public class TetraNicheMaterials {

    public static final String MOD_ID = "tetranichematerials";

    public TetraNicheMaterials () {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(TetraEffects.class);
        MinecraftForge.EVENT_BUS.register(BurningArmorItem.class);
        
        ItemInit.ITEMS.register(modEventBus);
        ItemInit.BLOCKS.register(modEventBus);
            
        
    }
}
