package me.Eters.CartographerKiller;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import me.Eters.CartographerKiller.CartographerListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.HandlerList;

public class Main extends JavaPlugin{
	
	public CartographerListener carto;
	
	@Override
	public void onEnable(){
		carto = new CartographerListener(this);
		
		getServer().getPluginManager().registerEvents(carto, this);
		if(Bukkit.getPlayer("JustinBv_") != null)
		{
			Bukkit.getPlayer("JustinBv_").sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin Habilitado&a&l!!"));
		}
		
		if(Bukkit.getPlayer("Eters") != null)
		{
			Bukkit.getPlayer("Eters").sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin Habilitado&a&l!!"));
		}
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(carto);
		if(Bukkit.getPlayer("JustinBv_") != null)
		{
			Bukkit.getPlayer("JustinBv_").sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin Deshabilitado&a&l!!"));
		}
		
		if(Bukkit.getPlayer("Eters") != null)
		{
			Bukkit.getPlayer("Eters").sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin Deshabilitado&a&l!!"));
		}
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
