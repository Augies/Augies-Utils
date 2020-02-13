package net.cox.augies.utils.spigot;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;


public abstract class GuiObject implements InventoryHolder, Listener {
    private final Inventory inventory;

    public GuiObject(int size, String name) {
        this.inventory = Bukkit.createInventory(this, size, name);
        initializeInv();
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void openInventory(Player p){
        p.openInventory(inventory);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public abstract void onInventoryClick(InventoryClickEvent event);

    public abstract void initializeInv();
}
