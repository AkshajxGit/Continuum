package dev.akshaj.continuum.item;

import dev.akshaj.continuum.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    public static final ToolMaterial SILVER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            60, 11.0f, 1.0f, 30,
            ModTags.Items.SILVER_REPAIR // This points to your new tag
    );

    public static final ToolMaterial NICKEL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            850, 6.5f, 2.5f, 12,
            ModTags.Items.NICKEL_REPAIR // This points to your new tag
    );
}