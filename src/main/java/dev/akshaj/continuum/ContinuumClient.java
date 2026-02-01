package dev.akshaj.continuum;

import dev.akshaj.continuum.block.ModBlocks;
import dev.akshaj.continuum.entity.ModEntities;
import dev.akshaj.continuum.entity.client.TomahawkProjectileModel;
import dev.akshaj.continuum.entity.client.TomahawkProjectileRenderer;
import dev.akshaj.continuum.particle.ModParticles;
import dev.akshaj.continuum.particle.SulphurFlameParticle;
import dev.akshaj.continuum.trim.ModTrimMaterials;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class ContinuumClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // This line tells the game: "When the BLAST_CHARGE entity spawns,
        // render it as a flying item (like a snowball or egg)."
        EntityRendererRegistryImpl.register(ModEntities.BLAST_CHARGE, FlyingItemEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(TomahawkProjectileModel.TOMAHAWK, TomahawkProjectileModel::getTexturedModelData);
        EntityRendererRegistryImpl.register(ModEntities.TOMAHAWK, TomahawkProjectileRenderer::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SULPHUR_FLAME_PARTICLE, SulphurFlameParticle.Factory::new);
        BlockRenderLayerMap.putBlock(ModBlocks.NICKEL_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.NICKEL_BARS, BlockRenderLayer.CUTOUT);
    }
}