package net.tysontheember.embers_domain.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.tysontheember.embers_domain.EmbersDomain;
import net.tysontheember.embers_domain.item.ModItems;
import net.tysontheember.embers_domain.loot.AddItemModifier;
import net.tysontheember.embers_domain.loot.AddSusSandItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EmbersDomain.MOD_ID);
    }

    @Override
    protected void start() {
        add("sapphire_from_diamond", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.DIAMOND_ORE).build(),
                LootItemRandomChanceCondition.randomChance(0.10f).build()}, ModItems.MITHRIL.get() ));

        add("sapphire_from_warden", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build()}, ModItems.MITHRIL.get()));

        add("dragonblood_scythe_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() }, ModItems.DRAGONBLOOD_SCYTHE.get()));

    }
}
