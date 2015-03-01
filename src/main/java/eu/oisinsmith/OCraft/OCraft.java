package eu.oisinsmith.OCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import eu.oisinsmith.OCraft.Configuration.ConfigurationHandler;
import eu.oisinsmith.OCraft.proxy.IProxy;
import eu.oisinsmith.OCraft.reference.*;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class OCraft {
	@Mod.Instance(Reference.MOD_ID)
	public static OCraft instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	//Network, Config, Blocks, Items
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	@Mod.EventHandler
	//Gui, Tile Entitys, Crafting
	public void init(FMLInitializationEvent event){
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
