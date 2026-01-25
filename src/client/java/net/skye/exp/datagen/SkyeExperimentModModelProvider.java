package net.skye.exp.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.skye.exp.ModBlocks;
import net.skye.exp.ModItems;
import org.jspecify.annotations.NonNull;

public class SkyeExperimentModModelProvider extends FabricModelProvider {

    public SkyeExperimentModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.CONDENSED_DIRT);
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE);

        blockModelGenerators.createLantern(ModBlocks.PAPER_LANTERN);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SUSPICIOUS_SUBSTANCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    @Override
    public @NonNull String getName(){
        return "SkyeExperimentModModelProvider";
    }
}
