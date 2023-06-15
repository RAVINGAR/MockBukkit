package org.bukkit;


import org.bukkit.block.BlockType;
import org.bukkit.block.Growable;
import org.bukkit.inventory.ItemType;

public interface Material extends Keyed, Translatable {
    ItemType DIAMOND_SWORD = ItemType.getItemType("diamond_sword");
    MultiType<Growable> WHEAT = MultiType.getMultiType("wheat");

    /**
     * Check if the block type is solid (can be built upon)
     *
     * @return True if this block type is solid
     * @deprecated Check if Material is instance of {@link BlockType} before calling this method
     */
    default boolean isSolid() {
        if(this instanceof BlockType<?> blockType && blockType.isSolid()) {
            return true;
        }
        return false;
    }

    /**
     * Returns a value that represents how 'slippery' the block is.
     * <p>
     * Blocks with higher slipperiness, like {@link BlockType#ICE} can be slid on
     * further by the player and other entities.
     * <p>
     * Most blocks have a default slipperiness of {@code 0.6f}.
     *
     * @return the slipperiness of this block
     * @deprecated Check if Material is Instance of {@link BlockType} before calling this method
     */
    default float getSlipperiness() {
        if(this instanceof BlockType<?> blockType) {
            return blockType.getSlipperiness();
        }
        return 0F;
    }

    Material getCraftingRemainingItem();
}
