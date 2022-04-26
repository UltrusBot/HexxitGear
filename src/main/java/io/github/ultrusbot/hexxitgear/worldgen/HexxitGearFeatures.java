package io.github.ultrusbot.hexxitgear.worldgen;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.block.Blocks;
import net.minecraft.util.Holder;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.List;

import static io.github.ultrusbot.hexxitgear.HexxitGear.MOD_ID;

public class HexxitGearFeatures {

    public static Holder<ConfiguredFeature<RandomPatchFeatureConfig, ?>> HEXBISCUS_FLOWER_PATCH;

    static {
        HEXBISCUS_FLOWER_PATCH = register("hexbiscus_patch", Feature.RANDOM_PATCH, createRandomPatchFeatureConfig(BlockStateProvider.of(HexxitGear.HEXBISCUS_FLOWER), 16));
    }
    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatureUtil.createRandomPatchFeatureConfig(tries, PlacedFeatureUtil.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }
    public static void init() {
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> register(String id, F feature, FC featureConfig) {
        return BuiltinRegistries.registerExact(BuiltinRegistries.CONFIGURED_FEATURE, MOD_ID + ":" + id, new ConfiguredFeature(feature, featureConfig));
    }

}
