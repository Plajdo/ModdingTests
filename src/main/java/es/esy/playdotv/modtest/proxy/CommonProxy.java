package es.esy.playdotv.modtest.proxy;

import es.esy.playdotv.modtest.blocks.WallBlock;
import es.esy.playdotv.modtest.blocks.WetWallBlock;
import es.esy.playdotv.modtest.init.ModBlocks;
import es.esy.playdotv.modtest.items.CementItem;
import es.esy.playdotv.modtest.items.PlajdoItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy{
	
	public void preInit(FMLPreInitializationEvent e){
		
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event){
		event.getRegistry().register(new WallBlock());
		event.getRegistry().register(new WetWallBlock());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		event.getRegistry().register(new ItemBlock(ModBlocks.wall).setRegistryName(ModBlocks.wall.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.wetwall).setRegistryName(ModBlocks.wetwall.getRegistryName()));
		event.getRegistry().register(new CementItem());
		event.getRegistry().register(new PlajdoItem());
	}
	
}