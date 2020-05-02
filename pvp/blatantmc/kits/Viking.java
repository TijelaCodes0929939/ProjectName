package pvp.blatantmc.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import pvp.blatantmc.sistemas.Hability;

public class Viking implements Listener {
	@EventHandler
	public void onEntityDamageByEntityEventViking(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player && e.getDamager() instanceof Player) {
			if (Hability.getAbility((Player) e.getDamager()).equalsIgnoreCase("Viking")
					&& e.getEntity() instanceof Player
					&& ((Player) e.getDamager()).getItemInHand().getType() == Material.STONE_AXE) {
				e.setDamage(e.getDamage() * 1.46);
			}
		}
	}
}
