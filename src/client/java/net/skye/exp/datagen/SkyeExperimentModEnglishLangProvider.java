package net.skye.exp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.skye.exp.ModBlocks;
import net.skye.exp.ModItems;

import java.util.concurrent.CompletableFuture;

public class SkyeExperimentModEnglishLangProvider extends FabricLanguageProvider {
    protected SkyeExperimentModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us" ,registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        // Items
        translationBuilder.add(ModItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ModItems.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ModItems.RUBY_HOE, "Ruby Hoe");

        // Blocks
        translationBuilder.add(ModBlocks.CONDENSED_DIRT, "Condensed Dirt");
        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Block of Ruby");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");

        translationBuilder.add(ModBlocks.PAPER_LANTERN, "Paper Lantern");

    }
}
