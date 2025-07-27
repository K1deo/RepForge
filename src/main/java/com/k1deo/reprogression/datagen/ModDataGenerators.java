package com.k1deo.reprogression.datagen;

import net.minecraftforge.data.event.GatherDataEvent;

public class ModDataGenerators {
    public static void gatherData(GatherDataEvent event){
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModGlobalLootModifiersProvider(output, event.getExistingFileHelper().toString()));

    }
}
