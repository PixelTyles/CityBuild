package de.pixeltyles.cb1;

import de.pixeltyles.cb1.commands.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public final class Cb1 extends JavaPlugin {
    public static FileConfiguration config;

    @Override
    public void onEnable() {

        saveDefaultConfig();
        config = getConfig();

        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("craft").setExecutor(new CraftCommand());
        getCommand("ec").setExecutor(new EcCommand());
        getCommand("suicide").setExecutor(new SuicideCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
