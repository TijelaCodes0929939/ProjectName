package pvp.blatantmc.eventos;

import org.bukkit.entity.*;
import org.bukkit.event.player.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.event.server.*;

import pvp.blatantmc.comandos.*;
import pvp.blatantmc.sistemas.*;

public class PlayerEvent implements Listener
{
    @EventHandler
    public void onEntrar(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        p.sendMessage("�f");
        p.sendMessage("�f");
        p.sendMessage("      �6�lBLATANT�f�lMC");
        p.sendMessage(" �f");
        p.sendMessage(" �71. �fSeja bem-vindo!  ");
        p.sendMessage(" �72. �fCurta nossa nova atualiza��o!  ");
        p.sendMessage(" �73. �fEstamos com uma atualiza��o melhor!  ");
        p.sendMessage(" �74. �fNovos mapas e plugins!  ");
        p.sendMessage(" �75. �fMelhor jogabilidade para voc�!  ");
        p.sendMessage(" �f");
        p.sendMessage(" �f- �fAcesse nosso discord: �3https://discord.gg/eWvbNxw");
        p.sendMessage(" �f- �fAcesse nosso twitter: �b@BlatantMC");
        p.sendMessage(" �f");
        p.sendMessage(" �f");
        e.setJoinMessage("�a�lSPAWN �fO jogador �a" + p.getDisplayName() + "�f entrou no Servidor!");
        p.getInventory().clear();
        ApiManager.ItemServer(p);
        p.setHealth(20.0);
        p.setFireTicks(0);
        ApiManager.tirarArmadura(p);
        Hability.removeAbility(p);
        p.setFoodLevel(20);
        p.teleport(p.getWorld().getSpawnLocation());
        p.setGameMode(GameMode.SURVIVAL);
		}
  
        
        @EventHandler
        public void onSair(final PlayerQuitEvent e) {
            final Player p = e.getPlayer(); 
            e.setQuitMessage("�c�lSPAWN �fO jogador �c" + p.getName() + "�f saiu do Servidor!");
       
    }
    
    
    
    @EventHandler
    public void onCheio(final PlayerLoginEvent event) {
        final Player p = event.getPlayer();
        if (event.getResult() == PlayerLoginEvent.Result.KICK_FULL) {
            if (p.hasPermission("simulator.servercheio")) {
                event.setResult(PlayerLoginEvent.Result.ALLOWED);
            }
            else {
                event.setKickMessage("�c�lSERVIDOR  \n�fO servidor est� cheio, volte em outra hora!");
            }
        }
        else if (event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            event.setKickMessage("�c�lWHITELIST\n  \n�fO servidor est� passando por uma manuten��o!  \nAcesse nosso discord para poder saber das novidades.  \n�3https://discord.gg/zBPVecc");
        }
    }
    
    @EventHandler
    public void onRespawn(final PlayerRespawnEvent e) {
        final Player p = e.getPlayer();
        p.getInventory().clear();
        ApiManager.ItemServer(p);
        p.setHealth(20.0);
        p.setFireTicks(0);
        p.setFoodLevel(20);
        ApiManager.tirarArmadura(p);
        p.teleport(p.getWorld().getSpawnLocation());
        p.updateInventory();
        p.sendMessage("�e�lSPAWN �fVoc� voltou para o �eSPAWN!");
        Hability.removeAbility(p);
        ApiManager.tirarEfeitos(p);
    }
    
    
    
    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
    public void onColorandChangeChat(final PlayerChatEvent e) {
        final Player p = e.getPlayer();
        if(e.getMessage().equalsIgnoreCase("plugin da net") || e.getMessage().equalsIgnoreCase("plugin da net")){
        	e.setMessage("Gostei dos plugins do servidor!");
        }
        
        if (!p.hasPermission("falarnormal.chat")) {
            e.setFormat("�7(" + ChatColor.RESET + KillsDeathsRankXp.getRankPequeno(p) + "�7)" + ChatColor.RESET + " �7" + p.getDisplayName() + " �e� �f" + e.getMessage());
        
            if(e.getMessage().contains(".net") || e.getMessage().contains(".com") || e.getMessage().contains(".com.br") || e.getMessage().contains(".pro") || e.getMessage().contains(".nu") || e.getMessage().contains(".tk")){
            	e.setCancelled(true);
            	p.sendMessage("�c�lERRO �fVoc� n�o pode divulgar IP�s nesse servidor");
            	p.sendMessage("�c�lERRO �fVoc� foi reportado a um staff");
            	Bukkit.broadcast("�c�lIP �fO jogador �c" + p.getName() + " �fest� divulgando �cIP'S �fde outro servidores no chat!", "simulator.reportver");
            }
            
        }
        else {
            e.setFormat("�7(" + ChatColor.RESET + KillsDeathsRankXp.getRankPequeno(p) + "�7)" + ChatColor.RESET + " �7" + p.getDisplayName() + " �e� �f " + e.getMessage().replaceAll("&", "�"));
        
        
        }
        
     
        
    }
    
    @EventHandler
    private void onCommand(PlayerCommandPreprocessEvent e){
    	Player p = e.getPlayer();
    	
    	if(e.getMessage().contains("/me")){
    		if(p.hasPermission("tijela.private")){
        		e.setCancelled(false);
        	}else{
        		p.sendMessage("�c�lERRO �fVoc� n�o tem permiss�o para usar esse comando!");
        		e.setCancelled(true);
        	}
    		
    	}
    	
    }
    
    
    @EventHandler
    public void onMotd(final ServerListPingEvent e) {
        e.setMotd(String.valueOf(ApiManager.Motd) + "\n" + ApiManager.StatusMotd);
        e.setMaxPlayers(60);
    }
}
