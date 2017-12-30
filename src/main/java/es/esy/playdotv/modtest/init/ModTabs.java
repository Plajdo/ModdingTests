package es.esy.playdotv.modtest.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {
	
	public static final CreativeTabs tabPlajdo = new CreativeTabs("plajdo"){
		@Override
		public ItemStack getTabIconItem(){
			return new ItemStack(ModItems.plajdo);
		}
	};
	
}
