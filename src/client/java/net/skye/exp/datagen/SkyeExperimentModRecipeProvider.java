package net.skye.exp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.skye.exp.ModItems;

import java.util.concurrent.CompletableFuture;

public class SkyeExperimentModRecipeProvider extends FabricRecipeProvider {
    public SkyeExperimentModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return "SkyeExperimentModRecipeProvider";
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                // Ruby Pickaxe
                shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE)
                        .pattern("RRR")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', ModItems.RUBY)
                        .define('S', Items.STICK)
                        .unlockedBy("has_ruby", has(ModItems.RUBY))
                        .save(exporter);

                // Ruby Axe
                shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE)
                        .pattern("RR ")
                        .pattern("RS ")
                        .pattern(" S ")
                        .define('R', ModItems.RUBY)
                        .define('S', Items.STICK)
                        .unlockedBy("has_ruby", has(ModItems.RUBY))
                        .save(exporter);

                // Ruby Shovel
                shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL)
                        .pattern(" R ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', ModItems.RUBY)
                        .define('S', Items.STICK)
                        .unlockedBy("has_ruby", has(ModItems.RUBY))
                        .save(exporter);

                // Ruby Sword
                shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD)
                        .pattern(" R ")
                        .pattern(" R ")
                        .pattern(" S ")
                        .define('R', ModItems.RUBY)
                        .define('S', Items.STICK)
                        .unlockedBy("has_ruby", has(ModItems.RUBY))
                        .save(exporter);

                // Ruby Hoe
                shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE)
                        .pattern("RR ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('R', ModItems.RUBY)
                        .define('S', Items.STICK)
                        .unlockedBy("has_ruby", has(ModItems.RUBY))
                        .save(exporter);
            }
            
        };
    }
}
