package pvp.blatantmc.comandos;

import java.util.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;

import pvp.blatantmc.sistemas.*;

import org.bukkit.*;

public class ReportCMD implements CommandExecutor
{
    public String[] aliases;
    public String description;
    public static ArrayList<String> reportou;
    
    static {
        ReportCMD.reportou = new ArrayList<String>();
    }
    
    public ReportCMD() {
        this.aliases = new String[] { "report" };
        this.description = "Reportar";
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        final Player p = (Player)sender;
        if (args.length < 2) {
            p.sendMessage("§c§lREPORT §fUtilize: /report (nome) (motivo)");
        }
        else if (args.length >= 2) {
            final Player t = Bukkit.getPlayer(args[0]);
            if (t == null) {
                p.sendMessage(ApiManager.jogadoroff);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                for (int i = 1; i < args.length; ++i) {
                    sb.append(args[i]).append(" ");
                }
                final String motivo = sb.toString().trim();
                ReportCMD.reportou.contains(sender.getName());
                sender.sendMessage("§a§lREPORT §fVocê reportou o jogador §a" + t.getName());
				for (Player todos : Bukkit.getOnlinePlayers()) {
						todos.hidePlayer(p);
                    if (todos.hasPermission("simulator.reportver")) {
                    	todos.sendMessage("§f");
                    	todos.sendMessage("       §7[§4§lREPORT§7]");
                    	todos.sendMessage(" §f");
                        todos.sendMessage(" §fVítima: §c" + p.getName());
                        todos.sendMessage(" §fSuspeito: §c" + t.getName());
                        todos.sendMessage(" §fMotivo: §c" + motivo);
                        todos.sendMessage(" §f");
                    }
                }
            }
        }
        return true;
    }
}
