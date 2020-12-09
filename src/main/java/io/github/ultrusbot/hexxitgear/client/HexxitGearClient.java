package io.github.ultrusbot.hexxitgear.client;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class HexxitGearClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TribalHelmetModel tribalHelmet = new TribalHelmetModel(1.0F);
        ScaleHelmetModel scaleHelmet = new ScaleHelmetModel(1.0F);
        ThiefHelmetModel thiefHelmet = new ThiefHelmetModel(1.0F);

        ArmorRenderingRegistry.registerModel((entity, stack, slot, defaultModel) -> tribalHelmet, HexxitGear.TRIBAL_HELMET);
        ArmorRenderingRegistry.registerTexture((entity, stack, slot, secondLayer, suffix, defaultTexture) ->
                new Identifier("hexxitgear", "textures/armor/tribal_helmet.png"), HexxitGear.TRIBAL_HELMET);

        ArmorRenderingRegistry.registerModel((entity, stack, slot, defaultModel) -> scaleHelmet, HexxitGear.SCALE_HELMET);
        ArmorRenderingRegistry.registerTexture((entity, stack, slot, secondLayer, suffix, defaultTexture) ->
                new Identifier("hexxitgear", "textures/armor/scale_helmet.png"), HexxitGear.SCALE_HELMET);

        ArmorRenderingRegistry.registerModel((entity, stack, slot, defaultModel) -> thiefHelmet, HexxitGear.THIEF_HELMET);
        ArmorRenderingRegistry.registerTexture((entity, stack, slot, secondLayer, suffix, defaultTexture) ->
                new Identifier("hexxitgear", "textures/armor/thief_helmet.png"), HexxitGear.THIEF_HELMET);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), HexxitGear.HEXBISCUS_FLOWER);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), HexxitGear.POTTED_HEXBISCUS_FLOWER);

    }
}
