package com.g.firstmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffects(new StatusEffectInstance(StatusEffects.SPEED, 3000), 100).build();
}
