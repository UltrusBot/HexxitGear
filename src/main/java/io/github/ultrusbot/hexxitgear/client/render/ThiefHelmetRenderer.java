package io.github.ultrusbot.hexxitgear.client.render;

import io.github.ultrusbot.hexxitgear.client.HexxitGearClient;
import io.github.ultrusbot.hexxitgear.client.model.ThiefHelmetModel;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ThiefHelmetRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = new Identifier("hexxitgear", "textures/armor/thief_helmet.png");
    private static ThiefHelmetModel thiefHelmetModel;
    public ThiefHelmetRenderer() {

    }
    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> contextModel) {
        if (thiefHelmetModel == null) {
            thiefHelmetModel = new ThiefHelmetModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HexxitGearClient.THIEF_MODEL_LAYER));;
        }

        contextModel.setAttributes(thiefHelmetModel);
        thiefHelmetModel.setVisible(false);
        thiefHelmetModel.head.visible = slot == EquipmentSlot.HEAD;
            ArmorRenderer.renderPart(matrices, vertexConsumers, light, stack, thiefHelmetModel, TEXTURE);
    }
}
