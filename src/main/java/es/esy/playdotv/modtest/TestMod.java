package es.esy.playdotv.modtest;

import es.esy.playdotv.modtest.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TestMod {
	
	@Instance
	public static TestMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("PreInitialization");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		System.out.println("Initialization");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		System.out.println("PostInitialization");
	}
	
}
