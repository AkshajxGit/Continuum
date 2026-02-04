package dev.akshaj.continuum.util;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {

        Continuum.LOGGER.info("Modifying Loot-Tables for Continuum!");

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            // --- THE MASSIVE IF FOR NORMAL SILVER APPLES ---
            if (LootTables.SIMPLE_DUNGEON_CHEST.equals(key) ||
                    LootTables.DESERT_PYRAMID_CHEST.equals(key) ||
                    LootTables.ABANDONED_MINESHAFT_CHEST.equals(key) ||
                    LootTables.JUNGLE_TEMPLE_CHEST.equals(key) ||
                    LootTables.WOODLAND_MANSION_CHEST.equals(key) ||
                    LootTables.STRONGHOLD_CORRIDOR_CHEST.equals(key) ||
                    LootTables.STRONGHOLD_CROSSING_CHEST.equals(key) ||
                    LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key) ||
                    LootTables.RUINED_PORTAL_CHEST.equals(key) ||
                    LootTables.BASTION_OTHER_CHEST.equals(key) ||
                    LootTables.BASTION_BRIDGE_CHEST.equals(key) ||
                    LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(key) ||
                    LootTables.ANCIENT_CITY_CHEST.equals(key) ||
                    LootTables.IGLOO_CHEST_CHEST.equals(key) ||
                    LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key) ||
                    LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(key) ||
                    LootTables.VILLAGE_TOOLSMITH_CHEST.equals(key)) {

                tableBuilder.pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // 15% chance
                        .with(ItemEntry.builder(ModItems.SILVER_APPLE))
                        .build());
            }

            // --- THE MASSIVE IF FOR ENCHANTED SILVER APPLES ---
            if (LootTables.ANCIENT_CITY_CHEST.equals(key) ||
                    LootTables.BASTION_TREASURE_CHEST.equals(key) ||
                    LootTables.WOODLAND_MANSION_CHEST.equals(key) ||
                    LootTables.SIMPLE_DUNGEON_CHEST.equals(key) ||
                    LootTables.DESERT_PYRAMID_CHEST.equals(key) ||
                    LootTables.RUINED_PORTAL_CHEST.equals(key) ||
                    LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {

                tableBuilder.pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.02f)) // 2% chance
                        .with(ItemEntry.builder(ModItems.ENCHANTED_SILVER_APPLE))
                        .build());
            }
        });
    }
}