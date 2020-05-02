package pvp.blatantmc.guis;

import org.bukkit.entity.*;
import org.bukkit.inventory.*;
import org.bukkit.plugin.*;

import pvp.blatantmc.main.*;
import pvp.blatantmc.sistemas.*;

import java.util.*;
import ru.tehkode.permissions.bukkit.*;
import org.bukkit.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.*;

public class Caixa implements Listener
{
    private static HashMap<String, String> kitsorteado;
    
    static {
        Caixa.kitsorteado = new HashMap<String, String>();
    }
    
    public static void GuiCaixas(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 9, "�8Sorteador");
        final ItemStack vidrob = new ItemStack(Material.STAINED_GLASS_PANE);
        final ItemStack vidror = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)10);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(0, vidrob);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 10L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(1, vidror);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 15L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(2, vidrob);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 20L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(3, vidror);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 25L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(4, vidrob);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 30L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(5, vidror);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 35L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(6, vidrob);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 40L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(7, vidror);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 45L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                inv.setItem(8, vidrob);
                p.playSound(p.getLocation(), Sound.CLICK, 1.0f, 1.0f);
            }
        }, 50L);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
            @Override
            public void run() {
                final int r = new Random().nextInt(3);
                if (r == 0) {
                    SortearKit(inv, p, "Gaara", Material.SAND);
                }
                if (r == 1) {
                    SortearKit(inv, p, "Magma", Material.LAVA_BUCKET);
                }
                if (r == 2) {
                    SortearKit(inv, p, "Avatar", Material.BEACON);
                }
                if (r == 3) {
                    SortearKit(inv, p, "Shooter", Material.BONE);
                }
                if (r == 4) {
                    SortearKit(inv, p, "HotPotato", Material.BAKED_POTATO);
                }
            }
        }, 55L);
        p.openInventory(inv);
    }
    
    private static void SortearKit(final Inventory inv, final Player p, final String kit, final Material mat) {
        Caixa.kitsorteado.put(p.getName(), kit);
        final ItemStack item = new ItemStack(mat);
        final ItemMeta itemm = item.getItemMeta();
        itemm.setDisplayName("�a�lKIT �f" + Caixa.kitsorteado.get(p.getName()));
        item.setItemMeta(itemm);
        if (!p.hasPermission("kit." + kit)) {
            PermissionsEx.getUser(p.getName()).addPermission("kit." + kit);
            p.sendMessage("�a�lKIT �fVoc� ganhou o kit: �a" + Caixa.kitsorteado.get(p.getName()));
            inv.setItem(4, item);
            Caixa.kitsorteado.remove(p.getName());
            ApiManager.playFirework(p.getLocation(), Color.AQUA, p);
            Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstance(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.closeInventory();
                    Event.aocaixa.remove(p.getName());
                }
            }, 65L);
        }
        else {
        	p.sendMessage("�c�lKIT �fVoc� j� possui o kit!");
            p.sendMessage("�a�lRECOMPENSA �fVoc� ganhou de recompensa de �a500XP!");
            KillsDeathsRankXp.adicionarXp(p, 500);
            Caixa.kitsorteado.remove(p.getName());
            ApiManager.playFirework(p.getLocation(), Color.AQUA, p);
            final ItemStack item2 = new ItemStack(Material.EXP_BOTTLE);
            final ItemMeta itemm2 = item2.getItemMeta();
            itemm2.setDisplayName("�a�lXP �f500!");
            item2.setItemMeta(itemm2);
            inv.setItem(4, item2);
            Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.getInstance(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.closeInventory();
                    Event.aocaixa.remove(p.getName());
                }
            }, 65L);
        }
    }
    
    @EventHandler
    public void aoMecher(final InventoryClickEvent e) {
        if (e.getInventory().getTitle().equalsIgnoreCase("�8Sorteador") && e.getCurrentItem() != null && e.getCurrentItem().getTypeId() != 0) {
            e.setCancelled(true);
        }
    }
}
