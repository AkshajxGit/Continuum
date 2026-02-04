package dev.akshaj.continuum.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent SILVER_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2f).alwaysEdible().build();
    public static final FoodComponent ENCHANTED_SILVER_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.8f).alwaysEdible().build();

    public static final ConsumableComponent SILVER_APPLE_EFFECT = ConsumableComponent.builder()

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 1800, 1, false, true, true), 1.0f))

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0, false, true, true), 1.0f)).build();

    public static final ConsumableComponent ENCHANTED_SILVER_APPLE_EFFECT = ConsumableComponent.builder()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 2, false, true, true), 1.0f))

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 1, false, true, true), 1.0f))

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, true, true), 1.0f))

            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0, false, true, true), 1.0f)).build();
}
