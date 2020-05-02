package pvp.blatantmc.sistemas;

import java.lang.reflect.Field;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;

public class SystemAPI {

	public static void getItemChant(Player p, Material mat, int quantidade, String nome, int lugar, Enchantment enchant,
			int level, boolean trueorfalse) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addEnchant(enchant, level, trueorfalse);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setItem(lugar, item);
	}

	public static void getItemChantArmorHelmet(Player p, Material mat, int quantidade, String nome, Enchantment enchant,
			int level, boolean trueorfalse) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addEnchant(enchant, level, trueorfalse);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setHelmet(item);
	}

	public static void getItemChantArmorChestPlate(Player p, Material mat, int quantidade, String nome,
			Enchantment enchant, int level, boolean trueorfalse) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addEnchant(enchant, level, trueorfalse);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setChestplate(item);
	}

	public static void getItemChantArmorLeggins(Player p, Material mat, int quantidade, String nome,
			Enchantment enchant, int level, boolean trueorfalse) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addEnchant(enchant, level, trueorfalse);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setLeggings(item);
	}

	public static void getItemChantArmorBoots(Player p, Material mat, int quantidade, String nome,
			Enchantment enchant, int level, boolean trueorfalse) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.addEnchant(enchant, level, trueorfalse);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setBoots(item);
	}

	public static void getItemStack(Player p, int quantidade, String nome, int lugar) {
		ItemStack item = new ItemStack(Material.INK_SACK, quantidade, (short) 10);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setItem(lugar, item);
	}

	public static void getItem(Player p, Material mat, int quantidade, String nome, int lugar) {
		ItemStack item = new ItemStack(mat, quantidade);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		p.getInventory().setItem(lugar, item);
	}

	public static void getSopa(Player p, int quantas) {
		ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta msopa = sopa.getItemMeta();
		msopa.setDisplayName("§6Sopa");
		sopa.setItemMeta(msopa);
		for (int i = 0; i < quantas; i++) {
			p.getInventory().setItem(p.getInventory().firstEmpty(), sopa);
		}
	}

	public static void onTabSenderPacket(Player player, String Header, String Footer) {
		try {
			IChatBaseComponent header = IChatBaseComponent.ChatSerializer.a("{'text': '" + Header + "'}");
			IChatBaseComponent footer = IChatBaseComponent.ChatSerializer.a("{'text': '" + Footer + "'}");
			PacketPlayOutPlayerListHeaderFooter packetPlayOut = new PacketPlayOutPlayerListHeaderFooter(header);
			Field field = packetPlayOut.getClass().getDeclaredField("b");
			field.setAccessible(true);
			field.set(packetPlayOut, footer);
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOut);
		} catch (Exception exception) {
		}
	}

}
