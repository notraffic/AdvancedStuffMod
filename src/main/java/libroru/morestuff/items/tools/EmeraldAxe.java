package libroru.morestuff.items.tools;

import libroru.morestuff.Main;
import libroru.morestuff.init.ModItems;
import libroru.morestuff.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldAxe extends ItemAxe implements IHasModel{
	
	public EmeraldAxe(String name, ToolMaterial material)
	{
		super(material, 8.0F, -3.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabMorestuff);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
