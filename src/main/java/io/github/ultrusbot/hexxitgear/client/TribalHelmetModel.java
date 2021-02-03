// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package io.github.ultrusbot.hexxitgear.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;


public class TribalHelmetModel extends BipedEntityModel<LivingEntity> {

	private final ModelPart helm;
	private final ModelPart hornleft;
	private final ModelPart hornright;

	TribalHelmetModel(float scale) {
		super(scale, 0, 64, 32);

		helm = new ModelPart(this);
		helm.setPivot(0.0F, 0.0F, 0.0F);
		helm.setTextureOffset(0, 0).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		hornleft = new ModelPart(this);
		hornleft.setPivot(0.0F, 0.0F, 0.0F);
		helm.addChild(hornleft);
		hornleft.setTextureOffset(25, 0).addCuboid(-7.5F, -7.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		hornleft.setTextureOffset(25, 5).addCuboid(-7.0F, -8.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		hornright = new ModelPart(this);
		hornright.setPivot(0.0F, 0.0F, 0.0F);
		helm.addChild(hornright);
		hornright.setTextureOffset(25, 0).addCuboid(4.5F, -7.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		hornright.setTextureOffset(25, 5).addCuboid(6.0F, -8.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

	}


	@Override
	protected Iterable<ModelPart> getBodyParts() {
		return Collections::emptyIterator;
	}

	@Override
	protected Iterable<ModelPart> getHeadParts() {
		return Collections.singletonList(this.helm);

	}

	@Override
	public void setAngles(LivingEntity livingEntity, float f, float g, float h, float i, float j) {
		super.setAngles(livingEntity, f, g, h, i, j);
		helm.copyPositionAndRotation(this.head);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		helmet.visible = false;
		super.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
}