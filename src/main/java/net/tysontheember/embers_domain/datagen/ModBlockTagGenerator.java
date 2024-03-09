package net.tysontheember.embers_domain.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tysontheember.embers_domain.EmbersDomain;
import net.tysontheember.embers_domain.block.ModBlocks;
import net.tysontheember.embers_domain.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EmbersDomain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.MITHRIL_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MITHRIL_BLOCK.get(),
                    ModBlocks.RAW_MITHRIL_BLOCK.get(),
                    ModBlocks.NETHER_MITHRIL_ORE.get(),
                    ModBlocks.END_STONE_MITHRIL_ORE.get(),
                    ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                    ModBlocks.MITHRIL_ORE.get(),
                    ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MITHRIL_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.NETHER_MITHRIL_ORE.get())
                .add(ModBlocks.END_STONE_MITHRIL_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
                //add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
    }
}
