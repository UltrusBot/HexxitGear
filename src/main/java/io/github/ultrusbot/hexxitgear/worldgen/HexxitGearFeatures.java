package io.github.ultrusbot.hexxitgear.worldgen;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.decorator.ConfiguredDecorator;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.decorator.NopeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class HexxitGearFeatures {

    public static final RandomPatchFeatureConfig HEXBISCUS_FLOWER_CONFIG = (new RandomPatchFeatureConfig.Builder((new SimpleBlockStateProvider(HexxitGear.HEXBISCUS_FLOWER.getDefaultState())), SimpleBlockPlacer.INSTANCE)).tries(16).build();
    public static ConfiguredFeature<?, ?> HEXBISCUS_FLOWER_PATCH = Feature.FLOWER.configure(HEXBISCUS_FLOWER_CONFIG).decorate(Decorators.SPREAD_32_ABOVE).decorate(Decorators.SQUARE_HEIGHTMAP);




    public static void registerFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("hexxitgear", "hexbiscus_patch"), HEXBISCUS_FLOWER_PATCH);
    }
    protected static final class Decorators {
        public static final ConfiguredDecorator<?> SPREAD_32_ABOVE;
        public static final ConfiguredDecorator<HeightmapDecoratorConfig> HEIGHTMAP;
        public static final ConfiguredDecorator<?> SQUARE_HEIGHTMAP;

        static {
            HEIGHTMAP = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING));
            SPREAD_32_ABOVE = Decorator.SPREAD_32_ABOVE.configure(NopeDecoratorConfig.INSTANCE);
            SQUARE_HEIGHTMAP = HEIGHTMAP.spreadHorizontally();

        }
    }
    }
