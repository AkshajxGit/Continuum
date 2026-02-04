package dev.akshaj.continuum.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import static dev.akshaj.continuum.item.ModItems.*;
import static dev.akshaj.continuum.block.ModBlocks.*;
import static dev.akshaj.continuum.item.ModItems.SULPHUR_TORCH;

public class ModItemGroups {

    public static final ItemGroup CONTINUUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Continuum.MOD_ID, "a_continuum_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(SULPHUR))
                    .displayName(Text.translatable("itemgroup.a_continuum.items"))
                    .entries((displayContext, entries) -> {

                        entries.add(RAW_SULPHUR);
                        entries.add(SULPHUR);
                        entries.add(BRIMSTONE);
                        entries.add(BLAST_CHARGE);
                        entries.add(SULPHUR_TORCH);
                        entries.add(RAW_NICKEL);
                        entries.add(NICKEL);
                        entries.add(NICKEL_NUGGET);
                        entries.add(NICKEL_HELMET);
                        entries.add(NICKEL_CHESTPLATE);
                        entries.add(NICKEL_LEGGINGS);
                        entries.add(NICKEL_BOOTS);
                        entries.add(NICKEL_HORSE_ARMOR);
                        entries.add(NICKEL_NAUTILUS_ARMOR);
                        entries.add(NICKEL_SWORD);
                        entries.add(NICKEL_PICKAXE);
                        entries.add(NICKEL_AXE);
                        entries.add(NICKEL_SHOVEL);
                        entries.add(NICKEL_HOE);
                        entries.add(NICKEL_SPEAR);
                        entries.add(TOMAHAWK);
                        entries.add(RAW_SILVER);
                        entries.add(SILVER);
                        entries.add(SILVER_APPLE);
                        entries.add(ENCHANTED_SILVER_APPLE);
                        entries.add(SILVER_NUGGET);
                        entries.add(SILVER_HELMET);
                        entries.add(SILVER_CHESTPLATE);
                        entries.add(SILVER_LEGGINGS);
                        entries.add(SILVER_BOOTS);
                        entries.add(SILVER_HORSE_ARMOR);
                        entries.add(SILVER_NAUTILUS_ARMOR);
                        entries.add(SILVER_SWORD);
                        entries.add(SILVER_PICKAXE);
                        entries.add(SILVER_AXE);
                        entries.add(SILVER_SHOVEL);
                        entries.add(SILVER_HOE);
                        entries.add(SILVER_SPEAR);

                    }).build());

    public static final ItemGroup CONTINUUM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Continuum.MOD_ID, "continuum_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BASALT_SULPHUR_ORE))
                    .displayName(Text.translatable("itemgroup.continuum.blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(SULPHUR_ORE.asItem());
                        entries.add(DEEPSLATE_SULPHUR_ORE.asItem());
                        entries.add(BASALT_SULPHUR_ORE.asItem());
                        entries.add(SULPHUR_BLOCK.asItem());
                        entries.add(SULPHUR_TORCH.asItem());
                        entries.add(NICKEL_ORE.asItem());
                        entries.add(DEEPSLATE_NICKEL_ORE.asItem());
                        entries.add(NICKEL_BLOCK.asItem());
                        entries.add(NICKEL_CHAIN.asItem());
                        entries.add(NICKEL_BARS.asItem());
                        entries.add(NICKEL_DOOR.asItem());
                        entries.add(NICKEL_BUTTON.asItem());
                        entries.add(MEDIUM_WEIGHTED_PRESSURE_PLATE.asItem());
                        entries.add(NICKEL_TRAPDOOR.asItem());
                        entries.add(SILVER_ORE.asItem());
                        entries.add(DEEPSLATE_SILVER_ORE.asItem());
                        entries.add(SILVER_BLOCK.asItem());
                        entries.add(ULTRALIGHT_WEIGHTED_PRESSURE_PLATE.asItem());

                    }).build());


    public static void registerItemGroups() {
        Continuum.LOGGER.info("Registering Item Groups for Continuum!");
    }
}