package com.github.hazork.mysouls.commands.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.hazork.mysouls.MySouls;
import com.github.hazork.mysouls.commands.MySoulsCommand;

public class SoulsCommand implements MySoulsCommand {

    @Override
    public void handle(CommandSender sender, String[] args, String label) {
	int amount = MySouls.getDB().from((Player) sender).getSoulsCount();
	sender.sendMessage("§aVocê tem §f" + amount + "§a almas.");
    }

    @Override
    public String getName() {
	return "souls";
    }

    @Override
    public boolean predicate(CommandSender sender) {
	return sender instanceof Player;
    }

}
