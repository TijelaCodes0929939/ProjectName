package pvp.blatantmc.comandos;

import org.bukkit.event.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class YoutuberCMD implements Listener, CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        cmd.getName().equalsIgnoreCase("youtuber");
        p.sendMessage("§f");
        p.sendMessage("§f");
        p.sendMessage("       §6§lTAG §f- §b§lYOUTUBER");
        p.sendMessage("§f");
        p.sendMessage("§f- §fPossuir 100 inscritos no canal.");
        p.sendMessage("§f- §fGravar um vídeo no servidor.");
        p.sendMessage("§f- §fE ter 200 Views no vídeo do servidor.");
        p.sendMessage("§f");
        p.sendMessage("        §6§lTAG §f- §6§lPRO");
        p.sendMessage("§f");
        p.sendMessage("§f- §fPossuir 60 inscritos no canal.");
        p.sendMessage("§f- §fGravar um vídeo no servidor.");
        p.sendMessage("§f- §fE ter 150 Views no vídeo do servidor.");
        p.sendMessage("");
        p.sendMessage("        §6§lTAG §f- §e§lS-PRO");
        p.sendMessage("§f");
        p.sendMessage("§f- §fPossuir 20 inscritos no canal.");
        p.sendMessage("§f- §fGravar um vídeo no servidor.");
        p.sendMessage("§f- §fE ter 30 Views no vídeo do servidor.");
        p.sendMessage("§f");
        p.sendMessage("§cEntre em nosso discord para fazer a sua solicitação.");
        p.sendMessage("§f");
        p.sendMessage("§f");
        return false;
    }
}
