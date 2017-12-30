package es.esy.playdotv.modtest.blocks;

import es.esy.playdotv.modtest.Reference;
import es.esy.playdotv.modtest.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WallBlock extends Block{
	
	public WallBlock(){
		super(Material.ROCK);
		setUnlocalizedName(Reference.MOD_ID + ".wall");
		setRegistryName("wall");
		setCreativeTab(ModTabs.tabPlajdo);
		setHardness(1.5f);
		setResistance(8.0f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
}
