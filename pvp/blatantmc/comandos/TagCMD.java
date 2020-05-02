package pvp.blatantmc.comandos;

import org.bukkit.command.*;
import org.bukkit.entity.*;

import com.nametagedit.plugin.NametagEdit;

import net.md_5.bungee.api.ChatColor;
import pvp.blatantmc.sistemas.*;

public class TagCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ApiManager.semconsole);
            return true;
        }
        final Player p = (Player)sender;
        if (args.length != 0) {
            if (args[0].equalsIgnoreCase("ceo")) {
                if (p.hasPermission("tag.ceo")) {
                    TagsAPI.setarTag(p, "§4§lCEO §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lCEO §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("dono")) {
                if (p.hasPermission("tag.dono")) {
                    TagsAPI.setarTag(p, "§4§lDONO §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lDONO §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("subdono")) {
                if (p.hasPermission("tag.subdono")) {
                    TagsAPI.setarTag(p, "§4§lSUBDONO §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lSUBDONO §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("diretor")) {
                if (p.hasPermission("tag.diretor")) {
                    TagsAPI.setarTag(p, "§4§lDIRETOR §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lDIRETOR §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("coordenador")) {
                if (p.hasPermission("tag.coordenador")) {
                    TagsAPI.setarTag(p, "§9§lCOORD §9");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_AQUA + "§9§lCOORD §9");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("admin")) {
                if (p.hasPermission("tag.admin")) {
                    TagsAPI.setarTag(p, "§c§lADMIN §c");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.RED + "§c§lADMIN §c");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("gerente")) {
                if (p.hasPermission("tag.gerente")) {
                    TagsAPI.setarTag(p, "§c§lGERENTE §c");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.RED + "§c§lGERENTE §c");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("mod+")) {
                if (p.hasPermission("tag.mod+")) {
                    TagsAPI.setarTag(p, "§5§lMOD+ §5");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_PURPLE + "§5§lMOD+ §5");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                    
            }
            if (args[0].equalsIgnoreCase("modgc")) {
                if (p.hasPermission("tag.modgc")) {
                    TagsAPI.setarTag(p, "§5§lMODGC §5");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_PURPLE + "§5§lMODGC §5");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("mod")) {
                if (p.hasPermission("tag.mod")) {
                    TagsAPI.setarTag(p, "§5§lMOD §5");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_PURPLE + "§5§lMOD §5");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("trial")) {
                if (p.hasPermission("tag.trial")) {
                    TagsAPI.setarTag(p, "§5§lTRIAL §5");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.LIGHT_PURPLE + "§5§lTRIAL §5");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            if (args[0].equalsIgnoreCase("builder")) {
                if (p.hasPermission("tag.builder")) {
                    TagsAPI.setarTag(p, "§e§lBUILDER §e");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.YELLOW + "§e§lBUILDER §e");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("helper")) {
                if (p.hasPermission("tag.helper")) {
                    TagsAPI.setarTag(p, "§2§lHELPER §2");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_GREEN + "§2§lHELPER §2");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("youtuber")) {
                if (p.hasPermission("tag.youtuber")) {
                    TagsAPI.setarTag(p, "§b§lYT §b");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.BLUE + "§b§lYT §b");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }    
            if (args[0].equalsIgnoreCase("pro")) {
                if (p.hasPermission("tag.pro")) {
                    TagsAPI.setarTag(p, "§6§lPRO §6");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.GOLD + "§6§lPRO §6");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("spro")) {
                if (p.hasPermission("tag.spro")) {
                    TagsAPI.setarTag(p, "§e§lSPRO §e");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.YELLOW + "§e§lSPRO §e");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("mega")) {
                if (p.hasPermission("tag.mega")) {
                    TagsAPI.setarTag(p, "§6§lMEGA §6");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.GOLD + "§6§lMEGA §6");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("star")) {
                if (p.hasPermission("tag.star")) {
                    TagsAPI.setarTag(p, "§e§lSTAR §e");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.YELLOW + "§e§lSTAR §e");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("light")) {
                if (p.hasPermission("tag.light")) {
                    TagsAPI.setarTag(p, "§a§lLIGHT §a");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.GREEN + "§a§lLIGHT §a");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
                
            }    
            if (args[0].equalsIgnoreCase("membro")) {
                if (p.hasPermission("tag.membro")) {
                    TagsAPI.setarTag(p, "§7");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.ITALIC + "§7");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                
            }
            return false;
        }
        if (p.hasPermission("tag.ceo")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lCEO§f, §4§lDONO§f, §4§lSUBDONO§f, §4§lDIRETOR§f, §9§lCOORDENADOR");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.dono")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lDONO§f, §4§lSUBDONO§f, §4§lDIRETOR§f, §9§lCOORDENADOR");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.subdono")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lSUBDONO§f, §4§lDIRETOR§f, §9§lCOORDENADOR");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.diretor")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lDIRETOR§f, §9§lCOORDENADOR");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.coordenador")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§9§lCOORDENADOR");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.admin")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lADMIN§f, §c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.gerente")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lGERENTE§f, §5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.mod+")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§5§lMOD+§f, §5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.modgc")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§5§lMODGC§f, §5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.mod")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§5§lMOD§f, §5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.trial")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§5§lTRIAL");
        	p.sendMessage("§e§lBUILDER§f, §2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.builder")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§e§lBUILDER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.helper")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§2§lHELPER§f, §b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.youtuber")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§b§lYOUTUBER§f, §6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.pro")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§6§lPRO§f, §e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.spro")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§e§lSPRO");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.mega")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§6§lMEGA§f, §e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.star")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§e§lSTAR§f, §a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.light")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§a§lLIGHT§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.membro")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lINFO: §fTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
		return false;
}
}
    
