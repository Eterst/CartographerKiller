package me.Eters.CartographerKiller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new CartographerListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//Hello
		if (label.equalsIgnoreCase("hello")) {
			
			if (sender instanceof Player) {
				Player p = (Player) sender;
				p.sendMessage(ChatColor.GOLD + " Hey!"+ ChatColor.AQUA + "How are you" + ChatColor.BOLD + ChatColor.RED + "?");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&',"&bHey, &1How &2are &3your&4!"));
				return true;
			}
		}
		
		return false;
	}
} 
