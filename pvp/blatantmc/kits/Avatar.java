package pvp.blatantmc.kits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.Vector;

import pvp.blatantmc.main.Main;
import pvp.blatantmc.sistemas.ApiManager;
import pvp.blatantmc.sistemas.Cooldown;
import pvp.blatantmc.sistemas.Hability;

public class Avatar implements Listener
{
    public static List<String> arAvatar;
    public static List<String> aguaAvatar;
    public static List<String> terraAvatar;
    public static List<String> fogoAvatar;
    
    static {
        Avatar.arAvatar = new ArrayList<String>();
        Avatar.aguaAvatar = new ArrayList<String>();
        Avatar.terraAvatar = new ArrayList<String>();
        Avatar.fogoAvatar = new ArrayList<String>();
    }
    
    @EventHandler
    public void aoAvatar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (Hability.getAbility(p).equalsIgnoreCase("Avatar")) {
            final ItemStack ar = new ItemStack(Material.WOOL);
            final ItemMeta arm = ar.getItemMeta();
            arm.setDisplayName("�e�lKIT �fAvatar �7(AR)");
            ar.setItemMeta(arm);
            final ItemStack agua = new ItemStack(Material.LAPIS_BLOCK);
            final ItemMeta aguam = agua.getItemMeta();
            aguam.setDisplayName("�e�lKIT �fAvatar �7(�GUA)");
            agua.setItemMeta(aguam);
            final ItemStack terra = new ItemStack(Material.GRASS);
            final ItemMeta terram = terra.getItemMeta();
            terram.setDisplayName("�e�lKIT �fAvatar �7(TERRA)");
            terra.setItemMeta(terram);
            final ItemStack fogo = new ItemStack(Material.REDSTONE_BLOCK);
            final ItemMeta fogom = fogo.getItemMeta();
            fogom.setDisplayName("�e�lKIT �fAvatar �7(FOGO)");
            fogo.setItemMeta(fogom);
            if ((e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.BEACON) {
                p.setItemInHand(ar);
                Avatar.arAvatar.add(p.getName());
            }
            else if (Avatar.arAvatar.contains(p.getName()) && (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().equals((Object)ar)) {
                p.setItemInHand(agua);
                Avatar.arAvatar.remove(p.getName());
                Avatar.aguaAvatar.add(p.getName());
            }
            else if (Avatar.aguaAvatar.contains(p.getName()) && (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().equals((Object)agua)) {
                p.setItemInHand(terra);
                Avatar.aguaAvatar.remove(p.getName());
                Avatar.terraAvatar.add(p.getName());
            }
            else if (Avatar.terraAvatar.contains(p.getName()) && (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().equals((Object)terra)) {
                p.setItemInHand(fogo);
                Avatar.terraAvatar.remove(p.getName());
                Avatar.fogoAvatar.add(p.getName());
            }
            else if (Avatar.fogoAvatar.contains(p.getName()) && (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) && p.getItemInHand().equals((Object)fogo)) {
                p.setItemInHand(ar);
                Avatar.fogoAvatar.remove(p.getName());
                Avatar.arAvatar.add(p.getName());
            }
        }
    }
    
    @EventHandler
    public void ar(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (Hability.getAbility(p).equalsIgnoreCase("Avatar") && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.WOOL) {
            e.setCancelled(true);
            p.updateInventory();
            if (Cooldown.add(p)) {
                ApiManager.MensagemCooldown(p);
                return;
            }
            Cooldown.add(p, 30);
            final Location location = p.getEyeLocation();
            final BlockIterator blocksToAdd = new BlockIterator(location, 0.0, 40);
            while (blocksToAdd.hasNext()) {
                final Location blockToAdd = blocksToAdd.next().getLocation();
                p.getWorld().playEffect(blockToAdd, Effect.STEP_SOUND, (Object)Material.WOOL, 15);
                p.playSound(blockToAdd, Sound.FIREWORK_BLAST, 3.0f, 3.0f);
            }
            final Snowball h = (Snowball)p.launchProjectile((Class)Snowball.class);
            final Vector velo1 = p.getLocation().getDirection().normalize().multiply(10);
            h.setVelocity(velo1);
            h.setMetadata("ar", (MetadataValue)new FixedMetadataValue(Main.plugin, (Object)true));
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.sendMessage(ApiManager.fimcooldown);
                }
            }, 600L);
        }
    }
    
