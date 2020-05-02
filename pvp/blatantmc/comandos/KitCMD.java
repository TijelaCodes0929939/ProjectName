package pvp.blatantmc.comandos;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import pvp.blatantmc.sistemas.ApiManager;
import pvp.blatantmc.sistemas.Hability;

public class KitCMD implements CommandExecutor
{
	
	private boolean manutencao = true;
	
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (label.equalsIgnoreCase("kit")) {
            if (args.length == 0) {
                p.sendMessage("�c�lKIT �fUtilize: /kit (nome)");
                return true;
            }
            if (!Hability.getAbility(p).equals("Nenhum")) {
                p.sendMessage(ApiManager.comkit);
                return true;
            }
            if (args[0].equalsIgnoreCase("pvp")) {
                if (p.hasPermission("kit.pvp")) {
                    p.getInventory().clear();
                    ApiManager.darItemEnchant(p, Material.STONE_SWORD, 1, "�aEspada", 0, Enchantment.DAMAGE_ALL, 1, true);
                    p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "PvP");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("shooter")) {
                if (p.hasPermission("kit.shooter")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.BONE, 1, "�7Kit �eShooter", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Shooter");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("timelord")) {
                if (p.hasPermission("kit.timelord")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.WATCH, 1, "�7Kit �eTimeLord", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "TimeLord");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("urgal")) {
                if (p.hasPermission("kit.urgal")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.REDSTONE, 1, "�7Kit �eUrgal", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Urgal");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("critical")) {
                if (p.hasPermission("kit.critical")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Critical");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("viper")) {
                if (p.hasPermission("kit.viper")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Viper");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("fisherman")) {
                if (p.hasPermission("kit.fisherman")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.FISHING_ROD, 1, "�7Kit �eFisherman", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Fisherman");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("ninja")) {
                if (p.hasPermission("kit.ninja")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Ninja");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("magma")) {
                if (p.hasPermission("kit.magma")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Magma");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("gladiator")) {
                if (p.hasPermission("kit.gladiator")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.IRON_FENCE, 1, "�7Kit �eGladiator", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Gladiator");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("hotpotato")) {
                if (p.hasPermission("kit.hotpotato")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.getMaterial(392), 1, "�7Kit �eHotPotato", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "HotPotato");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("stomper")) {
                if (p.hasPermission("kit.stomper")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Stomper");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("avatar")) {
                if (p.hasPermission("kit.avatar")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.BEACON, 1, "�7Kit �eAvatar", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Avatar");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("monk")) {
                if (p.hasPermission("kit.monk")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.BLAZE_ROD, 1, "�7Kit �eMonk", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Monk");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("thor")) {
                if (p.hasPermission("kit.thor")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.GOLD_AXE, 1, "�7Kit �eThor", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Thor");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("gaara")) {
                if (p.hasPermission("kit.gaara")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.SAND, 1, "�7Kit �eGaara", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Gaara");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("boxer")) {
                if (p.hasPermission("kit.boxer")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.QUARTZ, 1, "�7Boxer", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Boxer");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("poseidon")) {
                if (p.hasPermission("kit.poseidon")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Poseidon");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("phantom")) {
                if (p.hasPermission("kit.phantom")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.FEATHER, 1, "�7Kit �ePhantom", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Phantom");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("snail")) {
                if (p.hasPermission("kit.snail")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Snail");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("flash")) {
                if (p.hasPermission("kit.flash")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.REDSTONE_TORCH_ON, 1, "�7Kit �eFlash", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Flash");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("viking")) {
                if (p.hasPermission("kit.viking")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_AXE, 1, "�7Machado de Pedra", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Viking");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("turtle")) {
                if (p.hasPermission("kit.turtle")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Turtle");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("ajnin")) {
                if (p.hasPermission("kit.ajnin")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Ajnin");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("ninja")) {
                if (p.hasPermission("kit.ninja")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Ninja");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("reverse")) {
                if (p.hasPermission("kit.reverse")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Reverse");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("pyro")) {
                if (p.hasPermission("kit.pyro")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darItem(p, Material.FIREBALL, 1, "�7Kit �ePyro", 1);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Pyro");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("resouper")) {
                if (p.hasPermission("kit.resouper")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Resouper");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("viper")) {
                if (p.hasPermission("kit.viper")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Viper");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("snail")) {
                if (p.hasPermission("kit.snail")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Snail");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
            if (args[0].equalsIgnoreCase("hulk")) {
                if (p.hasPermission("kit.hulk")) {
                    p.getInventory().clear();
                    ApiManager.darItem(p, Material.STONE_SWORD, 1, "�7Espada", 0);
                    ApiManager.darSopa(p, 34);
                    p.setGameMode(GameMode.ADVENTURE);
                    Hability.setAbility(p, "Hulk");
                    p.sendMessage("�a�lKIT �fVoc� selecionou o kit �a" + Hability.getAbility(p));
                    SetarenaCMD.TeleportArenaRandom(p);
                }
                else {
                    p.sendMessage(ApiManager.semkit);
                }
            }
                }
        return false;
    
        
    }
}
