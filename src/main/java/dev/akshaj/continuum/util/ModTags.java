package dev.akshaj.continuum.util;

import dev.akshaj.continuum.Continuum;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        // You can add custom block tags here if needed later

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of("continuum", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SILVER_REPAIR = createTag("silver_repair");
        public static final TagKey<Item> NICKEL_REPAIR = createTag("nickel_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of("continuum", name));

        }
    }
}