package com.chow.AE.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.chow.AE.AE;

public class BlockRegistry {
    public static final Block EXAMPLE_BLOCK = new Block(
        FabricBlockSettings.create()
            .mapColor(MapColor.IRON_GRAY)
            .strength(4.0f)
    );

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(AE.MOD_ID, "example_block"), EXAMPLE_BLOCK);
        System.out.println("[AE] Blocks registered.");
    }
}