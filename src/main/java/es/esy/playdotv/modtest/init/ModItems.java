package es.esy.playdotv.modtest.init;

import es.esy.playdotv.modtest.items.CementItem;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	@ObjectHolder("plajdo:cement")
	public static CementItem cement;
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		cement.initModel();
	}
	
}
