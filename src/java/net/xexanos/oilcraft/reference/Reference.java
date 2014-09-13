package net.xexanos.oilcraft.reference;

import net.minecraftforge.common.config.Configuration;

public class Reference {
    public static final String MOD_ID = "OilCraft";
    public static final String MOD_NAME = "OilCraft";
    public static final String VERSION = "1.7.10-0.0.1";
    public static final String CLIENT_PROXY_CLASS = "net.xexanos.oilcraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.xexanos.oilcraft.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "net.xexanos.oilcraft.client.gui.GuiFactory";

    public static Configuration CONFIG;

    public static boolean CONFIG_OIL = true;
    public static boolean CONFIG_GAS = true;
    public static double CONFIG_REFINERY = 0.8;
}
