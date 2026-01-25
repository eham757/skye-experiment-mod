package net.skye.exp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.skye.exp.ModBlocks;
import net.skye.exp.ModItems;

import java.util.concurrent.CompletableFuture;

public class SkyeExperimentModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public SkyeExperimentModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Simple blocks that drop themselves
        dropSelf(ModBlocks.CONDENSED_DIRT);
        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.PAPER_LANTERN);

        // Ruby Ore - drops ruby item with fortune support
        add(ModBlocks.RUBY_ORE, block ->
                createSilkTouchDispatchTable(
                        block,
                        applyExplosionDecay(
                                block,
                                LootItem.lootTableItem(ModItems.RUBY)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                        .apply(ApplyBonusCount.addOreBonusCount(
                                                registries.lookupOrThrow(Registries.ENCHANTMENT)
                                                        .getOrThrow(net.minecraft.world.item.enchantment.Enchantments.FORTUNE)
                                        ))
                        )
                )
        );

        // Deepslate Ruby Ore - drops ruby item with fortune support
        add(ModBlocks.DEEPSLATE_RUBY_ORE, block ->
                createSilkTouchDispatchTable(
                        block,
                        applyExplosionDecay(
                                block,
                                LootItem.lootTableItem(ModItems.RUBY)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                        .apply(ApplyBonusCount.addOreBonusCount(
                                                registries.lookupOrThrow(Registries.ENCHANTMENT)
                                                        .getOrThrow(net.minecraft.world.item.enchantment.Enchantments.FORTUNE)
                                        ))
                        )
                )
        );
    }
}
