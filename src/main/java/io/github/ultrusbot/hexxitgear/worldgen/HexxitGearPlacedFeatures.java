package io.github.ultrusbot.hexxitgear.worldgen;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

public class HexxitGearPlacedFeatures {
    public static final PlacedFeature PATCH_HEXBISCUS;
    static {
        PATCH_HEXBISCUS = HexxitGearFeatures.HEXBISCUS_FLOWER_PATCH.withPlacement(RarityFilterPlacementModifier.create(100), InSquarePlacementModifier.getInstance(), PlacedFeatureUtil.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.getInstance());
    }
    public static void registerPlacedFeatures() {
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("hexxitgear", "hexbiscus_patch"), PATCH_HEXBISCUS);
    }
}
