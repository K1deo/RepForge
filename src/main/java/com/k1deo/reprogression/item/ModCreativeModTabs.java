package com.k1deo.reprogression.item;

import com.k1deo.reprogression.Reprogression;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reprogression.MODID);

    public static final RegistryObject<CreativeModeTab> REPROGRESSION_TAB = CREATIVE_MODE_TABS.register("reprogression_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get()))
                    .title(Component.translatable("creativetab.reprogression_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LEATHER_FRAGMENT.get());
                        output.accept(ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get());
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
