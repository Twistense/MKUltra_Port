package net.twistense.classsystem.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.twistense.classsystem.ClassSystem.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredBlock<Block> CLASS_SELECTION_TABLE = BLOCKS.registerSimpleBlock("class_selection_table", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> CLASS_TABLE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("class_table", CLASS_SELECTION_TABLE);
}
