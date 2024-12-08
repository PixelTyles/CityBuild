package de.pixeltyles.citybuild.listener;

import de.pixeltyles.citybuild.CityBuild;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListener implements Listener {



    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        FileConfiguration config = CityBuild.config;

        event.setJoinMessage(config.getString("connection.joinMessage"));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        FileConfiguration config = CityBuild.config;

        event.setQuitMessage(config.getString("connection.quitMessage"));
    }
}
