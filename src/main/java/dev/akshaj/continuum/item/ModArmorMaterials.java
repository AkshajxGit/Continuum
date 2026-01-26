package dev.akshaj.continuum.item;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> NICKEL_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Continuum.MOD_ID, "nickel"));
    public static final RegistryKey<EquipmentAsset> SILVER_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(Continuum.MOD_ID, "silver"));

    public static final ArmorMaterial NICKEL_ARMOR_MATERIAL = new ArmorMaterial(1155, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 5);
    }), 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0,0, ModTags.Items.NICKEL_REPAIR, NICKEL_KEY);

    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = new ArmorMaterial(1155, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0,0, ModTags.Items.SILVER_REPAIR, SILVER_KEY);
}