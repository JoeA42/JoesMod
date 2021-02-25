package com.JoeA42.joes.mod.registry;

import com.JoeA42.joes.mod.JoesMod;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetContentsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;

public class ModLootTables  {

    private static final Identifier EMERALD_ORE_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/emerald_ore");
    private static final Identifier RUBY_BLOCK_LOOT_TABLE_ID = new Identifier(JoesMod.MOD_ID, "blocks/ruby_block");

    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register((((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) ->{
            //checks for emerald ore loot table
            if(EMERALD_ORE_LOOT_TABLE_ID.equals(identifier)){

                //Add single individual item
                FabricLootPoolBuilder emeraldPoolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(ItemEntry.builder(Items.GOLD_NUGGET))
                        .withFunction(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f,4.0f)).build());
                fabricLootSupplierBuilder.withPool(emeraldPoolBuilder.build());

                //Add custom loot table
                FabricLootPoolBuilder rubyPoolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(RUBY_BLOCK_LOOT_TABLE_ID));
                fabricLootSupplierBuilder.withPool(rubyPoolBuilder.build());

            }
        } )));
    }
}
