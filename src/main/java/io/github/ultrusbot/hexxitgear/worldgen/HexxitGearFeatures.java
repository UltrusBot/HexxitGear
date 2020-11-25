package io.github.ultrusbot.hexxitgear.worldgen;

import com.google.common.collect.ImmutableSet;
import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class HexxitGearFeatures {

    public static final RandomPatchFeatureConfig HEXBISCUS_FLOWER_CONFIG = (new RandomPatchFeatureConfig.Builder((new SimpleBlockStateProvider(HexxitGear.HEXBISCUS_FLOWER.getDefaultState())), SimpleBlockPlacer.INSTANCE)).tries(16).build();
    public static ConfiguredFeature<?, ?> HEXBISCUS_FLOWER_PATCH = Feature.FLOWER.configure(HEXBISCUS_FLOWER_CONFIG).decorate(ConfiguredFeatures.Decorators.SPREAD_32_ABOVE).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP);




    public static void registerFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("hexxitgear", "hexbiscus_patch"), HEXBISCUS_FLOWER_PATCH);
    }

}
