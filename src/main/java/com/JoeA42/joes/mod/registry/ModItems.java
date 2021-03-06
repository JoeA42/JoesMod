package com.JoeA42.joes.mod.registry;

import com.JoeA42.joes.mod.JoesMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

/**
 * This class is used to create and register items
 */
public class ModItems {

    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(JoesMod.ITEM_GROUP));
    public static final Item CANNABIS_SEED = new Item(new Item.Settings().group(JoesMod.ITEM_GROUP));


    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(JoesMod.ITEM_GROUP));
    public static final BlockItem RUBY_ORE_BLOCK = new BlockItem(ModBlocks.RUBY_ORE_BLOCK, new Item.Settings().group(JoesMod.ITEM_GROUP));

    /**
     * This method is in charge of adding items to the register
     */
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(JoesMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(JoesMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(JoesMod.MOD_ID,"ruby_ore_block"), RUBY_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(JoesMod.MOD_ID, "cannabis_seed"), CANNABIS_SEED);
    }
}
