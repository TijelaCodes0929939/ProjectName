package pvp.blatantmc.comandos;

import org.bukkit.event.*;

import org.bukkit.command.*;
import org.bukkit.entity.*;

public class RegrasCMD implements CommandExecutor, Listener
{
    public boolean onCommand(final CommandSender Sender, final Command cmd, final String string, final String[] args) {
        final Player p = (Player)Sender;
        if (cmd.getName().equalsIgnoreCase("regras")) {
            p.sendMessage("�f");
            p.sendMessage("              �c�lREGRAS");
            p.sendMessage("�f");
            p.sendMessage("�c1. �fN�o usar nenhuma trapa�a.");
            p.sendMessage("�c2. �fN�o ofender o servidor e nem a staff.");
            p.sendMessage("�c3. �fN�o amea�ar nenhum jogador ou o servidor.");
            p.sendMessage("�c4. �fN�o chantagear ningu�m no servidor");
            p.sendMessage("�c5. �fN�o praticar Spam/Flood no chat do servidor.");
            p.sendMessage("�c6. �fN�o testar a staff do servidor.");
            p.sendMessage("�c7. �fN�o abusar de bugs do servidor.");
            p.sendMessage("�c8. �fN�o divulgar IP'S de outros servidores no chat.");
            p.sendMessage("�c9. �fN�o se passar por um staff ou membro da equipe.");
            p.sendMessage("�f");
            p.sendMessage("�cCaso o jogador n�o obede�a as regras do servidor, ele ser� punido.");
            p.sendMessage("�f");
        }
        return false;
    }
}
