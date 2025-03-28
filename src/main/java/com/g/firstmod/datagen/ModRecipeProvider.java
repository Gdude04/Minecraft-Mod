package com.g.firstmod.datagen;

import com.g.firstmod.block.ModBlocks;
import com.g.firstmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List <ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE,ModBlocks.DEEPSLATE_RUBY_ORE,ModBlocks.NETHER_RUBY_ORE,ModBlocks.END_STONE_RUBY_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC,ModItems.RUBY,
                0.7f,200, "ruby");

        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC,ModItems.RUBY,
                0.7f,150, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY,RecipeCategory.DECORATIONS
        ,ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.RAW_RUBY, 3)
                .pattern("  S")
                .pattern(" R ")
                .pattern("S  ")
                .input('S', Items.STONE)
                .input('R',ModItems.RUBY)
                .criterion(hasItem(Items.STONE),conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_RUBY)));



    }
}
