package pvp.blatantmc.comandos;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CageCMD implements CommandExecutor {
	
	public static Map<Player, Player> cage = new HashMap<Player, Player>();

	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("�cApenas jogadores podem executar este comando!");
			return true;
		} else {
			if (!sender.hasPermission("simulator.cage")) {
				sender.sendMessage("�c�lERRO �fVoc� n�o tem permiss�o para executar este comando!");
				return true;
			} else {
				if (args.length == 0) {
					sender.sendMessage("�c�lCAGE �fUtilize: /cage (nick)");
					return true;
				}
				if (args.length == 1) {
					if (cage.containsKey(Bukkit.getPlayerExact(args[0]))) {
						sender.sendMessage("�c�lCAGE �fEsse jogador j� est� em uma cage.");
						return true;
					}
					if (Bukkit.getPlayerExact(args[0]).hasPermission("simulator.cage")) {
						sender.sendMessage("�c�lERRO �fVoc� n�o pode puxar um membro da equipe para a cage.");
						return true;
					}
					cage.put((Bukkit.getPlayerExact(args[0])),  (Player) sender);
					if (Bukkit.getPlayerExact(args[0]) != null) {
						Bukkit.getPlayerExact(args[0]).getLocation().add(0, 13, 0).getBlock().setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0]).getLocation().add(0, 11, 1).getBlock().setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0]).getLocation().add(1, 11, 0).getBlock().setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0]).getLocation().add(0, 11, -1).getBlock()
								.setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0]).getLocation().add(-1, 11, 0).getBlock()
								.setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0]).getLocation().add(0, 10, 0).getBlock().setType(Material.BEDROCK);
						Bukkit.getPlayerExact(args[0])
								.teleport(Bukkit.getPlayerExact(args[0]).getLocation().add(0, 11, -0.05));
						sender.sendMessage("�a�lCAGE �fVoc� puxou o jogador �a" + Bukkit.getPlayerExact(args[0]).getName()+ " �fpara uma cage.");
						sender.sendMessage("�f");
						Bukkit.getPlayerExact(args[0]).sendMessage("�c�lCAGE �fVoc� foi puxado para uma cage!");
						Bukkit.getPlayerExact(args[0]).sendMessage("�3�lDICA �fSiga todos os passos do staffers e n�o deslogue do servidor.");
						sender.sendMessage("�f");
					} else {
						sender.sendMessage("�c�lERRO �fJogador offline.");
					}
				}

			}
		}

		return false;
	}
}