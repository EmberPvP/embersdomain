package net.tysontheember.embers_domain.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.tysontheember.embers_domain.EmbersDomain;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MITHRIL("mithril", 24, new int[]{ 5, 7, 5, 4 }, 24, SoundEvents.ARMOR_EQUIP_GENERIC, 2f, 1f, () -> Ingredient.of(ModItems.MITHRIL.get()));
    //VIBRANIUM("vibranium", 32, new int[]{ 5, 7, 5, 4 }, 32, SoundEvents.ARMOR_EQUIP_GENERIC, 3f, 4f, () -> Ingredient.of(ModItems.VIBRANIUM.get()));
    //ADAMANTITE("adamantite", 48, new int[]{ 5, 7, 5, 4 }, 48, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 2f, () -> Ingredient.of(ModItems.ADAMANTITE.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float KnockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        KnockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return EmbersDomain.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.KnockbackResistance;
    }
}
