package com.g.firstmod;

import com.g.firstmod.block.ModBlocks;
import com.g.firstmod.item.ModItemGroups;
import com.g.firstmod.item.ModItems;
import com.g.firstmod.sound.ModSounds;
import com.g.firstmod.util.ModCustomTrades;
import com.g.firstmod.util.ModLootTableModifiers;
import com.g.firstmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();

		ModSounds.registerSounds();

		FuelRegistry.INSTANCE.add(ModItems.FASTER_COAL, 3000);

	}
}