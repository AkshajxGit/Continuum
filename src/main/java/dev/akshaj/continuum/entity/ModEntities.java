package dev.akshaj.continuum.entity;

import dev.akshaj.continuum.Continuum;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {

    // 1. Define the ID separately so we can reuse it
    public static final Identifier BLAST_CHARGE_ID = Identifier.of("continuum", "blast_charge");

    // 2. Create the "Registry Key" (This is what 1.21.4 demands!)
    public static final RegistryKey<EntityType<?>> BLAST_CHARGE_KEY = RegistryKey.of(RegistryKeys.ENTITY_TYPE, BLAST_CHARGE_ID);

    // 3. Register the Entity
    public static final EntityType<BlastChargeEntity> BLAST_CHARGE = Registry.register(
            Registries.ENTITY_TYPE,
            BLAST_CHARGE_ID,
            EntityType.Builder.<BlastChargeEntity>create(BlastChargeEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25F, 0.25F)
                    .build(BLAST_CHARGE_KEY) // <--- NO MORE NULL! We pass the key here.
    );

    public static void registerEntities() {
        Continuum.LOGGER.info("Registering Entities for Continuum");
    }
}