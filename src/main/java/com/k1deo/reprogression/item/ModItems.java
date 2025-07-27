package com.k1deo.reprogression.item;

import com.k1deo.reprogression.Reprogression;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Reprogression.MODID);


    public static final RegistryObject<Item> LEATHER_FRAGMENT = ITEMS.register("leather_fragment",
            () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> DIAMOND_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("diamond_upgrade_smithing_template",
//            () -> new Item(new Item.Properties()));

    private static Item createDiamondUpgradeTemplate() {
        return new SmithingTemplateItem(
                Component.translatable("item.reprogression.diamond_upgrade_smithing_template.applies_to"),
                Component.translatable("item.reprogression.diamond_upgrade_smithing_template.ingredients"),
                Component.translatable("item.reprogression.diamond_upgrade_smithing_template.desc"),
                Component.translatable("item.reprogression.diamond_upgrade_smithing_template.base"),
                Component.translatable("item.reprogression.diamond_upgrade_smithing_template.material"),
                List.of(
                        ResourceLocation.parse("minecraft:item/empty_armor_slot_helmet"),
                        ResourceLocation.parse("minecraft:item/empty_armor_slot_chestplate"),
                        ResourceLocation.parse("minecraft:item/empty_armor_slot_leggings"),
                        ResourceLocation.parse("minecraft:item/empty_armor_slot_boots"),
                        ResourceLocation.parse("minecraft:item/empty_slot_sword"),
                        ResourceLocation.parse("minecraft:item/empty_slot_pickaxe"),
                        ResourceLocation.parse("minecraft:item/empty_slot_axe"),
                        ResourceLocation.parse("minecraft:item/empty_slot_shovel"),
                        ResourceLocation.parse("minecraft:item/empty_slot_hoe")
                ),
                List.of(
                        ResourceLocation.parse("minecraft:item/empty_slot_ingot")
                )
        );
    }



    public static final RegistryObject<Item> DIAMOND_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("diamond_upgrade_smithing_template",
            ModItems::createDiamondUpgradeTemplate);



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    };
}
