package pvp.blatantmc.guis;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Kits implements Listener
{
    public static ArrayList<String> emarray;
    public static ArrayList<String> emarray1;
    
    static {
        Kits.emarray = new ArrayList<String>();
        Kits.emarray1 = new ArrayList<String>();
    }
    
    public static void GuiKit(final Player p) {
    	
    	Inventory inv = Bukkit.createInventory((InventoryHolder) null, 54, "§8Kits");

		ItemStack vidroa = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidroaa = vidroa.getItemMeta();
		vidroaa.setDisplayName("§fVidro Branco");
		vidroa.setItemMeta(vidroaa);

		ItemStack vidrob = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidrobb = vidrob.getItemMeta();
		vidrobb.setDisplayName("§fVidro Branco");
		vidrob.setItemMeta(vidrobb);

		ItemStack vidroz = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidrozz = vidroz.getItemMeta();
		vidroz.setDurability((short) 1);
		vidrozz.setDisplayName("§6Vidro Laranja");
		vidroz.setItemMeta(vidrozz);

		ItemStack vinha = new ItemStack(Material.VINE);
		ItemMeta vinhaa = vinha.getItemMeta();
		vinhaa.setDisplayName("§2Vinha");
		vinha.setItemMeta(vinhaa);

		ItemStack fence = new ItemStack(Material.IRON_FENCE);
		ItemMeta fencee = fence.getItemMeta();
		fencee.setDisplayName("§7Barra de Ferro");
		fence.setItemMeta(fencee);

		inv.setItem(0, vidroz);
		inv.setItem(1, fence);
		inv.setItem(2, vidroa);
		inv.setItem(3, vinha);
		inv.setItem(4, vinha);
		inv.setItem(5, vinha);
		inv.setItem(6, vidroa);
		inv.setItem(7, fence);
		inv.setItem(8, vidroz);
		inv.setItem(9, fence);
		inv.setItem(10, vidroa);
		inv.setItem(16, vidroa);
		inv.setItem(17, fence);
		inv.setItem(18, vidroa);
		inv.setItem(26, vidroa);
		inv.setItem(27, vidrob);
		inv.setItem(35, vidrob);
		inv.setItem(36, fence);
		inv.setItem(37, vidrob);
		inv.setItem(43, vidrob);
		inv.setItem(44, fence);
		inv.setItem(45, vidroz);
		inv.setItem(46, fence);
		inv.setItem(47, vidroa);
		inv.setItem(47, vidroa);
		inv.setItem(48, vinha);
		inv.setItem(50, vinha);
		inv.setItem(49, vidroa);
		inv.setItem(49, vidroa);
		inv.setItem(50, vinha);
		inv.setItem(49, vidroz);
		inv.setItem(51, vidroa);
		inv.setItem(52, fence);
		inv.setItem(53, vidroz);
		
        if (p.hasPermission("kit.pvp")) {
            final ItemStack pyro = new ItemStack(Material.STONE_SWORD);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fPvP");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Treine seu pvp sem habilidades!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        
        if (p.hasPermission("kit.ajnin")) {
            final ItemStack pyro = new ItemStack(Material.NETHER_STAR);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fAjnin");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Puxe o jogador para você!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.viper")) {
            final ItemStack pyro = new ItemStack(Material.SPIDER_EYE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fViper");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Ao atingir seu inimigo");
            descpyro.add("§7Faça com que ele receba veneno!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.urgal")) {
            final ItemStack pyro = new ItemStack(Material.REDSTONE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fUrgal");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Seja mais forte com uma poção de força!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.ninja")) {
            final ItemStack pyro = new ItemStack(Material.COMPASS);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fNinja");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Teleporte para seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.shooter")) {
            final ItemStack pyro = new ItemStack(Material.BONE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fShooter");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Atire em seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.timelord")) {
            final ItemStack pyro = new ItemStack(Material.WATCH);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fTimeLord");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Congele outros jogadores ao seu redor!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.critical")) {
            final ItemStack pyro = new ItemStack(Material.REDSTONE_BLOCK);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fCritical");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7De um dano crítico em seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.fisherman")) {
            final ItemStack pyro = new ItemStack(Material.FISHING_ROD);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fFisherman");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Fisgue seu inimigo para você!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.magma")) {
            final ItemStack pyro = new ItemStack(Material.LAVA_BUCKET);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fMagma");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Queime seu inimigo com seu fogo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.gladiator")) {
            final ItemStack pyro = new ItemStack(Material.IRON_FENCE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fGladiator");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Batalhe com seu inimigo a uma arena no céu!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.hotpotato")) {
            final ItemStack pyro = new ItemStack(Material.BAKED_POTATO);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fHotpotato");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Exploda a cabeça de seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.stomper")) {
            final ItemStack pyro = new ItemStack(Material.IRON_BOOTS);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fStomper");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Esmague seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.avatar")) {
            final ItemStack pyro = new ItemStack(Material.BEACON);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fAvatar");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Domine os quatro elementos da terra!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.monk")) {
            final ItemStack pyro = new ItemStack(Material.BLAZE_ROD);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fMonk");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Bagunçe o inventário de seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.thor")) {
            final ItemStack pyro = new ItemStack(Material.GOLD_AXE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fThor");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Faça que você");
            descpyro.add("§7Sumone um raio dos céus para atingir seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.gaara")) {
            final ItemStack pyro = new ItemStack(Material.SAND);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fGaara");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Prenda seu inimigo em uma caixa de areia!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.boxer")) {
            final ItemStack pyro = new ItemStack(Material.QUARTZ);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fBoxer");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7De o dobro de dano de uma espada de pedra!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.poseidon")) {
            final ItemStack pyro = new ItemStack(Material.WATER_BUCKET);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fPoseidon");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Tenha novos poderes dentro da água!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.phantom")) {
            final ItemStack pyro = new ItemStack(Material.FEATHER);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fPhantom");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Vire um fantasma e voe para os céus!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.snail")) {
            final ItemStack pyro = new ItemStack(Material.COAL);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fSnail");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7De efeitos de lentidão para seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.flash")) {
            final ItemStack pyro = new ItemStack(Material.REDSTONE_TORCH_ON);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fFlash");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Roube a velocidade de seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.viking")) {
            final ItemStack pyro = new ItemStack(Material.STONE_AXE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fViking");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7De muito dano com seu machado!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });
        }
        if (p.hasPermission("kit.turtle")) {
            final ItemStack pyro = new ItemStack(Material.DIAMOND_CHESTPLATE);
            final ItemMeta metapyro = pyro.getItemMeta();
            metapyro.setDisplayName("§e§lKIT: §fTurtle");
            final ArrayList<String> descpyro = new ArrayList<String>();
            descpyro.add("§f");
            descpyro.add("§7Ao apertar shift");
            descpyro.add("§7Você não irá bater em seu inimigo!");
            metapyro.setLore((List)descpyro);
            pyro.setItemMeta(metapyro);
            inv.addItem(new ItemStack[] { pyro });

        }
        p.openInventory(inv);
    }
    
    @EventHandler
    public void onPlayerCLickInventry(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getTitle().equalsIgnoreCase("§8Kits") && e.getCurrentItem() != null && e.getCurrentItem().getTypeId() != 0) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
                e.setCancelled(true);
                return;
            }
            if (e.getCurrentItem().getType() == Material.STONE_SWORD) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit pvp");
                return;
            }
            if (e.getCurrentItem().getType() == Material.BONE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit shooter");
                return;
            }
            if (e.getCurrentItem().getType() == Material.REDSTONE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit urgal");
                return;
            }
            if (e.getCurrentItem().getType() == Material.SPIDER_EYE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit viper");
                return;
            }
            if (e.getCurrentItem().getType() == Material.COMPASS) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit ninja");
                return;
            }
            if (e.getCurrentItem().getType() == Material.WATCH) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit timelord");
                return;
            }
            if (e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit critical");
                return;
            }
            if (e.getCurrentItem().getType() == Material.ANVIL) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit anchor");
                return;
            }
            if (e.getCurrentItem().getType() == Material.FISHING_ROD) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit fisherman");
                return;
            }
            if (e.getCurrentItem().getType() == Material.NETHER_STAR) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit ajnin");
                return;
            }
            if (e.getCurrentItem().getType() == Material.LAVA_BUCKET) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit magma");
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lKIT: §fGladiator")) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit gladiator");
                return;
            }
            if (e.getCurrentItem().getType() == Material.BAKED_POTATO) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit hotpotato");
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lKIT: §fStomper")) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit stomper");
                return;
            }
            if (e.getCurrentItem().getType() == Material.BEACON) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit avatar");
                return;
            }
            if (e.getCurrentItem().getType() == Material.BLAZE_ROD) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit monk");
                return;
            }
            if (e.getCurrentItem().getType() == Material.GOLD_AXE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit thor");
                return;
            }
            if (e.getCurrentItem().getType() == Material.SAND) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit gaara");
                return;
            }
            if (e.getCurrentItem().getType() == Material.QUARTZ) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit boxer");
                return;
            }
            if (e.getCurrentItem().getType() == Material.WATER_BUCKET) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit poseidon");
                return;
            }
            if (e.getCurrentItem().getType() == Material.FEATHER) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit phantom");
                return;
            }
            if (e.getCurrentItem().getType() == Material.STONE_AXE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit viking");
                return;
            }
            if (e.getCurrentItem().getType() == Material.COAL) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit snail");
                return;
            }
            if (e.getCurrentItem().getType() == Material.REDSTONE_TORCH_ON) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit flash");
                return;
            }
            if (e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE) {
                e.setCancelled(true);
                p.closeInventory();
                p.chat("/kit turtle");
                return;
            }
        }
    }
}
