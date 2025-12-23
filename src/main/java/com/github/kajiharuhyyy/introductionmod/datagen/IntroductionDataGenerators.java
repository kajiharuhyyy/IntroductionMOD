package com.github.kajiharuhyyy.introductionmod.datagen;

import com.github.kajiharuhyyy.introductionmod.IntroductionMod;
import com.github.kajiharuhyyy.introductionmod.datagen.client.ENUSLanguageProvider;
import com.github.kajiharuhyyy.introductionmod.datagen.client.IntroductionBlockStateProvider;
import com.github.kajiharuhyyy.introductionmod.datagen.client.IntroductionItemModelProvider;
import com.github.kajiharuhyyy.introductionmod.datagen.client.JAJPLanguageProvider;
import com.github.kajiharuhyyy.introductionmod.datagen.server.IntroductionRecipeProvider;
import com.github.kajiharuhyyy.introductionmod.datagen.server.loot.IntroductionLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IntroductionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntroductionDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(),
                new IntroductionItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeClient(),
                new IntroductionBlockStateProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));
        generator.addProvider(event.includeServer(), new IntroductionRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), IntroductionLootTables.create(packOutput));
    }
}
