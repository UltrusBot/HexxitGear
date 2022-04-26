package io.github.ultrusbot.hexxitgear;

import io.github.ultrusbot.hexxitgear.item.HexicalCore;
import io.github.ultrusbot.hexxitgear.item.HexxitArmorItem;
import io.github.ultrusbot.hexxitgear.item.HexxitGearArmorMaterials;
import io.github.ultrusbot.hexxitgear.worldgen.HexxitGearFeatures;
import io.github.ultrusbot.hexxitgear.worldgen.HexxitGearPlacedFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HexxitGear implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "hexxitgear";
    public static final String MOD_NAME = "Hexxit Gear";

    public static Item HEXICAL_DIAMOND;
    public static final ItemGroup HEXXIT_ITEMS = FabricItemGroupBuilder.build(new Identifier("hexxitgear", "general"), () -> new ItemStack(HEXICAL_DIAMOND));

    public static final Item TRIBAL_HELMET = new HexxitArmorItem(HexxitGearArmorMaterials.TRIBAL, EquipmentSlot.HEAD, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item TRIBAL_CHESTPLATE = new HexxitArmorItem(HexxitGearArmorMaterials.TRIBAL, EquipmentSlot.CHEST, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item TRIBAL_LEGGINGS = new HexxitArmorItem(HexxitGearArmorMaterials.TRIBAL, EquipmentSlot.LEGS, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item TRIBAL_BOOTS = new HexxitArmorItem(HexxitGearArmorMaterials.TRIBAL, EquipmentSlot.FEET, (new Item.Settings().group(HEXXIT_ITEMS)));

    public static final Item THIEF_HELMET = new HexxitArmorItem(HexxitGearArmorMaterials.THIEF, EquipmentSlot.HEAD, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item THIEF_CHESTPLATE = new HexxitArmorItem(HexxitGearArmorMaterials.THIEF, EquipmentSlot.CHEST, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item THIEF_LEGGINGS = new HexxitArmorItem(HexxitGearArmorMaterials.THIEF, EquipmentSlot.LEGS, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item THIEF_BOOTS = new HexxitArmorItem(HexxitGearArmorMaterials.THIEF, EquipmentSlot.FEET, (new Item.Settings().group(HEXXIT_ITEMS)));

    public static final Item SCALE_HELMET = new HexxitArmorItem(HexxitGearArmorMaterials.SCALE, EquipmentSlot.HEAD, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item SCALE_CHESTPLATE = new HexxitArmorItem(HexxitGearArmorMaterials.SCALE, EquipmentSlot.CHEST, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item SCALE_LEGGINGS = new HexxitArmorItem(HexxitGearArmorMaterials.SCALE, EquipmentSlot.LEGS, (new Item.Settings().group(HEXXIT_ITEMS)));
    public static final Item SCALE_BOOTS = new HexxitArmorItem(HexxitGearArmorMaterials.SCALE, EquipmentSlot.FEET, (new Item.Settings().group(HEXXIT_ITEMS)));

    public static final Block HEXBISCUS_FLOWER = new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));
    public static final Block POTTED_HEXBISCUS_FLOWER = new FlowerPotBlock(HEXBISCUS_FLOWER, FabricBlockSettings.of(Material.DECORATION).breakInstantly().nonOpaque());
    public static final Item HEXICAL_ESSENCE = new Item(new Item.Settings().group(HEXXIT_ITEMS));
    public static final Item HEXICAL_CORE = new HexicalCore(new Item.Settings().group(HEXXIT_ITEMS));


    @Override
    public void onInitialize() {

        log(Level.INFO, "Initializing");
        registerBlock(HEXBISCUS_FLOWER, "hexbiscus", true);
        registerBlock(POTTED_HEXBISCUS_FLOWER, "potted_hexbiscus_flower", false);
        HEXICAL_DIAMOND = new Item(new Item.Settings().group(HEXXIT_ITEMS));
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","hexical_essence"), HEXICAL_ESSENCE);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","hexical_diamond"), HEXICAL_DIAMOND);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","hexical_core"), HEXICAL_CORE);

        Registry.register(Registry.ITEM,new Identifier("hexxitgear","tribal_helmet"), TRIBAL_HELMET);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","tribal_chestplate"), TRIBAL_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","tribal_leggings"), TRIBAL_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","tribal_boots"), TRIBAL_BOOTS);

        Registry.register(Registry.ITEM,new Identifier("hexxitgear","thief_helmet"), THIEF_HELMET);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","thief_chestplate"), THIEF_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","thief_leggings"), THIEF_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","thief_boots"), THIEF_BOOTS);

        Registry.register(Registry.ITEM,new Identifier("hexxitgear","scale_helmet"), SCALE_HELMET);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","scale_chestplate"), SCALE_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","scale_leggings"), SCALE_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier("hexxitgear","scale_boots"), SCALE_BOOTS);

        HexxitGearFeatures.init();
        HexxitGearPlacedFeatures.init();

        RegistryKey<PlacedFeature> hexbiscus_patch = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier("hexxitgear", "hexbiscus_patch"));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, hexbiscus_patch);

    }
    private void registerBlock(Block block, String blockName, boolean item) {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, blockName), block);
        if (item) {
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(HEXXIT_ITEMS)));
        }
    }
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}
