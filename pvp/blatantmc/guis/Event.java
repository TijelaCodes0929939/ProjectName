package pvp.blatantmc.guis;

import java.util.*;
import org.bukkit.event.player.*;

import pvp.blatantmc.sistemas.*;

import org.bukkit.event.block.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class Event implements Listener
{
    public static ArrayList<String> aocaixa;
    
    static {
        Event.aocaixa = new ArrayList<String>();
    }
    
    @EventHandler
    public void onBauKit(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType().equals((Object)Material.CHEST) && p.getItemInHand().getItemMeta().hasDisplayName() && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Kits §7(Clique)")) {
            e.setCancelled(true);
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Kits.GuiKit(p);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
            }
        }
    }
    
    @EventHandler
    public void onWarp(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType().equals((Object)Material.COMPASS) && p.getItemInHand().getItemMeta().hasDisplayName() && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Warps §7(Clique)")) {
            e.setCancelled(true);
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Warps.GuiWarp(p);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
            }
        }
    }
    
    @EventHandler
    public void onLojas(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType().equals((Object)Material.GOLD_INGOT) && p.getItemInHand().getItemMeta().hasDisplayName() && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Lojas §7(Clique)")) {
            e.setCancelled(true);
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Lojas.GuiLojas(p);
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
            }
        }
    }
    
    @EventHandler
    public void onCaixa(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (p.getItemInHand().getType().equals((Object)Material.ENDER_CHEST) && p.getItemInHand().getItemMeta().hasDisplayName() && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Caixa §7(Clique)")) {
            e.setCancelled(true);
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (KillsDeathsRankXp.getCaixa(p) >= 1) {
                    if (Event.aocaixa.contains(p.getName())) {
                        p.sendMessage("§c§lCAIXA §fVocê já está abrindo uma caixa!");
                        return;
                    }
                    Caixa.GuiCaixas(p);
                    KillsDeathsRankXp.removerCaixa(p, 1);
                    Event.aocaixa.add(p.getName());
                }
                else {
                    p.sendMessage("§c§lCAIXA §fVocê não possui nenhuma caixa!");
                }
                p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0f, 1.0f);
            }
        }
    }
}
