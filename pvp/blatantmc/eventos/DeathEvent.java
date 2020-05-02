package pvp.blatantmc.eventos;

import org.bukkit.event.entity.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.scheduler.*;

import pvp.blatantmc.main.*;
import pvp.blatantmc.sistemas.*;

public class DeathEvent implements Listener
{
    @EventHandler
    public void aoMorrer(final PlayerDeathEvent e) {
        final Player morreu = e.getEntity();
        if (e.getEntity().getKiller() instanceof Player) {
            final Player matou = e.getEntity().getKiller();
            KillsDeathsRankXp.adicionarXp(matou, 10);
            KillsDeathsRankXp.removerXp(morreu, 5);
            KillsDeathsRankXp.adicionarKill(matou, 1);
            KillsDeathsRankXp.adicionarDeaths(morreu, 1);
            matou.playSound(matou.getLocation(), Sound.ANVIL_LAND, 5.0f, 1.0f);
            morreu.playSound(morreu.getLocation(), Sound.CREEPER_DEATH, 10.0f, 10.0f);
            matou.sendMessage("�a�lKILL �fVoc� matou �a" + morreu.getName() + "!");
            matou.sendMessage("�a�lXP �fVoc� ganhou �a10XP!");
            morreu.sendMessage("�c�lDEATH �fVoc� morreu para �c" + matou.getName() + "!");
            morreu.sendMessage("�c�lXP �fVoc� perdeu �c5XP!");
            Hability.removeAbility(morreu);
            Cooldown.remove(morreu);
            morreu.teleport(matou.getWorld().getSpawnLocation());
            e.setDeathMessage((String)null);
            WarpAPI.removeWarp(morreu);
            morreu.setAllowFlight(false);
            morreu.setFlying(false);
            ApiManager.tirarEfeitos(morreu);
        }
        else {
            Hability.removeAbility(morreu);
            morreu.setAllowFlight(false);
            morreu.setFlying(false);
            WarpAPI.removeWarp(morreu);
            morreu.teleport(morreu.getWorld().getSpawnLocation());
            Cooldown.remove(morreu);
            e.setDeathMessage((String)null);
            ApiManager.tirarEfeitos(morreu);
        }
    }
    
    @EventHandler
    public void respawnar(final PlayerDeathEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }
        new BukkitRunnable() {
            public void run() {
                e.getEntity().spigot().respawn();
            }
        }.runTask(Main.getPlugin());
    }
}
