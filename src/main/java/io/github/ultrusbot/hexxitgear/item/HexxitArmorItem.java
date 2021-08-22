package io.github.ultrusbot.hexxitgear.item;

import io.github.ultrusbot.hexxitgear.HexxitGear;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HexxitArmorItem extends ArmorItem {
    public HexxitArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);

            if (helmet.getItem() == HexxitGear.TRIBAL_HELMET && chestplate.getItem() == HexxitGear.TRIBAL_CHESTPLATE && leggings.getItem() == HexxitGear.TRIBAL_LEGGINGS && boots.getItem() == HexxitGear.TRIBAL_BOOTS) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0, false, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2, false, false, true));
            }

            if (helmet.getItem() == HexxitGear.SCALE_HELMET && chestplate.getItem() == HexxitGear.SCALE_CHESTPLATE && leggings.getItem() == HexxitGear.SCALE_LEGGINGS && boots.getItem() == HexxitGear.SCALE_BOOTS) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 0, false, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, false, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 1, false, false, true));

            }
            if (helmet.getItem() == HexxitGear.THIEF_HELMET && chestplate.getItem() == HexxitGear.THIEF_CHESTPLATE && leggings.getItem() == HexxitGear.THIEF_LEGGINGS && boots.getItem() == HexxitGear.THIEF_BOOTS) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 0, false, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200, 0, false, false, true));

            }
        }
    }
}
