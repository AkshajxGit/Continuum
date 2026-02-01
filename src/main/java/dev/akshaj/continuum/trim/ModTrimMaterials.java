package dev.akshaj.continuum.trim;

import dev.akshaj.continuum.Continuum;
import net.minecraft.item.equipment.trim.ArmorTrimAssets;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
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
        register(registerable, SILVER, Style.EMPTY.withColor(0x70798c));
        register(registerable, SULPHUR, Style.EMPTY.withColor(0xd4d44a));
        register(registerable, NICKEL, Style.EMPTY.withColor(0x82846e));

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable,
                                 RegistryKey<ArmorTrimMaterial> armorTrimKey, Style style) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(ArmorTrimAssets.of(armorTrimKey.getValue().getPath()),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}