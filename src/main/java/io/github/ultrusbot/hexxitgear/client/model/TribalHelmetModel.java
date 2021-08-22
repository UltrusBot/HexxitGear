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


public class TribalHelmetModel extends BipedEntityModel<LivingEntity> {

	public ModelPart head;

	public TribalHelmetModel(ModelPart root) {
		super(root);
		this.head = root.getChild(EntityModelPartNames.HEAD);

	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = getModelData(Dilation.NONE, 0);
		ModelPartData head = modelData.getRoot().getChild(EntityModelPartNames.HEAD);
		ModelPartData modelPartData = head.addChild("helmetModel", ModelPartBuilder.create()
				.uv(0, 0)
				.cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		modelPartData.addChild("left_horn", ModelPartBuilder.create()
				.uv(25, 0)
				.cuboid(-7.5F, -7.0F, 0.0F, 3.0F, 2.0F, 2.0F)
				.uv(25, 5)
				.cuboid(-7.0F, -8.0F, 0.5F, 1.0F, 1.0F, 1.0F),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		modelPartData.addChild("right_horn", ModelPartBuilder.create()
				.uv(25, 0)
				.cuboid(4.5F, -7.0F, 0.0F, 3.0F, 2.0F, 2.0F, true)
				.uv(25, 5)
				.cuboid(6.0F, -8.0F, 0.5F, 1.0F, 1.0F, 1.0F, true),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		return TexturedModelData.of(modelData, 64, 32);
	}

}