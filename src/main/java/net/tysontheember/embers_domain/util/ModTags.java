package net.tysontheember.embers_domain.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tysontheember.embers_domain.EmbersDomain;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = tag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_VIBRANIUM_TOOL = tag("needs_vibranium_tool");
        public static final TagKey<Block> NEEDS_ADAMANTITE_TOOL = tag("needs_adamantite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EmbersDomain.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EmbersDomain.MOD_ID, name));
        }
    }
}
