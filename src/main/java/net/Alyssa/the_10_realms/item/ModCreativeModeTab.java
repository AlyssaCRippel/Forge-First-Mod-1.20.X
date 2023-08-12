package net.Alyssa.the_10_realms.item;

import net.Alyssa.the_10_realms.TheTenRealmsMod;
import net.Alyssa.the_10_realms.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheTenRealmsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THE_TEN_REALMS = CREATE_MODE_TAB.register("the_10_realms_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.the_10_realms_tab"))
                    .displayItems((displayParameters, output) -> {

                        //items
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        //blocks
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                    } ).build());

    public static void register(IEventBus eventBus){
        CREATE_MODE_TAB.register(eventBus);
    }
}
