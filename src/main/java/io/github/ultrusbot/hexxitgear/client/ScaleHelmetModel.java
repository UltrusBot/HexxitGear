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


public class ScaleHelmetModel extends BipedEntityModel<LivingEntity> {

	private final ModelPart head;
	private final ModelPart rightthing;
	private final ModelPart leftthing;
	ScaleHelmetModel(float scale) {
		super(scale, 0, 64, 64);

		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 16).addCuboid(-5.0F, -9.0F, -5.0F, 10.0F, 9.0F, 10.0F, 0.5F, false);
		head.setTextureOffset(0, 0).addCuboid(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.4F, false);

		rightthing = new ModelPart(this);
		rightthing.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(rightthing);
		rightthing.setTextureOffset(24, 0).addCuboid(5.5F, -5.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		rightthing.setTextureOffset(4, 20).addCuboid(6.5F, -6.0F, 1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		rightthing.setTextureOffset(4, 4).addCuboid(7.5F, -6.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rightthing.setTextureOffset(2, 2).addCuboid(7.5F, -4.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		rightthing.setTextureOffset(2, 2).addCuboid(7.5F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		leftthing = new ModelPart(this);
		leftthing.setPivot(-2.0F, 0.0F, 0.0F);
		head.addChild(leftthing);
		leftthing.setTextureOffset(24, 0).addCuboid(-4.5F, -5.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, true);
		leftthing.setTextureOffset(4, 20).addCuboid(-5.5F, -6.0F, 1.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		leftthing.setTextureOffset(4, 4).addCuboid(-6.5F, -6.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		leftthing.setTextureOffset(2, 2).addCuboid(-7.5F, -4.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		leftthing.setTextureOffset(2, 2).addCuboid(-7.5F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);

	}


	@Override
	protected Iterable<ModelPart> getBodyParts() {
		return Collections::emptyIterator;
	}

	@Override
	protected Iterable<ModelPart> getHeadParts() {
		return Collections.singleton(head);

	}
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}
}