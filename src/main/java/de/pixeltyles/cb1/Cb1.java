package de.pixeltyles.cb1;

import de.pixeltyles.cb1.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cb1 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
