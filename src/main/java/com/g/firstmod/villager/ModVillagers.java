package com.g.firstmod.villager;

import com.g.firstmod.FirstMod;
import com.g.firstmod.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterest;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static  final RegistryKey<PointOfInterestType> SOUND_POI_KEY = poikey("soundpoi");
    public static final PointOfInterestType SOUND_POI = registerpoi("soundpoi", ModBlocks.SOUND_BLOCK);
    public static final VillagerProfession SOUND_MASTER = registerProfession("sound_master", SOUND_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(FirstMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type),
                        entry -> entry.matchesKey(type), ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));


    }

    private static PointOfInterestType registerpoi(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(FirstMod.MOD_ID, name), 1,1,block);
    }

    private static RegistryKey<PointOfInterestType> poikey(String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(FirstMod.MOD_ID,name));
    }

    public static void registerVillagers(){
        FirstMod.LOGGER.info("Registering Villagers" + FirstMod.MOD_ID);

    }
}
