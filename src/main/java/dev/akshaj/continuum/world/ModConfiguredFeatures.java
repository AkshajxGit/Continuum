package dev.akshaj.continuum.world;

import dev.akshaj.continuum.Continuum;
import dev.akshaj.continuum.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;


import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>>  SILVER_ORE_KEY =  registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  DEEPSLATE_SILVER_ORE_KEY =  registerKey("deepslate_silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  NICKEL_ORE_KEY =  registerKey("nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  DEEPSLATE_NICKEL_ORE_KEY =  registerKey("deepslate_nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  SULPHUR_ORE_KEY =  registerKey("sulphur_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  DEEPSLATE_SULPHUR_ORE_KEY =  registerKey("deepslate_sulphur_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSulphurOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SULPHUR_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SULPHUR_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9));
        register(context, SULPHUR_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSulphurOres, 6));
        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOres, 7));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Continuum.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}