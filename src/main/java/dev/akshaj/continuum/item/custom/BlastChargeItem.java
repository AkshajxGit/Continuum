package dev.akshaj.continuum.item.custom;

import dev.akshaj.continuum.entity.BlastChargeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult; // <--- The new import
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BlastChargeItem extends Item {
    public BlastChargeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        // Play the throw sound
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F);

        // Spawn the entity on the server side
        if (!world.isClient()) {
            BlastChargeEntity blastEntity = new BlastChargeEntity(world, user);
            blastEntity.setItem(itemStack);
            blastEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(blastEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));

        // Consume item if not in Creative
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        // 1.21.4 Change: Return ActionResult.SUCCESS instead of TypedActionResult
        return ActionResult.SUCCESS;
    }
}