package pvp.blatantmc.sistemas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class KillStreakAPI {

	public static List<Player> KillStreakC = new ArrayList<Player>();
	public static Map<String, Integer> KillStreak = new HashMap<String, Integer>();

	public static void AddStreak(Player p) {
		if (!KillStreak.containsKey(p.getName())) {
			KillStreak.put(p.getName(), 1);
			return;
		}
		KillStreak.replace(p.getName(), getStreak(p) + 1);
	}

	public static int getStreak(Player p) {
		return KillStreak.get(p.getName());
	}

	public static void removeStreak(Player p) {
		if (KillStreakC.contains(p)) {
			KillStreakC.remove(p);
		}
		if (KillStreak.containsKey(p.getName())) {
			KillStreak.remove(p.getName());
		}
	}

	public static void StreakFunc(Player p) {
		AddStreak(p);
		if (getStreak(p) == 5) {
			if (!KillStreakC.contains(p)) {
				KillStreakC.add(p);
			}
			Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName() + "§f alcançou um killstreak de §c"
					+ getStreak(p) + "§f!");
		} else {
			if (getStreak(p) == 10) {
				Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
						+ "§f alcançou um killstreak de §c" + getStreak(p) + "§f!");
			} else {
				if (getStreak(p) == 15) {
					Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
							+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
				} else {
					if (getStreak(p) == 20) {
						Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
								+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
					} else {
						if (getStreak(p) == 25) {
							Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
									+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
						} else {
							if (getStreak(p) == 30) {
								Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
										+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
							} else {
								if (getStreak(p) == 35) {
									Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
											+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
								} else {
									if (getStreak(p) == 40) {
										Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
												+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
									} else {
										if (getStreak(p) == 45) {
											Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
													+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
										} else {
											if (getStreak(p) == 50) {
												Bukkit.broadcastMessage("§c§lKILLSTREAK §fO jogador §c" + p.getName()
														+ " §falcançou um killstreak de §c" + getStreak(p) + "§f!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
