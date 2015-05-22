package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "はじめてのモッド!";
    public static final String VERSION = "β1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// レシピの追加
    	GameRegistry.addRecipe(new ItemStack(Items.diamond), 
    			"X",'X',Blocks.dirt
    	);
    	GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block),
    			"DSD",
    			"SDS",
    			"DSD",
    			'D',Blocks.dirt,
    			'S',Items.wheat_seeds
    	);
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_ore),
    			Items.diamond,
    			Blocks.stone
    	);
    	GameRegistry.addRecipe(new ItemStack(Items.apple, 3),
    			"C",
    			"W",
    			'C',new ItemStack(Items.coal, 1, 1),
    			'W',Blocks.water
    	);
    	GameRegistry.addSmelting(Items.wheat_seeds, new ItemStack(Items.cake), 0.4f);
    }
}
