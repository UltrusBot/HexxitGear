package io.github.ultrusbot.hexxitgear.client;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import io.github.ultrusbot.hexxitgear.client.model.ScaleHelmetModel;
import io.github.ultrusbot.hexxitgear.client.model.ThiefHelmetModel;
import io.github.ultrusbot.hexxitgear.client.model.TribalHelmetModel;
import io.github.ultrusbot.hexxitgear.client.render.ScaleHelmetRenderer;
import io.github.ultrusbot.hexxitgear.client.render.ThiefHelmetRenderer;
import io.github.ultrusbot.hexxitgear.client.render.TribalHelmetRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class HexxitGearClient implements ClientModInitializer {
    public static final EntityModelLayer TRIBAL_MODEL_LAYER = new EntityModelLayer(new Identifier(HexxitGear.MOD_ID, "tribal_helmet"), "main");
    public static final EntityModelLayer SCALE_MODEL_LAYER = new EntityModelLayer(new Identifier(HexxitGear.MOD_ID, "scale_helmet"), "main");
    public static final EntityModelLayer THIEF_MODEL_LAYER = new EntityModelLayer(new Identifier(HexxitGear.MOD_ID, "thief_helmet"), "main");

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(TRIBAL_MODEL_LAYER, TribalHelmetModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SCALE_MODEL_LAYER, ScaleHelmetModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(THIEF_MODEL_LAYER, ThiefHelmetModel::getTexturedModelData);

        ArmorRenderer.register(new ThiefHelmetRenderer(), HexxitGear.THIEF_HELMET);
        ArmorRenderer.register(new TribalHelmetRenderer(), HexxitGear.TRIBAL_HELMET);
        ArmorRenderer.register(new ScaleHelmetRenderer(), HexxitGear.SCALE_HELMET);


        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), HexxitGear.HEXBISCUS_FLOWER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), HexxitGear.POTTED_HEXBISCUS_FLOWER);

    }
}
