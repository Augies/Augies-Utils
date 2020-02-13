package net.cox.augies.utils.spigot;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.lang.reflect.Field;

public class Glow extends Enchantment {
    /**
     * MUST call this method during onEnable
     */
    public static void registerGlow(Plugin plugin){
        try{
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
        }catch(NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        try{
            Glow glow = new Glow(plugin);
            Enchantment.registerEnchantment(glow);
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public Glow(Plugin plugin) {
        super(new NamespacedKey(plugin,"fakeGlow"));
    }

    @Override
    public String getName() {
        return "fakeGlow";
    }

    @Override
    public int getMaxLevel() {
        return 0;
    }

    @Override
    public int getStartLevel() {
        return 0;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.ALL;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return false;
    }
}
