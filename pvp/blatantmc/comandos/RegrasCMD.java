package pvp.blatantmc.comandos;

import org.bukkit.event.*;

import org.bukkit.command.*;
import org.bukkit.entity.*;

public class RegrasCMD implements CommandExecutor, Listener
{
    public boolean onCommand(final CommandSender Sender, final Command cmd, final String string, final String[] args) {
        final Player p = (Player)Sender;
        if (cmd.getName().equalsIgnoreCase("regras")) {
            p.sendMessage("§f");
            p.sendMessage("              §c§lREGRAS");
            p.sendMessage("§f");
            p.sendMessage("§c1. §fNão usar nenhuma trapaça.");
            p.sendMessage("§c2. §fNão ofender o servidor e nem a staff.");
            p.sendMessage("§c3. §fNão ameaçar nenhum jogador ou o servidor.");
            p.sendMessage("§c4. §fNão chantagear ninguém no servidor");
            p.sendMessage("§c5. §fNão praticar Spam/Flood no chat do servidor.");
            p.sendMessage("§c6. §fNão testar a staff do servidor.");
            p.sendMessage("§c7. §fNão abusar de bugs do servidor.");
            p.sendMessage("§c8. §fNão divulgar IP'S de outros servidores no chat.");
            p.sendMessage("§c9. §fNão se passar por um staff ou membro da equipe.");
            p.sendMessage("§f");
            p.sendMessage("§cCaso o jogador não obedeça as regras do servidor, ele será punido.");
            p.sendMessage("§f");
        }
        return false;
    }
}
