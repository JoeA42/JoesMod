package com.JoeA42.joes.mod;

import com.JoeA42.joes.mod.registry.ModBlocks;
import com.JoeA42.joes.mod.registry.ModItems;
import com.JoeA42.joes.mod.registry.ModLootTables;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

/**
 * This is the main class from where the mod is launched from
 */
public class JoesMod implements ModInitializer {

    /**
     * This is the mod ID used as an identifier throughout the mod
     */
    public static final String MOD_ID = "joesmod";

    /**
     * Main item group of the mod, it will be showed as a creative tab
     */
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.RUBY));

    /**
     * This is an example of a secondary item group, with specific items
     */
    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "other"))
            .icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(new ItemStack(Items.GOLDEN_LEGGINGS));
            })
            .build();

    /**
     * Main method that initializes the mod
     */
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModLootTables.modifyLootTables();
    }
}
