package de.pixeltyles.cb1;

import de.pixeltyles.cb1.commands.CraftCommand;
import de.pixeltyles.cb1.commands.EcCommand;
import de.pixeltyles.cb1.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cb1 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("craft").setExecutor(new CraftCommand());
        getCommand("ec").setExecutor(new EcCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
