package eu.oisinsmith.OCraft.Configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile){
		boolean configValue;
		Configuration configuration = new Configuration(configFile);
		
		try{
			
			configuration.load();
			configValue = configuration.get("Oisin", "configValue", true, "This is an Example").getBoolean(true);
		}catch(Exception e){
		
			
		}finally{
		
			configuration.save();
			
		}
	}
}
