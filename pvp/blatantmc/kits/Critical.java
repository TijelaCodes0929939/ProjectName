package pvp.blatantmc.kits;

import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import pvp.blatantmc.sistemas.Hability;

public class Critical implements Listener {

	@EventHandler
	public void dano(EntityDamageByEntityEvent e) {
		if ((e.getEntity() instanceof Player) && (e.getDamager() instanceof Player)) {
			Player p = (Player) e.getEntity();
			Player d = (Player) e.getDamager();
			if (Hability.getAbility(p).equalsIgnoreCase("Critical")) {
				Random r = new Random();
				int c = r.nextInt(100);
				if (c <= 30) {
					e.setDamage(e.getDamage() + 1.5D);
					p.getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.REDSTONE_BLOCK, 10);
					p.sendMessage("§e§lCRITICAL §fVocê recebeu um golpe critico de §e" + d.getName() + "!");
				}
			}
		}
	}
}
