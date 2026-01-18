package net.skye.exp.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.skye.exp.ModBlocks;
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
    }

//    @Override
//    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        blockStateModelGenerator.createTrivialCube(ModBlocks.CONDENSED_DIRT);
//    }


    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }

    @Override
    public @NonNull String getName(){
        return "SkyeExperimentModModelProvider";
    }
}
