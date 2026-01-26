package dev.akshaj.continuum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import dev.akshaj.continuum.item.ModItems;
import dev.akshaj.continuum.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NICKEL_HELMET)
                .add(ModItems.NICKEL_CHESTPLATE)
                .add(ModItems.NICKEL_LEGGINGS)
                .add(ModItems.NICKEL_BOOTS);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.NICKEL);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SILVER_HELMET)
                .add(ModItems.SILVER_CHESTPLATE)
                .add(ModItems.SILVER_LEGGINGS)
                .add(ModItems.SILVER_BOOTS);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.SILVER);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.SULPHUR);


    }
}