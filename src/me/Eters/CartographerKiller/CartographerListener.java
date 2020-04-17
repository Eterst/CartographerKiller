package me.Eters.CartographerKiller;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;

public class CartographerListener implements Listener{
	/* Event Handler Absoleto
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		event.setJoinMessage("Welcome, " + event.getPlayer().getName() + "!");
	}
	*/
	@EventHandler
	public void onVillagerAcquireTradeEvent(VillagerAcquireTradeEvent event)
	{
		Bukkit.getPlayer("Eters").sendMessage(event.getRecipe().getResult().getData().toString());
		
		if (event.getEntityType().equals(EntityType.VILLAGER))
		{
			Villager villager = (Villager) event.getEntity();
			if (villager.getProfession().compareTo(Profession.CARTOGRAPHER) == 0) {
				event.getRecipe().setVillagerExperience(0);
			}
		}
		
		/* Codigo Viejo Obsoleto
		if (event.getRecipe().getResult().getData().getItemType().equals(Material.LEGACY_MAP)) {//.toString().equalsIgnoreCase("LEGACY_MAP")) {
			Bukkit.getPlayer("Eters").sendMessage("Se encontro mapa!!");
			ItemStack map = new ItemStack(Material.LEGACY_EMPTY_MAP);
			MerchantRecipe recipe = new MerchantRecipe(map,event.getRecipe().getMaxUses());
			recipe.setIngredients(event.getRecipe().getIngredients());
			recipe.setVillagerExperience(event.getRecipe().getVillagerExperience());
			//List<ItemStack> ingredients;
			event.setRecipe(recipe);
		}
		*/
	}
}
