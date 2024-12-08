package de.pixeltyles.citybuild;

import de.pixeltyles.citybuild.commands.*;
import de.pixeltyles.citybuild.listener.ConnectionListener;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class CityBuild extends JavaPlugin {
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

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ConnectionListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
