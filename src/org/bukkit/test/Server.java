package org.bukkit.test;

import org.bukkit.Material;
import org.bukkit.block.BlockType;
import org.bukkit.inventory.ItemType;

import java.util.ArrayList;
import java.util.List;

public class Server {

    public void execute() {
        // No deprecation warning since WHEAT is classified as a MultiType, aka it is a block type
        Material.WHEAT.isSolid();

        // Deprecated warning since diamond sword cannot be solid as it is an item
        Material.DIAMOND_SWORD.isSolid();

        List<Material> materials = new ArrayList<>();
        materials.add(Material.WHEAT);
        materials.add(Material.DIAMOND_SWORD);
        materials.forEach(mat -> {
            // Old API usage, shows deprecation since you are not checking the type
            if(mat.isSolid()) {

            }
            // New API usage
            if(mat instanceof BlockType<?> block && block.isSolid()) {

            }
            if(mat instanceof ItemType itemType) {
                itemType.getMaxStackSize();
            }
        });
    }
}
