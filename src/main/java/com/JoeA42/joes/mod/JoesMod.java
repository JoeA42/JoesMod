package com.JoeA42.joes.mod;

import com.JoeA42.joes.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class JoesMod implements ModInitializer {

    public static final String MOD_ID = "joesmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
