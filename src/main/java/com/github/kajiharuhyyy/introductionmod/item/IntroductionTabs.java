package com.github.kajiharuhyyy.introductionmod.item;

import com.github.kajiharuhyyy.introductionmod.IntroductionMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;

public class IntroductionTabs {

    // レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IntroductionMod.MOD_ID);

    // レジストリにタブを登録
}
