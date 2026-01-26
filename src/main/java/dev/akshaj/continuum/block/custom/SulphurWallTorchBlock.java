package dev.akshaj.continuum.block.custom;

import dev.akshaj.continuum.particle.ModParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class SulphurWallTorchBlock extends WallTorchBlock {
    // These are the vanilla bounding boxes for each direction
    private static final Map<Direction, VoxelShape> BOUNDING_SHAPES = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.createCuboidShape(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
            Direction.SOUTH, Block.createCuboidShape(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
            Direction.WEST, Block.createCuboidShape(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
            Direction.EAST, Block.createCuboidShape(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
    ));

    public SulphurWallTorchBlock(Settings settings) {
        // Passing null for particle since we handle it below
        super(null, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BOUNDING_SHAPES.get(state.get(FACING));
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        Direction direction = state.get(FACING);
        Direction opposite = direction.getOpposite();

        // Calculations for tilted tip of the torch
        double x = (double)pos.getX() + 0.5 + 0.27 * (double)opposite.getOffsetX();
        double y = (double)pos.getY() + 0.92;
        double z = (double)pos.getZ() + 0.5 + 0.27 * (double)opposite.getOffsetZ();

        // Add your custom flame particle
        world.addParticleClient(ModParticles.SULPHUR_FLAME_PARTICLE, x, y, z, 0.0, 0.0, 0.0);
        world.addParticleClient(ParticleTypes.SMOKE, x, y, z, 0.0, 0.0, 0.0);
    }
}