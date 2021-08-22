// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package io.github.ultrusbot.hexxitgear.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.entity.LivingEntity;

public class ScaleHelmetModel extends BipedEntityModel<LivingEntity> {

	public ScaleHelmetModel(ModelPart root) {
		super(root);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = getModelData(Dilation.NONE, 0);
		ModelPartData head = modelData.getRoot().getChild(EntityModelPartNames.HEAD);
		ModelPartData helmet = head.addChild("helmetModel", ModelPartBuilder.create()
				.uv(0, 16).cuboid(-5.0F, -9.0F, -5.0F, 10.0F, 9.0F, 10.0F, new Dilation(0.5F))
				.uv(0, 0).cuboid(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.4F)),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		helmet.addChild("right_horn", ModelPartBuilder.create()
				.uv(24, 0).cuboid(5.5F, -5.0F, -1.0F, 1.0F, 5.0F, 3.0F)
				.uv(4, 20).cuboid(6.5F, -6.0F, 1.0F, 1.0F, 4.0F, 2.0F)
				.uv(4, 4).cuboid(7.5F, -6.0F, 2.0F, 1.0F, 3.0F, 1.0F)
				.uv(2, 2).cuboid(7.5F, -4.0F, 3.0F, 2.0F, 1.0F, 1.0F)
				.uv(2, 2).cuboid(7.5F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		helmet.addChild("left_horn", ModelPartBuilder.create()
				.uv(24, 0).cuboid(-4.5F, -5.0F, -1.0F, 1.0F, 5.0F, 3.0F, true)
				.uv(4, 20).cuboid(-5.5F, -6.0F, 1.0F, 1.0F, 4.0F, 2.0F, true)
				.uv(4, 4).cuboid(-6.5F, -6.0F, 2.0F, 1.0F, 3.0F, 1.0F, true)
				.uv(2, 2).cuboid(-7.5F, -4.0F, 3.0F, 2.0F, 1.0F, 1.0F, true)
				.uv(2, 2).cuboid(-7.5F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, true),
				ModelTransform.pivot(-2.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
}