package net.tysontheember.embers_domain.util;

import net.minecraft.world.item.ElytraItem;
import net.tysontheember.embers_domain.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        makeTrident(ModItems.ADAMANTITE_SPEAR.get());
        makeTrident(ModItems.VIBRANIUM_SPEAR.get());
        makeBow(ModItems.ADAMANTITE_BOW.get());
        makeBow(ModItems.VIBRANIUM_BOW.get());
        //makeElytra(ModItems.);
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }
    private static void makeTrident(Item item) {
        ItemProperties.register(item, new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
    }
    private static void makeElytra(Item item) {
        ItemProperties.register(item, new ResourceLocation("broken"), (p_174590_, p_174591_, p_174592_, p_174593_) -> {
            return ElytraItem.isFlyEnabled(p_174590_) ? 0.0F : 1.0F;
        });
    }
}