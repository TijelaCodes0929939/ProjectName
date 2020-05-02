package pvp.blatantmc.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerTagEvent implements Listener {
	
	@EventHandler
	public void cudokeef(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		if (p.hasPermission("tag.ceo")) {
		    p.chat("/tag ceo");
		}
		if (p.hasPermission("tag.dono")) {
		    p.chat("/tag dono");
		}
		if (p.hasPermission("tag.subdono")) {
		    p.chat("/tag subdono");
		}
		if (p.hasPermission("tag.diretor")) {
		    p.chat("/tag diretor");
		}
		if (p.hasPermission("tag.coordenador")) {
		    p.chat("/tag coordenador");
		}
		if (p.hasPermission("tag.admin")) {
		    p.chat("/tag admin");
		}
		if (p.hasPermission("tag.gerente")) {
		    p.chat("/tag gerente");
		}
		if (p.hasPermission("tag.mod+")) {
		    p.chat("/tag mod+");
		}
		if (p.hasPermission("tag.modgc")) {
		    p.chat("/tag modgc");
		}
		if (p.hasPermission("tag.mod")) {
		    p.chat("/tag mod");
		}
		if (p.hasPermission("tag.trial")) {
		    p.chat("/tag trial");
		}
		if (p.hasPermission("tag.builder")) {
		    p.chat("/tag builder");
		}
		if (p.hasPermission("tag.helper")) {
		    p.chat("/tag helper");
		}
		if (p.hasPermission("tag.youtuber")) {
		    p.chat("/tag youtuber");
		}
		if (p.hasPermission("tag.pro")) {
		    p.chat("/tag pro");
		}
		if (p.hasPermission("tag.spro")) {
		    p.chat("/tag spro");  
		}
		if (p.hasPermission("tag.mega")) {
		    p.chat("/tag mega");
		}
		if (p.hasPermission("tag.star")) {
		    p.chat("/tag star");
		}
		if (p.hasPermission("tag.light")) {
		    p.chat("/tag light");
		}
		if (p.hasPermission("tag.membro")) {
		    p.chat("/tag membro");
		}
    }
	    
	    
	}


