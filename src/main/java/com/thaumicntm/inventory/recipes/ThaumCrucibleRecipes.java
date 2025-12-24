package com.thaumicntm.inventory.recipes;
import com.hbm.items.ModItems;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.config.ConfigRecipes;

public class ThaumCrucibleRecipes {
    //TODO: thaum-side recipes, located in ConfigRecipes for reference, in the thaum config packae
    public static CrucibleRecipe recipeStarMetal;

	public static void registerRecipes(){
		//TODO
        //CrucibleRecipe addCrucibleRecipe(String key, ItemStack result, Object catalyst, AspectList tags)
        recipeStarMetal = ThaumcraftApi.addCrucibleRecipe(
            "STARMETAL",
            new ItemStack(ModItems.ingot_starmetal),
            "ingotSaturnite",
            (new AspectList()).add(Aspect.EXCHANGE,8)
                .add(Aspect.ELDRITCH,8)
                .add(Aspect.METAL,8)
        );

	}
}
