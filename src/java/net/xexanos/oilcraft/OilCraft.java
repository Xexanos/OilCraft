package net.xexanos.oilcraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.xexanos.oilcraft.handler.configHandler;
import net.xexanos.oilcraft.proxy.IProyx;
import net.xexanos.oilcraft.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OilCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static OilCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProyx proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        configHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}
