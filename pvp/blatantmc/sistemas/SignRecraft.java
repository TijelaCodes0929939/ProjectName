package pvp.blatantmc.sistemas;

import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import org.bukkit.event.block.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.meta.*;

public class SignRecraft implements Listener
{
    @EventHandler
    public void onSignChange(final SignChangeEvent e) {
        if (e.getLine(0).equalsIgnoreCase("recraft")) {
            e.setLine(0, "�8=-=-=-=-=");
            e.setLine(1, "�6�lBLATANT");
            e.setLine(2, "�a�lRECRAFT");
            e.setLine(3, "�8=-=-=-=-=");
        }
    }
    
    @EventHandler
    public void inv(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        final ItemStack red = new ItemStack(Material.RED_MUSHROOM, 64);
        final ItemMeta redm = red.getItemMeta();
        redm.setDisplayName("�cCogumelo");
        red.setItemMeta(redm);
        final ItemStack brown = new ItemStack(Material.BROWN_MUSHROOM, 64);
        final ItemMeta brownm = brown.getItemMeta();
        brownm.setDisplayName("�6Cogumelo");
        brown.setItemMeta(brownm);
        final ItemStack pote = new ItemStack(Material.BOWL, 64);
        final ItemMeta potem = pote.getItemMeta();
        potem.setDisplayName("�7Pote");
        pote.setItemMeta(potem);
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock() != null && (e.getClickedBlock().getType() == Material.WALL_SIGN || e.getClickedBlock().getType() == Material.SIGN_POST)) {
            final Sign s = (Sign)e.getClickedBlock().getState();
            final String[] lines = s.getLines();
            if (lines.length > 0 && lines[0].equals("�8=-=-=-=-=") && lines.length > 1 && lines[1].equals("�6�lBLATANT") && lines.length > 2 && lines[2].equals("�a�lRECRAFT") && lines.length > 3 && lines[3].equals("�8=-=-=-=-=")) {
                p.getInventory().addItem(new ItemStack[] { red });
                p.getInventory().addItem(new ItemStack[] { brown });
                p.getInventory().addItem(new ItemStack[] { pote });
                p.updateInventory();
            }
        }
    }
    
    @EventHandler
    public void onPlayerColor(final SignChangeEvent e) {
        if (e.getLine(0).contains("&")) {
            e.setLine(0, e.getLine(0).replace("&", "�"));
        }
        if (e.getLine(1).contains("&")) {
            e.setLine(1, e.getLine(1).replace("&", "�"));
        }
        if (e.getLine(2).contains("&")) {
            e.setLine(2, e.getLine(2).replace("&", "�"));
        }
        if (e.getLine(3).contains("&")) {
            e.setLine(3, e.getLine(3).replace("&", "�"));
        }
    }
}
