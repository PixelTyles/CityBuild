package de.pixeltyles.cb1.commands;

import de.pixeltyles.cb1.Cb1;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            FileConfiguration config = Cb1.config;

            Player player = (Player) sender;

            Location spawn = new Location(Bukkit.getWorld(config.getString("spawn.world")), config.getInt("spawn.x"), config.getInt("spawn.y"), config.getInt("spawn.z"));
            player.sendMessage("§8» §3Spawn §8| §7You teleported to the spawn.");


            player.teleport(spawn);

        } else {

            sender.sendMessage("You have to be a player!");
        }
        return false;
    }
}