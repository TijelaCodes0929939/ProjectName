package pvp.blatantmc.kits;

import org.bukkit.event.player.*;

import pvp.blatantmc.sistemas.*;

import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.event.*;

public class FisherMan implements Listener
{
    @EventHandler
    public void onPlayerHitFishingrodscorpion(final PlayerFishEvent e) {
        final Player p = e.getPlayer();
        if (e.getCaught() instanceof Player) {
            final Player fisgado = (Player)e.getCaught();
            if (Hability.getAbility(p).equalsIgnoreCase("Fisherman") && p.getItemInHand().getType() == Material.FISHING_ROD) {
                fisgado.teleport(p.getLocation());
                p.sendMessage("�a�lFISHERMAN �fVoc� puxou o jogador �a" + fisgado.getDisplayName());
                fisgado.sendMessage("�c�lFISHERMAN �fVoc� foi puxado por �c" + p.getDisplayName());
            }
        }
    }
}
