package es.esy.playdotv.modtest.items;

import es.esy.playdotv.modtest.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PlajdoItem extends Item{
	
	public PlajdoItem() {
		setUnlocalizedName(Reference.MOD_ID + ".plajdo");
		setRegistryName("plajdo");
		setCreativeTab(null);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}
