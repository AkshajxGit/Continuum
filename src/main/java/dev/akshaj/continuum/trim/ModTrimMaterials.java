package dev.akshaj.continuum.trim;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.trim.ArmorTrimAssets;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> SILVER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Continuum.MOD_ID, "silver"));

    public static final RegistryKey<ArmorTrimMaterial> SULPHUR = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Continuum.MOD_ID, "sulphur"));

    public static final RegistryKey<ArmorTrimMaterial> NICKEL = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Continuum.MOD_ID, "nickel"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, SILVER, Registries.ITEM.getEntry(ModItems.SILVER
        ), Style.EMPTY.withColor(TextColor.parse("#70798c").getOrThrow()));

        register(registerable, SULPHUR, Registries.ITEM.getEntry(ModItems.SULPHUR
        ), Style.EMPTY.withColor(TextColor.parse("#d4d44a").getOrThrow()));

        register(registerable, NICKEL, Registries.ITEM.getEntry(ModItems.NICKEL
        ), Style.EMPTY.withColor(TextColor.parse("#82846e").getOrThrow()));

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(ArmorTrimAssets.of("silver"),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        new ArmorTrimMaterial(ArmorTrimAssets.of("sulphur"),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        new ArmorTrimMaterial(ArmorTrimAssets.of("nickel"),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}