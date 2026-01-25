package net.skye.exp.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SkyeExperimentModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SkyeExperimentModEnglishLangProvider::new);
        pack.addProvider(SkyeExperimentModModelProvider::new);
        pack.addProvider(SkyeExperimentModRecipeProvider::new);
        pack.addProvider(SkyeExperimentModBlockLootTableProvider::new);
        pack.addProvider(SkyeExperimentModBlockTagProvider::new);
    }
}
