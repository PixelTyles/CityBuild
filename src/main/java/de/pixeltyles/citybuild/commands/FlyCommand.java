package de.pixeltyles.citybuild.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.getAllowFlight()) {
                player.setAllowFlight(false);
                player.sendMessage("§8» §aFly §8| §7You disabled your fly.");
            } else {
                player.setAllowFlight(true);
                player.sendMessage("§8» §aFly §8| §7You enabled your fly.");
            }

        } else {
            sender.sendMessage("You have to be a player!");
        }
        return false;
    }
}