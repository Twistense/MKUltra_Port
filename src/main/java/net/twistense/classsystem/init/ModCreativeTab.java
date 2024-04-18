package net.twistense.classsystem.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.twistense.classsystem.ClassSystem.MOD_ID;

public class ModCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("class_system_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.class_system"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.SUN_ICON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SUN_ICON.get());
                output.accept(ModItems.MOON_ICON.get());
                output.accept(ModItems.DIAMOND_DUST.get());
                output.accept(ModItems.DESPERATE_ICON.get());

                output.accept(ModBlocks.CLASS_SELECTION_TABLE.get());
            }).build());
}
