package dev.akshaj.continuum.world;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> SULPHUR_ORE_PLACED_KEY = registerKey("sulphur_ore_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, SULPHUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SULPHUR_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(48))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(72))));


    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Continuum.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}