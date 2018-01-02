package es.esy.playdotv.modtest.init;

import es.esy.playdotv.modtest.items.CementItem;
import es.esy.playdotv.modtest.items.EnchantedGoldItem;
import es.esy.playdotv.modtest.items.PlajdoItem;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	@ObjectHolder("plajdo:cement")
	public static CementItem cement;
	
	@ObjectHolder("plajdo:plajdo")
	public static PlajdoItem plajdo;
	
	@ObjectHolder("plajdo:enchantedgold")
	public static EnchantedGoldItem enchantedgold;
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		cement.initModel();
		plajdo.initModel();
		enchantedgold.initModel();
		
	}
	
}
