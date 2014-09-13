package net.xexanos.oilcraft.handler;

import net.minecraftforge.common.config.Configuration;
import net.xexanos.oilcraft.reference.Reference;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class configHandler {

    public static void init(File configFile){
        if (Reference.CONFIG == null) {
            Reference.CONFIG = new Configuration(configFile);
            syncConfig();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e){
    	if (e.modID.equalsIgnoreCase(Reference.MOD_ID)){
            syncConfig();
        }
    }

    private static void syncConfig(){
        Reference.CONFIG_OIL = Reference.CONFIG.getBoolean("oil", "worldgen", true, "Enable/Disable worldgen for oil");
        Reference.CONFIG_GAS = Reference.CONFIG.getBoolean("gas", "worldgen", true, "Enable/Disable worldgen for gas");
        Reference.CONFIG_REFINERY = Reference.CONFIG.getFloat("refinery", "efficiency", 0.8f, 0, 1, "Efficiency of the refinery");

        if(Reference.CONFIG.hasChanged()){
            Reference.CONFIG.save();
        }
    }
}