    @EventHandler
    public void danoar(final EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Snowball) {
            final Snowball s = (Snowball)e.getDamager();
            if (s.hasMetadata("ar")) {
                ((LivingEntity)e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 2), true);
                e.setDamage(e.getDamage() + 8.0);
            }
        }
    }
    
    @EventHandler
    public void agua(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (Hability.getAbility(p).equalsIgnoreCase("Avatar") && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.LAPIS_BLOCK) {
            e.setCancelled(true);
            p.updateInventory();
            if (Cooldown.add(p)) {
                ApiManager.MensagemCooldown(p);
                return;
            }
            Cooldown.add(p, 30);
            final Location location = p.getEyeLocation();
            final BlockIterator blocksToAdd = new BlockIterator(location, 0.0, 40);
            while (blocksToAdd.hasNext()) {
                final Location blockToAdd = blocksToAdd.next().getLocation();
                p.getWorld().playEffect(blockToAdd, Effect.STEP_SOUND, (Object)Material.LAPIS_BLOCK, 15);
                p.playSound(blockToAdd, Sound.FIREWORK_BLAST, 3.0f, 3.0f);
            }
            final Snowball h = (Snowball)p.launchProjectile((Class)Snowball.class);
            final Vector velo1 = p.getLocation().getDirection().normalize().multiply(10);
            h.setVelocity(velo1);
            h.setMetadata("agua", (MetadataValue)new FixedMetadataValue(Main.plugin, (Object)true));
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.sendMessage(ApiManager.fimcooldown);
                }
            }, 600L);
        }
    }
    
    @EventHandler
    public void danoagua(final EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Snowball) {
            final Snowball s = (Snowball)e.getDamager();
            if (s.hasMetadata("agua")) {
                ((LivingEntity)e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 1), true);
                e.setDamage(e.getDamage() + 8.0);
            }
        }
    }
    
    @EventHandler
    public void terra(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (Hability.getAbility(p).equalsIgnoreCase("Avatar") && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.GRASS) {
            e.setCancelled(true);
            p.updateInventory();
            if (Cooldown.add(p)) {
                ApiManager.MensagemCooldown(p);
                return;
            }
            Cooldown.add(p, 30);
            final Location location = p.getEyeLocation();
            final BlockIterator blocksToAdd = new BlockIterator(location, 0.0, 40);
            while (blocksToAdd.hasNext()) {
                final Location blockToAdd = blocksToAdd.next().getLocation();
                p.getWorld().playEffect(blockToAdd, Effect.STEP_SOUND, (Object)Material.GRASS, 15);
                p.playSound(blockToAdd, Sound.FIREWORK_BLAST, 3.0f, 3.0f);
            }
            final Snowball h = (Snowball)p.launchProjectile((Class)Snowball.class);
            final Vector velo1 = p.getLocation().getDirection().normalize().multiply(10);
            h.setVelocity(velo1);
            h.setMetadata("terra", (MetadataValue)new FixedMetadataValue(Main.plugin, (Object)true));
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.sendMessage(ApiManager.fimcooldown);
                }
            }, 600L);
        }
    }
    
    @EventHandler
    public void danoterra(final EntityDamageByEntityEvent e) {
        final Entity Player1 = e.getEntity();
        if (e.getDamager() instanceof Snowball) {
            final Snowball Player2 = (Snowball)e.getDamager();
            if (Player2.hasMetadata("terra")) {
                e.setDamage(8.0);
                final Vector vector = Player1.getLocation().getDirection();
                vector.multiply(-3.2f);
                Player1.setVelocity(vector);
            }
        }
    }
    
    @EventHandler
    public void fogo(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (Hability.getAbility(p).equalsIgnoreCase("Avatar") && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.REDSTONE_BLOCK) {
            e.setCancelled(true);
            p.updateInventory();
            if (Cooldown.add(p)) {
                ApiManager.MensagemCooldown(p);
                return;
            }
            Cooldown.add(p, 30);
            final Location location = p.getEyeLocation();
            final BlockIterator blocksToAdd = new BlockIterator(location, 0.0, 40);
            while (blocksToAdd.hasNext()) {
                final Location blockToAdd = blocksToAdd.next().getLocation();
                p.getWorld().playEffect(blockToAdd, Effect.STEP_SOUND, (Object)Material.REDSTONE_BLOCK, 15);
                p.playSound(blockToAdd, Sound.FIREWORK_BLAST, 3.0f, 3.0f);
            }
            final Snowball h = (Snowball)p.launchProjectile((Class)Snowball.class);
            final Vector velo1 = p.getLocation().getDirection().normalize().multiply(10);
            h.setVelocity(velo1);
            h.setMetadata("fogo", (MetadataValue)new FixedMetadataValue(Main.plugin, (Object)true));
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, (Runnable)new Runnable() {
                @Override
                public void run() {
                    p.sendMessage(ApiManager.fimcooldown);
                }
            }, 600L);
        }
    }
    
    @EventHandler
    public void danofogo(final EntityDamageByEntityEvent e) {
        final Entity player1 = e.getEntity();
        if (e.getDamager() instanceof Snowball) {
            final Snowball player2 = (Snowball)e.getDamager();
            if (player2.hasMetadata("fogo")) {
                e.setDamage(8.0);
                player1.setFireTicks(100);
            }
        }
    }
}
