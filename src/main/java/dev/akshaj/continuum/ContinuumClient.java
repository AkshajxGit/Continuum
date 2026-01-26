package dev.akshaj.continuum;

import dev.akshaj.continuum.entity.ModEntities;
import dev.akshaj.continuum.particle.ModParticles;
import dev.akshaj.continuum.particle.SulphurFlameParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class ContinuumClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // This line tells the game: "When the BLAST_CHARGE entity spawns,
        // render it as a flying item (like a snowball or egg)."
        EntityRendererRegistry.register(ModEntities.BLAST_CHARGE, FlyingItemEntityRenderer::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SULPHUR_FLAME_PARTICLE, SulphurFlameParticle.Factory::new);
    }
}