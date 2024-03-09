package net.tysontheember.embers_domain.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.embers_domain.block.ModBlocks;
import net.tysontheember.embers_domain.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.MITHRIL_ORE.get(),
                block -> createSapphireOreDrops(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
         this.add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                block -> createSapphireOreDrops(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
         this.add(ModBlocks.NETHER_MITHRIL_ORE.get(),
                block -> createSapphireOreDrops(ModBlocks.NETHER_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
         this.add(ModBlocks.END_STONE_MITHRIL_ORE.get(),
                block -> createSapphireOreDrops(ModBlocks.END_STONE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));

    }

    protected LootTable.Builder createSapphireOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
