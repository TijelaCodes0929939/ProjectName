package pvp.blatantmc.kits;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import pvp.blatantmc.sistemas.Hability;

public class Snail implements Listener {

	@EventHandler
	public void onEntityDamageByEntityEventSnail(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
			if (Hability.getAbility((Player) e.getDamager()).equalsIgnoreCase("Snail")) {
				if (new Random().nextInt(100) >= 67) {
					((Player) e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 80, 1));
				}
			}
		}
	}

}
