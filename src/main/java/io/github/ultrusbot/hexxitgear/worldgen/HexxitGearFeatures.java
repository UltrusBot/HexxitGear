package io.github.ultrusbot.hexxitgear.worldgen;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

import java.util.List;

public class HexxitGearFeatures {

public static ConfiguredFeature<RandomPatchFeatureConfig, ?> HEXBISCUS_FLOWER_PATCH = Feature.RANDOM_PATCH.configure(ConfiguredFeatureUtil.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(HexxitGear.HEXBISCUS_FLOWER))), List.of(), 32));

    public static void registerFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("hexxitgear", "hexbiscus_patch"), HEXBISCUS_FLOWER_PATCH);
    }
}
