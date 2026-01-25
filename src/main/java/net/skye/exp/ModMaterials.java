package net.skye.exp;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Tool;
/*
* 	public static final ToolMaterial IRON = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, ItemTags.IRON_TOOL_MATERIALS);
	public static final ToolMaterial DIAMOND = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);
*
*/
public class ModMaterials {
    public static final TagKey<Item> RUBY_TOOL_MATERIALS = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "ruby_tool_materials"));
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "emerald_tool_materials"));
    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, "sapphire_tool_materials"));

    public static final ToolMaterial RUBY_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            355,
            7.0F,
            2.0f,
            12,
            RUBY_TOOL_MATERIALS
    );

    public static final ToolMaterial EMERALD_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1248,
            7.0F,
            2.0f,
            15,
            EMERALD_TOOL_MATERIALS
    );

    public static final ToolMaterial SAPPHIRE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2031,  
            9.0F,
            3.5f,
            8,
            SAPPHIRE_TOOL_MATERIALS
    );
}
