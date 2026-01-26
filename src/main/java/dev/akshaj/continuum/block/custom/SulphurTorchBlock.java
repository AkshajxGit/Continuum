package dev.akshaj.continuum.block.custom;

import dev.akshaj.continuum.particle.ModParticles;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SulphurTorchBlock extends TorchBlock {
    // Standard torch hitbox: 6x10x6 pixels
    protected static final VoxelShape SHAPE = Block.createCuboidShape(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

    public SulphurTorchBlock(Settings settings) {
        // We pass null to super because we are handling the particle manually in randomDisplayTick
        super(null, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        // Correct tip coordinates for 1.21.11
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.7;
        double z = pos.getZ() + 0.5;

        // Using the format you requested (0.0 for velocity to keep it still)
        world.addParticleClient(ModParticles.SULPHUR_FLAME_PARTICLE, x, y, z, 0.0, 0.0, 0.0);
        world.addParticleClient(ParticleTypes.SMOKE, x, y, z, 0.0, 0.0, 0.0);
    }
  }
