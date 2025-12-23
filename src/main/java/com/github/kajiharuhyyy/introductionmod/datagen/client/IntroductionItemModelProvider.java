package com.github.kajiharuhyyy.introductionmod.datagen.client;

import com.github.kajiharuhyyy.introductionmod.IntroductionMod;
import com.github.kajiharuhyyy.introductionmod.item.IntroductionItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class IntroductionItemModelProvider extends ItemModelProvider {
    public IntroductionItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IntroductionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(IntroductionItems.RAW_ORIHALCON.get());
        basicItem(IntroductionItems.ORIHALCON_INGOT.get());
    }
}
