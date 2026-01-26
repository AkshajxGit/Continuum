package dev.akshaj.continuum.entity;

import dev.akshaj.continuum.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class BlastChargeEntity extends ThrownItemEntity {

    // Default constructor for the game engine
    public BlastChargeEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    // Constructor for the player throwing it
    public BlastChargeEntity(World world, LivingEntity owner) {
        super(ModEntities.BLAST_CHARGE, world);
        this.setOwner(owner);
        this.setPosition(owner.getX(), owner.getEyeY() - 0.1, owner.getZ());
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BLAST_CHARGE;
    }

    @Override
    public void tick() {
        super.tick();

        // 3.25 seconds * 20 ticks = 65 ticks
        // If it flies longer than this, it vanishes (limits range to ~64 blocks)
        if (this.age >= 65) {
            this.discard();
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getEntityWorld().isClient()) {
            // Power 4.0F = TNT strength
            this.getEntityWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 4.0F, World.ExplosionSourceType.TNT);
            this.discard();
        }
    }
}