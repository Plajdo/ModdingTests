package es.esy.playdotv.modtest.init;

import es.esy.playdotv.modtest.blocks.WallBlock;
import es.esy.playdotv.modtest.blocks.WetWallBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	@ObjectHolder("plajdo:wall")
	public static WallBlock wall;
	
	@ObjectHolder("plajdo:wetwall")
	public static WetWallBlock wetwall;
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		wall.initModel();
		wetwall.initModel();
	}
	
}
