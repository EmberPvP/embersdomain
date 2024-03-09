package net.tysontheember.embers_domain.item;

import net.tysontheember.embers_domain.EmbersDomain;
import net.tysontheember.embers_domain.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmbersDomain.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EMBERS_DOMAIN_TAB = CREATIVE_MODE_TABS.register("embers_domain_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRAGONBLOOD_SCYTHE.get()))
                    .title(Component.translatable("creative.embers_domain_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MITHRIL.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());
                        pOutput.accept(ModBlocks.MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_MITHRIL_ORE.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModItems.STRAWBERRY.get());

                        pOutput.accept(ModItems.PINE_CONE.get());

                        pOutput.accept(ModItems.DRAGONBLOOD_SCYTHE.get());

                        pOutput.accept(ModItems.ADAMANTITE_SWORD.get());

                        pOutput.accept(ModItems.ADAMANTITE_BOW.get());

                        pOutput.accept(ModItems.ADAMANTITE_SPEAR.get());
                        pOutput.accept(ModItems.ADAMANTITE_STAFF.get());

                        pOutput.accept(ModItems.MITHRIL_AXE.get());
                        pOutput.accept(ModItems.MITHRIL_HOE.get());
                        pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MITHRIL_SWORD.get());

                        pOutput.accept(ModItems.MITHRIL_HELMET.get());
                        pOutput.accept(ModItems.MITHRIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.MITHRIL_LEGGINGS.get());
                        pOutput.accept(ModItems.MITHRIL_BOOTS.get());

                        pOutput.accept(ModItems.VIBRANIUM_BOW.get());
                        pOutput.accept(ModItems.VIBRANIUM_SPEAR.get());
                        pOutput.accept(ModItems.VIBRANIUM_SWORD.get());
                        pOutput.accept(ModItems.VIBRANIUM_AXE.get());
                        pOutput.accept(ModItems.VIBRANIUM_STAFF.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
