package com.k1deo.reprogression.datagen;

import com.k1deo.reprogression.Reprogression;
import com.k1deo.reprogression.item.ModItems;
import com.k1deo.reprogression.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, String modid) {
        super(output, Reprogression.MODID);
    }

    private void addItemDrop(String id, Item item, String namespace ,String entityLootTablePath, float chance) {
        LootItemCondition[] conditions = new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath(namespace, entityLootTablePath)).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()
        };

        add(id, new AddItemModifier(conditions, item));
    }

    @Override
    protected void start() {
        addItemDrop("leather_fragments_from_cows",ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/cow", 0.55f);
        addItemDrop("leather_fragments_from_pigs", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/pig", 0.35f);
        addItemDrop("leather_fragments_from_sheep", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/sheep", 0.35f);
        addItemDrop("leather_fragments_from_horses", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/horse", 0.35f);
        addItemDrop("leather_fragments_from_donkeys", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/donkey", 0.35f);
        addItemDrop("leather_fragments_from_mules", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/mule", 0.35f);
        addItemDrop("leather_fragments_from_llamas", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/llama", 0.65f);
        addItemDrop("leather_fragments_from_wolves", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/wolf", 0.35f);
        addItemDrop("leather_fragments_from_zombies", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/zombie", 0.35f);
        addItemDrop("leather_fragments_from_zombie_villagers", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/zombie_villager", 0.35f);
        addItemDrop("leather_fragments_from_illagers", ModItems.LEATHER_FRAGMENT.get(), "minecraft", "entities/illager", 0.35f);

        addItemDrop("diamond_upgrade_from_pillagers", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "entities/pillager", 0.3f);
        addItemDrop("diamond_upgrade_from_evokers", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "entities/evoker", 0.65f);
        addItemDrop("diamond_upgrade_from_vindicators", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "entities/vindicator", 0.35f);
        addItemDrop("diamond_upgrade_from_witches", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "entities/witch", 0.25f);
        addItemDrop("diamond_upgrade_from_loot_mineshaft", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/loot_mineshaft", 0.45f);
        addItemDrop("diamond_upgrade_from_loot_desert_pyramid", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/desert_pyramid", 0.25f);
        addItemDrop("diamond_upgrade_from_loot_jungle_temple", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/jungle_temple", 0.25f);
        addItemDrop("diamond_upgrade_from_loot_chests", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/stronghold_library", 0.65f);
        addItemDrop("diamond_upgrade_from_loot_mansion", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/woodland_mansion", 0.75f);
        addItemDrop("diamond_upgrade_from_pillager_outpost", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/pillager_outpost", 0.55f);
        addItemDrop("diamond_upgrade_from_villages", ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "minecraft", "chests/village/village_armorer", 0.1f);
    }
}
