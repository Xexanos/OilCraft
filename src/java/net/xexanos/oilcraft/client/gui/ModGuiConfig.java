package net.xexanos.oilcraft.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.xexanos.oilcraft.reference.Reference;

import java.util.ArrayList;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen, new ArrayList<IConfigElement>(),
                Reference.MOD_ID, Reference.MOD_ID, true, false,
                GuiConfig.getAbridgedConfigPath(Reference.CONFIG.toString()));
        this.configElements.addAll(new ConfigElement(Reference.CONFIG.getCategory("worldgen")).getChildElements());
        this.configElements.addAll(new ConfigElement(Reference.CONFIG.getCategory("efficiency")).getChildElements());
    }
}
