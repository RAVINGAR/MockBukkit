package org.bukkit;

import org.bukkit.block.BlockData;
import org.bukkit.block.BlockType;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public interface MultiType<B extends BlockData> extends BlockType<B>, ItemType {

    @NotNull
    static <T extends BlockData> MultiType<T> getMultiType(final String identifier) {
        throw new IllegalArgumentException("Not implemented!");
        // Normally would get from registry here.
    }
}
