package pvp.blatantmc.comandos;

import org.bukkit.command.*;
import org.bukkit.entity.*;

import pvp.blatantmc.sistemas.*;

public class ApplyCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("aplicar")) {
        	p.sendMessage("");
        	p.sendMessage("              §3§lFORMULÁRIOS");
        	p.sendMessage("");
        	p.sendMessage("§5§lTRIAL §facesse: §f(§7https://discord.gg/eWvbNxw§f)");
        	p.sendMessage("§5§lMODGC §facesse: §f(§7https://discord.gg/eWvbNxw§f)");
        	p.sendMessage("§2§lHELPER §facesse: §f(§7https://discord.gg/eWvbNxw§f)");
        	p.sendMessage("");
        	p.sendMessage("§c§lINFO §fOs formulários estão em nosso discord.");
            p.sendMessage("");
        }
        return false;
    }
}
