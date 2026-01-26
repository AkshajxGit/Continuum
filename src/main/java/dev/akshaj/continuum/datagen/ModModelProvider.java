package dev.akshaj.continuum.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import dev.akshaj.continuum.item.ModArmorMaterials;
import dev.akshaj.continuum.item.ModItems;
import net.minecraft.client.data.*;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(ModItems.NICKEL_HELMET, ModArmorMaterials.NICKEL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NICKEL_CHESTPLATE, ModArmorMaterials.NICKEL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NICKEL_LEGGINGS, ModArmorMaterials.NICKEL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NICKEL_BOOTS, ModArmorMaterials.NICKEL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.NICKEL_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_NAUTILUS_ARMOR, Models.GENERATED);

        itemModelGenerator.registerArmor(ModItems.SILVER_HELMET, ModArmorMaterials.SILVER_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.SILVER_CHESTPLATE, ModArmorMaterials.SILVER_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.SILVER_LEGGINGS, ModArmorMaterials.SILVER_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.SILVER_BOOTS, ModArmorMaterials.SILVER_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.register(ModItems.SILVER_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NAUTILUS_ARMOR, Models.GENERATED);


    }
}