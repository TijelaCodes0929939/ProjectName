package pvp.blatantmc.sistemas;

import org.bukkit.entity.*;

import net.md_5.bungee.api.ChatColor;
import pvp.blatantmc.main.*;

import org.bukkit.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

public class KillsDeathsRankXp
{
	public static String getRankPequeno(final Player p) {
        final double a = getKills(p);
        if(a <= 39) {
 		   return "§7⚊";
 		  }
 		  if(a <= 49) {
 		   return ChatColor.GREEN + "⚎";
 		  }
 		  if(a <= 59) {
 		   return ChatColor.YELLOW + "☰";
 		  }
 		  if(a <= 69) {
 		   return "§7⚔";
 		  }
 		  if(a <= 79) {
 		   return "§6✯";
 		  }
 		  if(a <= 89) {
 		   return "§b✪";
 		  }
 		  if(a <= 99) {
 		   return ChatColor.DARK_GREEN + "§2✤";
 		  }
 		  if(a <= 199) {
 		   return "§c✸";
 		  }
 		  if(a <= 299) {
 		   return ChatColor.DARK_AQUA + "✹";
 		  }
 		  if(a <= 399) {
 		   return "§1✷";
 		  }
 		  if(a <= 499) {
 		   return "§4✥";
 		  }
 		  return "§4✥";
 		 }
    
    public static String getRank(final Player p) {
        final double a = getKills(p);
        if(a <= 39) {
		   return "§7Unranked";
	    }
		if(a <= 49) {
	       return ChatColor.GREEN + "§aPrimary";
	    }
		if(a <= 59) {
		   return ChatColor.YELLOW + "§eApprentice";
		}
		if(a <= 69) {
		   return "§7Crazy";
		}
		if(a <= 79) {
	       return "§6Invincible";
		}
		if(a <= 89) {
	       return "§bMagic";
		}
		if(a <= 99) {
		   return ChatColor.DARK_GREEN + "§2Killer";
		}
		if(a <= 199) {
	       return "§cImpossible";
		}
		if(a <= 299) {
		   return ChatColor.DARK_AQUA + "Amazing";
		}
		if(a <= 399) {
		   return "§1Demon";
	    }
	    if(a <= 499) {
		   return "§4Blatant";
		}
		return "§4Blatant";
	   }
    
    public static void adicionarKill(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Matou");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".Matou", (Object)(Value + i));
        Main.getInstance().save();
    }
    
    public static void adicionarDeaths(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Morreu");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".Morreu", (Object)(Value + i));
        Main.getInstance().save();
    }
    
    public static void adicionarXp(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".XP");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".XP", (Object)(Value + i));
        Main.getInstance().save();
    }
    
    public static void removerXp(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".XP");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".XP", (Object)(Value - i));
        Main.getInstance().save();
    }
    
    public static void adicionarCaixa(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Caixa");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".Caixa", (Object)(Value + i));
        Main.getInstance().save();
    }
    
    public static void removerCaixa(final Player p, final int i) {
        final int Value = Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Caixa");
        Main.getInstance().status.set(String.valueOf(p.getName()) + ".Caixa", (Object)(Value - i));
        Main.getInstance().save();
    }
    
    public static int getKills(final Player p) {
        return Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Matou");
    }
    
    public static int getDeaths(final Player p) {
        return Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Morreu");
    }
    
    public static int getXp(final Player p) {
        return Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".XP");
    }
    
    public static int getCaixa(final Player p) {
        return Main.getInstance().status.getInt(String.valueOf(p.getName()) + ".Caixa");
    }
    
    public static int getPing(final Player p) {
        return ((CraftPlayer)p).getHandle().ping;
    }
}
