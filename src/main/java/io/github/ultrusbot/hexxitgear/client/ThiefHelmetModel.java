// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package io.github.ultrusbot.hexxitgear.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;


public class ThiefHelmetModel extends BipedEntityModel<LivingEntity> {

	private final ModelPart head;
	ThiefHelmetModel(float scale) {
		super(scale, 0, 64, 64);

		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 33).addCuboid(-5.0F, -9.0F, -4.0F, 10.0F, 9.0F, 10.0F, 0.5F, false);
		head.setTextureOffset(0, 0).addCuboid(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.4F, false);	}


	@Override
	protected Iterable<ModelPart> getBodyParts() {
		return Collections::emptyIterator;
	}

	@Override
	protected Iterable<ModelPart> getHeadParts() {
		return Collections.singleton(head);

	}
}