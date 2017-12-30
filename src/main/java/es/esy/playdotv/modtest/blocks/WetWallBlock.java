package es.esy.playdotv.modtest.blocks;

import java.util.Random;

import es.esy.playdotv.modtest.Reference;
import es.esy.playdotv.modtest.init.ModBlocks;
import es.esy.playdotv.modtest.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WetWallBlock extends Block{
	
	public WetWallBlock() {
		super(Material.CORAL);
		setUnlocalizedName(Reference.MOD_ID + ".wetwall");
		setRegistryName("wetwall");
		setCreativeTab(ModTabs.tabPlajdo);
		setHardness(3f);
		setResistance(3f);
		setSoundType(SoundType.SLIME);
		setHarvestLevel("shovel", 0);
		setTickRandomly(true);
		}
	
	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos){
		return true;
	}
	
	@Override
	public int quantityDropped(Random random){
		return 0;
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random){
		if(random.nextBoolean()){
			worldIn.setBlockState(pos, ModBlocks.wall.getDefaultState());
			
		}
		
	}
	
}
