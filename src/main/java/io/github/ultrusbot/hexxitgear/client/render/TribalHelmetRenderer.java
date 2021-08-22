package io.github.ultrusbot.hexxitgear.client.render;

import io.github.ultrusbot.hexxitgear.client.HexxitGearClient;
import io.github.ultrusbot.hexxitgear.client.model.TribalHelmetModel;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TribalHelmetRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = new Identifier("hexxitgear", "textures/armor/tribal_helmet.png");
    private static TribalHelmetModel tribalHelmetModel;
    public TribalHelmetRenderer() {

    }
    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> contextModel) {
        if (tribalHelmetModel == null) {
            tribalHelmetModel = new TribalHelmetModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HexxitGearClient.TRIBAL_MODEL_LAYER));;
        }

        contextModel.setAttributes(tribalHelmetModel);
        tribalHelmetModel.setVisible(false);
        tribalHelmetModel.head.visible = slot == EquipmentSlot.HEAD;
            ArmorRenderer.renderPart(matrices, vertexConsumers, light, stack, tribalHelmetModel, TEXTURE);
    }
}
