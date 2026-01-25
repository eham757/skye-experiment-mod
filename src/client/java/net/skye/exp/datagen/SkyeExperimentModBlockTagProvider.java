package net.skye.exp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.skye.exp.SkyeExperimentMod;

import java.util.concurrent.CompletableFuture;

public class SkyeExperimentModBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public SkyeExperimentModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        // Add blocks that require a diamond tool
        getOrCreateRawBuilder(BlockTags.NEEDS_IRON_TOOL)
                .addElement(Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "ruby_ore"))
                .addElement(Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "deepslate_ruby_ore"));

        // Add blocks mineable with pickaxe
        getOrCreateRawBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .addElement(Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "ruby_ore"))
                .addElement(Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "deepslate_ruby_ore"))
                .addElement(Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "ruby_block"));
    }
}
