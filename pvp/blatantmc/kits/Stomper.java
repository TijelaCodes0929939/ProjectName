package pvp.blatantmc.kits;

import java.util.Iterator;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import pvp.blatantmc.sistemas.Hability;

public class Stomper implements Listener {

	@EventHandler
	public void KitEvent(EntityDamageEvent e) {
		if (!(e.getEntity() instanceof Player)) {
			return;
		}
		Player p = (Player) e.getEntity();
		if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
			if (Hability.getAbility(p).equalsIgnoreCase("Stomper")) {
				for (Iterator<?> localIterator = p.getNearbyEntities(4.0D, 1.5D, 4.0D).iterator(); localIterator
						.hasNext();) {
					Entity entidade;
					if (((entidade = (Entity) localIterator.next()) instanceof Player)) {
						Player stompado = (Player) entidade;
						if (e.getDamage() <= 4.0D) {
							e.setCancelled(true);
							return;
						}
						if (stompado.isSneaking()) {
							stompado.damage(6.0D, p);
						} else {
							stompado.damage(e.getDamage(), p);
						}
					}
				}
				e.setDamage(4.0D);
			}
		}
	}
}
