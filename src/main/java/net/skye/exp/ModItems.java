package net.skye.exp;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = register("suspicious_substance", Item::new, new Item.Properties());

    public static final Item RUBY = register("ruby", Item::new, new Item.Properties());

    public static final Item RUBY_PICKAXE = register("ruby_pickaxe", Item::new, new Item.Properties().pickaxe(ModMaterials.RUBY_TOOL_MATERIAL, 4.0f, -2.8f));
    public static final Item RUBY_AXE = register("ruby_axe", Item::new, new Item.Properties().axe(ModMaterials.RUBY_TOOL_MATERIAL, 6.0f, -3.2f));
    public static final Item RUBY_SHOVEL = register("ruby_shovel", Item::new, new Item.Properties().shovel(ModMaterials.RUBY_TOOL_MATERIAL, 1.5f, -3.0f));
    public static final Item RUBY_SWORD = register("ruby_sword", Item::new, new Item.Properties().sword(ModMaterials.RUBY_TOOL_MATERIAL, 3.0f, -2.4f));
    public static final Item RUBY_HOE = register("ruby_hoe", Item::new, new Item.Properties().hoe(ModMaterials.RUBY_TOOL_MATERIAL, -3.0f, 0.0f));

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.SUSPICIOUS_SUBSTANCE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.RUBY));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> {
                    itemGroup.accept(ModItems.RUBY_PICKAXE);
                    itemGroup.accept(ModItems.RUBY_AXE);
                    itemGroup.accept(ModItems.RUBY_SHOVEL);
                    itemGroup.accept(ModItems.RUBY_SWORD);
                    itemGroup.accept(ModItems.RUBY_HOE);
                });
    }

    public static <GenericItem extends Item> GenericItem register (String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings){
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SkyeExperimentMod.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
}
