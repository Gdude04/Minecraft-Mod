package com.g.firstmod.util;

import com.g.firstmod.block.ModBlocks;
import com.g.firstmod.item.ModItems;
import com.g.firstmod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.RUBY_HELMET, 1),
                    6, 5,0.05f));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.RUBY_BOOTS, 1),
                    6, 5,0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.RUBY_CHESTPLATE, 1),
                            6, 5,0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.RUBY_LEGGINGS, 1),
                            6, 5,0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 2),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.KNOCKBACK, 4)),
                            6, 9,0.075f));

                });

        TradeOfferHelper.registerWanderingTraderOffers( 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 2),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            6, 9,0.075f));

                });

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORN, 6),
                            new ItemStack(ModItems.RUBY, 1),
                            15, 9,0.05f));

                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORN, 6),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1),
                            15, 9,0.05f));

                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 4),
                            new ItemStack(ModItems.RUBY, 4),
                            15, 9,0.05f));

                });


    }
}
