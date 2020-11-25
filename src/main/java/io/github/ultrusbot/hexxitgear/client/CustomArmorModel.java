package io.github.ultrusbot.hexxitgear.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;

public class CustomArmorModel extends BipedEntityModel<LivingEntity> {
		private final ModelPart part;

		CustomArmorModel(float scale) {
			super(scale, 0, 1, 1);
			part = new ModelPart(this, 0, 0);
			part.addCuboid(-5F, 0F, 2F, 10, 10, 10);
			part.setPivot(0F, 0F, 0F);
			part.mirror = true;
		}

		@Override
		protected Iterable<ModelPart> getBodyParts() {
			return Collections.singleton(part);
		}

		@Override
		protected Iterable<ModelPart> getHeadParts() {
			return Collections::emptyIterator;
		}
	}