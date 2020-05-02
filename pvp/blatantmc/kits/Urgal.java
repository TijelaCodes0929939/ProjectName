package pvp.blatantmc.kits;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import pvp.blatantmc.sistemas.Cooldown;
import pvp.blatantmc.sistemas.Hability;

public class Urgal implements Listener {

	@EventHandler
	public void onPlayerInteractEventUrgal(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK
				&& e.getPlayer().getItemInHand().getType() == Material.REDSTONE) {
			if (e.getPlayer().getItemInHand().getType().equals(Material.REDSTONE)) {
				if (!(Hability.getAbility(e.getPlayer()) == "Urgal")) {
					return;
				}
				if (Cooldown.add(e.getPlayer())) {
					e.getPlayer().sendMessage("§c§lCOOLDOWN §fVocê está em cooldown, aguarde §c"
							+ Cooldown.cooldown(e.getPlayer()) + "§f para usar novamente.");
					return;
				}

				e.getPlayer().sendMessage("§a§lURGAL §fVocê ativou seu kit e recebeu §aFORÇA!");
				e.setCancelled(true);
				e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 250, 0));
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLAZE_DEATH, 1.0F, 1.0F);
				Cooldown.add(e.getPlayer(), 20);
			}
		}
	}

}
