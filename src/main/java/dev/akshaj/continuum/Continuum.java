package dev.akshaj.continuum;

import dev.akshaj.continuum.entity.ModEntities;
import dev.akshaj.continuum.item.ModItemGroups;
import dev.akshaj.continuum.item.ModItems;
import dev.akshaj.continuum.block.ModBlocks;
import dev.akshaj.continuum.particle.ModParticles;
import dev.akshaj.continuum.trim.ModTrimMaterials;
import dev.akshaj.continuum.util.ModLootTableModifiers;
import dev.akshaj.continuum.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.entity.passive.WolfVariant;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Continuum implements ModInitializer {
	public static final String MOD_ID = "continuum";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<WolfVariant> DUNE_WOLF = RegistryKey.of(RegistryKeys.WOLF_VARIANT, Identifier.of("continuum", "dune_wolf"));
	public static final RegistryKey<WolfVariant> SHADE_WOLF = RegistryKey.of(RegistryKeys.WOLF_VARIANT, Identifier.of("continuum", "shade_wolf"));
	public static final RegistryKey<WolfVariant> PETAL_WOLF = RegistryKey.of(RegistryKeys.WOLF_VARIANT, Identifier.of("continuum", "petal_wolf"));
	public static final RegistryKey<WolfVariant> HAZE_WOLF = RegistryKey.of(RegistryKeys.WOLF_VARIANT, Identifier.of("continuum", "haze_wolf"));
    public static final SimpleParticleType SULPHUR_FLAME_PARTICLE = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.initialize();
		ModEntities.registerEntities();
		ModParticles.registerParticles();
		ModWorldGeneration.generateModWorldGen();
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
		LOGGER.info("Continuum by Akshaj, Initialized!");
	}
}