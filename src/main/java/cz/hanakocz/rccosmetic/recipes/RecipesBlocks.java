package cz.hanakocz.rccosmetic.recipes;

import cz.hanakocz.rccosmetic.blocks.BlocksInit;
import cz.hanakocz.rccosmetic.items.ItemsInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipesBlocks 
{
	static ItemStack stone_slab = new ItemStack(Blocks.STONE_SLAB);
	static ItemStack basic_track = new ItemStack(Blocks.RAIL);
	static ItemStack grass = new ItemStack(Blocks.TALLGRASS, 1, 1);
	static ItemStack cobweb = new ItemStack(Blocks.WEB, 1);
	
	public static final void init()
	{
		PlatformCycle();
		Platform();
		Tracks();
		
	}
	
	private static void PlatformCycle()
	{
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksInit.PlatformOuter, 1), BlocksInit.PlatformFull));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksInit.PlatformInner, 1), BlocksInit.PlatformOuter));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksInit.PlatformEdge, 1), BlocksInit.PlatformInner));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksInit.PlatformFull, 1), BlocksInit.PlatformEdge));
	}
	
	private static void Platform()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlocksInit.PlatformFull, 4),
				"xxx",
				"xxx",
				'x', stone_slab));
	}
	
	private static void Tracks()
	{
		GameRegistry.addRecipe(new ItemStack(BlocksInit.TrackGrass),
				" G ",
				" T ",
				'T', basic_track,
				'G', grass);
		GameRegistry.addRecipe(new ItemStack(BlocksInit.TrackCobweb),
				" C ",
				" T ",
				'T', basic_track,
				'C', cobweb);
	}
}
