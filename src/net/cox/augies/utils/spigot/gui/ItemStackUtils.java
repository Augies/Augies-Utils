package net.cox.augies.utils.spigot.gui;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemStackUtils {
    public static ItemStack makeItem(Material material, String name, String... lore){
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        ArrayList<String> loreList = new ArrayList<>(Arrays.asList(lore));
        meta.setLore(loreList);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack makeItem(Material material, int quantity, String name, boolean isEnchanted, Plugin plugin, String... lore){
        ItemStack item = new ItemStack(material, quantity);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        ArrayList<String> loreList = new ArrayList<>(Arrays.asList(lore));
        meta.setLore(loreList);
        item.setItemMeta(meta);
        if(isEnchanted){
            return asEnchanted(item, plugin);
        }
        return item;
    }

    public static ItemStack asEnchanted(ItemStack itemStack, Plugin plugin){
        ItemMeta meta = itemStack.getItemMeta();
        meta.addEnchant(new Glow(plugin), 1, false);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
