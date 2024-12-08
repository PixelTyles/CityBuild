package de.pixeltyles.citybuild.listener;

import de.pixeltyles.citybuild.CityBuild;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListener implements Listener {



    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String welcomeMessage = CityBuild.getWelcomeMessage(player);

        event.setJoinMessage(welcomeMessage);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        FileConfiguration config = CityBuild.config;

        event.setQuitMessage(config.getString("connection.quitMessage"));
    }
}
