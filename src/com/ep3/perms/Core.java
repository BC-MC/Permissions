package com.ep3.perms;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("[Permissions] Enabled!");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("[Permissions] Disable!");
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "This Command can only be ran by a player!");
			 return true;
		}
		
		Player player = (Player) sender;
		
		if (command.getName().equalsIgnoreCase("perms")){
			if (player.hasPermission("perms.user")){
				player.sendMessage(ChatColor.GREEN + "This is the perms of the new show!");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have permission!");
			}
			
		}
		
		return true;
	}
	

}
