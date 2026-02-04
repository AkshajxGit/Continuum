package dev.akshaj.continuum.item;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.block.ModBlocks;
import dev.akshaj.continuum.item.ModFoodComponents;
import dev.akshaj.continuum.item.custom.BlastChargeItem;
import dev.akshaj.continuum.item.custom.TomahawkItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.Direction;

import java.util.function.Function;

public class ModItems {

    public static final Item RAW_SULPHUR = registerItem("raw_sulphur", Item::new);
    public static final Item SULPHUR = registerItem("sulphur", Item::new);

    public static final Item RAW_NICKEL = registerItem("raw_nickel", Item::new);
    public static final Item NICKEL = registerItem("nickel", Item::new);
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", Item::new);
    public static final Item NICKEL_HELMET = registerItem("nickel_helmet", setting -> new Item(setting.armor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item NICKEL_CHESTPLATE = registerItem("nickel_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item NICKEL_LEGGINGS = registerItem("nickel_leggings", setting -> new Item(setting.armor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item NICKEL_BOOTS = registerItem("nickel_boots", setting -> new Item(setting.armor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item NICKEL_HORSE_ARMOR = registerItem("nickel_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL).maxCount(1)));
    public static final Item NICKEL_NAUTILUS_ARMOR = registerItem("nickel_nautilus_armor", setting -> new Item(setting.nautilusArmor(ModArmorMaterials.NICKEL_ARMOR_MATERIAL).maxCount(1)));
    public static final Item NICKEL_SWORD = registerItem("nickel_sword", setting -> new Item(setting.sword(ModToolMaterials.NICKEL, 3, -2.4f)));
    public static final Item NICKEL_PICKAXE = registerItem("nickel_pickaxe",setting -> new Item(setting.pickaxe(ModToolMaterials.NICKEL, 1, -2.8f)));
    public static final Item NICKEL_AXE = registerItem("nickel_axe", setting -> new AxeItem(ModToolMaterials.NICKEL, 6, -3.2f, setting));
    public static final Item NICKEL_SHOVEL = registerItem("nickel_shovel",setting -> new ShovelItem(ModToolMaterials.NICKEL, 1.5f, -3.0f, setting));
    public static final Item NICKEL_HOE = registerItem("nickel_hoe", setting -> new HoeItem(ModToolMaterials.NICKEL, 0, -3f, setting));
    public static final Item NICKEL_SPEAR = registerItem("nickel_spear", setting -> new Item(setting.spear(ModToolMaterials.NICKEL, 1.05f, 1.05f, 0.65f, 3.0f, 9.5f, 8.0f, 5.6f, 12.75f, 4.9f)));

    public static final Item RAW_SILVER = registerItem("raw_silver", Item::new);
    public static final Item SILVER = registerItem("silver", Item::new);
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", Item::new);
    public static final Item SILVER_APPLE = registerItem("silver_apple", setting -> new Item(setting .food(ModFoodComponents.SILVER_APPLE, ModFoodComponents.SILVER_APPLE_EFFECT)));
    public static final Item ENCHANTED_SILVER_APPLE = registerItem("enchanted_silver_apple", setting -> new Item(setting .food(ModFoodComponents.ENCHANTED_SILVER_APPLE, ModFoodComponents.ENCHANTED_SILVER_APPLE_EFFECT).rarity(Rarity.RARE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final Item SILVER_HELMET = registerItem("silver_helmet", setting -> new Item(setting.armor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings", setting -> new Item(setting.armor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item SILVER_BOOTS = registerItem("silver_boots", setting -> new Item(setting.armor(ModArmorMaterials.SILVER_ARMOR_MATERIAL, EquipmentType.BOOTS)));
    public static final Item SILVER_HORSE_ARMOR = registerItem("silver_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL).maxCount(1)));
    public static final Item SILVER_NAUTILUS_ARMOR = registerItem("silver_nautilus_armor", setting -> new Item(setting.nautilusArmor(ModArmorMaterials.SILVER_ARMOR_MATERIAL).maxCount(1)));
    public static final Item SILVER_SWORD = registerItem("silver_sword", setting -> new Item(setting.sword(ModToolMaterials.SILVER, 3, -2.4f)));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",setting -> new Item(setting.pickaxe(ModToolMaterials.SILVER, 1, -2.8f)));
    public static final Item SILVER_AXE = registerItem("silver_axe", setting -> new AxeItem(ModToolMaterials.SILVER, 6, -3.2f, setting));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",setting -> new ShovelItem(ModToolMaterials.SILVER, 1.5f, -3.0f, setting));
    public static final Item SILVER_HOE = registerItem("silver_hoe", setting -> new HoeItem(ModToolMaterials.SILVER, 0, -3f, setting));
    public static final Item SILVER_SPEAR = registerItem("silver_spear", setting -> new Item(setting.spear(ModToolMaterials.SILVER, 0.90f, 0.85f, 0.55f, 2.75f, 8.75f, 7.25f, 5.4f, 12.0f, 4.8f)));
    public static final Item BRIMSTONE = registerItem("brimstone", Item::new);
    public static final Item BLAST_CHARGE = registerItem("blast_charge", setting -> new BlastChargeItem(setting.maxCount(16)));
    public static final Item SULPHUR_TORCH = registerItem("sulphur_torch", setting -> new VerticallyAttachableBlockItem(ModBlocks.SULPHUR_TORCH, ModBlocks.WALL_SULPHUR_TORCH, Direction.DOWN, setting));

    public static final Item TOMAHAWK = registerItem("tomahawk", setting -> new TomahawkItem(setting.maxCount(16)));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Continuum.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Continuum.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
        Continuum.LOGGER.info("Registering Items for Continuum!");
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(RAW_SULPHUR);
        entries.add(SULPHUR);
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
        entries.add(BRIMSTONE);
        entries.add(BLAST_CHARGE);
        entries.add(SULPHUR_TORCH);
        entries.add(TOMAHAWK);
    }
}
