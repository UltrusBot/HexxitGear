package io.github.ultrusbot.hexxitgear.worldgen;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.util.Holder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacementModifier;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

public class HexxitGearPlacedFeatures {
    public static final Holder<PlacedFeature> PATCH_HEXBISCUS;
    static {
        PATCH_HEXBISCUS = PlacedFeatureUtil.register(HexxitGear.MOD_ID + ":hexbiscus_patch", HexxitGearFeatures.HEXBISCUS_FLOWER_PATCH, RarityFilterPlacementModifier.create(160), InSquarePlacementModifier.getInstance(), PlacedFeatureUtil.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.getInstance());

    }
    public static void init() {
    }

}
