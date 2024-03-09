package net.tysontheember.embers_domain.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.tysontheember.embers_domain.EmbersDomain;
import net.tysontheember.embers_domain.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(1,3600,10f,5.0f,24,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, () -> Ingredient.of(ModItems.MITHRIL.get())),
            new ResourceLocation(EmbersDomain.MOD_ID, "mithril"), List.of(Tiers.NETHERITE), List.of());
 public static final Tier VIBRANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2,4200,11f,6.0f,32,
                    ModTags.Blocks.NEEDS_VIBRANIUM_TOOL, () -> Ingredient.of(ModItems.VIBRANIUM.get())),
            new ResourceLocation(EmbersDomain.MOD_ID, "vibranium"), List.of(Tiers.NETHERITE), List.of());
public static final Tier ADAMANTITE = TierSortingRegistry.registerTier(
            new ForgeTier(3,6400,12f,7.0f,48,
                    ModTags.Blocks.NEEDS_ADAMANTITE_TOOL, () -> Ingredient.of(ModItems.ADAMANTITE.get())),
            new ResourceLocation(EmbersDomain.MOD_ID, "adamantite"), List.of(Tiers.NETHERITE), List.of());
}
