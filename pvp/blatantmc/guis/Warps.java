package pvp.blatantmc.guis;

import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

import pvp.blatantmc.sistemas.*;

import org.bukkit.event.inventory.*;
import org.bukkit.command.*;
import org.bukkit.event.*;

public class Warps implements Listener
{
    public static void GuiWarp(final Player p) {
    	Inventory inv = Bukkit.createInventory(null, 27, "§8Warps");
    	
    		    ItemStack vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)1);
    		    ItemMeta vidrom = vidro.getItemMeta();
    		    vidrom.setDisplayName("§6Vidro Laranja");
    		    vidro.setItemMeta(vidrom);
    		    
    			ItemStack vinha = new ItemStack(Material.VINE);
    			ItemMeta vinhaa = vinha.getItemMeta();
    			vinha.setDurability((short) 4);
    			vinhaa.setDisplayName("§2Vinha");
    			vinha.setItemMeta(vinhaa);
    			
    			ItemStack fence = new ItemStack(Material.IRON_FENCE);
    			ItemMeta fencee = fence.getItemMeta();
    			fencee.setDisplayName("§7Barra de Ferro");
    			fence.setItemMeta(fencee);
    			
    			ItemStack vidroz = new ItemStack(Material.STAINED_GLASS_PANE);
    			ItemMeta vidrozz = vidroz.getItemMeta();
    			vidrozz.setDisplayName("§fVidro Branco");
    			vidroz.setItemMeta(vidrozz);
    		    
    		    inv.setItem(0, fence);
    		    inv.setItem(1, vidro);
    		    inv.setItem(2, vidroz);
    		    inv.setItem(3, vidro);
    		    inv.setItem(4, vidroz);
    		    inv.setItem(5, vidro);
    		    inv.setItem(6, vidroz);
    		    inv.setItem(7, vidro);
    		    inv.setItem(8, fence);
    		    inv.setItem(9, vinha);
    		    ApiManager.darItemInv(inv, Material.BLAZE_ROD, 1, 0, "§a§l1V1", 10);
    		    ApiManager.darItemInv(inv, Material.LAVA_BUCKET, 1, 0, "§a§lLAVA CHALLENGE", 11);
    		    ApiManager.darItemInv(inv, Material.GLASS, 1, 0, "§a§lFPS", 12);
    		    inv.setItem(13, vinha);
    		    ApiManager.darItemInv(inv, Material.EYE_OF_ENDER, 1, 0, "§a§lMAIN", 14);
    		    ApiManager.darItemInv(inv, Material.GLOWSTONE, 1, 0, "§a§lBOLOTA", 15);
    		    ApiManager.darItemInv(inv, Material.POTION, 1, 0, "§a§lPOTIONPVP", 16);
    		    inv.setItem(17, vinha);
    		    inv.setItem(18, fence);
    		    inv.setItem(19, vidro);
    		    inv.setItem(20, vidroz);
    		    inv.setItem(21, vidro);
    		    inv.setItem(22, vidroz);
    		    inv.setItem(23, vidro);
    		    inv.setItem(24, vidroz);
    		    inv.setItem(25, vidro);
    		    inv.setItem(26, fence);
    		    p.openInventory(inv);
    		  }
    
    @EventHandler
    public void onPlayerCLickInventry(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getTitle().equalsIgnoreCase("§8Warps") && e.getCurrentItem() != null && e.getCurrentItem().getTypeId() != 0) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
                e.setCancelled(true);
                return;
            }
            if (e.getCurrentItem().getType() == Material.LAVA_BUCKET) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp challenge");
                return;
            }
            if (e.getCurrentItem().getType() == Material.GLASS) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp fps");
                return;
            }
            if (e.getCurrentItem().getType() == Material.EYE_OF_ENDER) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp main");
                return;
            }
            if (e.getCurrentItem().getType() == Material.ANVIL) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "dono");
                return;
            }
            if (e.getCurrentItem().getType() == Material.GLOWSTONE) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp bolota");
                return;
            }
            if (e.getCurrentItem().getType() == Material.POTION) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp potionpvp");
                return;
            }
            if (e.getCurrentItem().getType() == Material.DRAGON_EGG) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "warp spawn");
            }
            if (e.getCurrentItem().getType() == Material.BLAZE_ROD) {
                e.setCancelled(true);
                Bukkit.dispatchCommand((CommandSender)p, "1v1");
            }
        }
    }
}
