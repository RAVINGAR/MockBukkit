package org.bukkit.inventory;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ItemType extends Material {

    /**
     * Gets the maximum amount of this item type that can be held in a stack
     *
     * @return Maximum stack size for this item type
     */
    int getMaxStackSize();

    /**
     * Gets the maximum durability of this item type
     *
     * @return Maximum durability for this item type
     */
    short getMaxDurability();

    /**
     * Checks if this item type is edible.
     *
     * @return true if this item type is edible.
     */
    boolean isEdible();

    /**
     * @return True if this item type represents a playable music disk.
     */
    boolean isRecord();

    /**
     * Checks if this item type can be used as fuel in a Furnace
     *
     * @return true if this item type can be used as fuel.
     */
    boolean isFuel();

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     *
     * @return the item left behind when crafting, or null if nothing is.
     */
    @Nullable
    ItemType getCraftingRemainingItem();

    @NotNull
    static ItemType getItemType(final String identifier) {
        throw new IllegalArgumentException("Not implemented!");
        // Normally would get from registry here...
    }
}
