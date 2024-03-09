package net.tysontheember.embers_domain.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tysontheember.embers_domain.EmbersDomain;
import net.tysontheember.embers_domain.item.custom.FuelItem;
import net.tysontheember.embers_domain.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmbersDomain.MOD_ID);



    //MISC ITEMS

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> DRAGONBLOOD_SCYTHE = ITEMS.register("dragonblood_scythe",
            () -> new Item(new Item.Properties().stacksTo(1)));




    //MITHRIL

    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, 6, -2.8f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, 1, -2.8f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, -5, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, 3, -2.4f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, 1.5f, -3f, new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));




    //VIBRANIUM

    public static final RegistryObject<Item> VIBRANIUM = ITEMS.register("vibranium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword",
            () -> new SwordItem(ModToolTiers.VIBRANIUM, 4, -2.4f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VIBRANIUM_BOW = ITEMS.register("vibranium_bow",
            () -> new BowItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VIBRANIUM_SPEAR = ITEMS.register("vibranium_spear",
            () -> new TridentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VIBRANIUM_AXE = ITEMS.register("vibranium_axe",
            () -> new AxeItem(ModToolTiers.VIBRANIUM, 7, -2.8f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VIBRANIUM_STAFF = ITEMS.register("vibranium_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));




    //ADAMANTITE
    public static final RegistryObject<Item> ADAMANTITE = ITEMS.register("adamantite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ADAMANTITE_BOW = ITEMS.register("adamantite_bow",
            () -> new BowItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ADAMANTITE_SPEAR = ITEMS.register("adamantite_spear",
            () -> new TridentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ADAMANTITE_STAFF = ITEMS.register("adamantite_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}