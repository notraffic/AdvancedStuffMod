package libroru.morestuff.items.tools;

import libroru.morestuff.Main;
import libroru.morestuff.init.ModItems;
import libroru.morestuff.util.IHasModel;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe implements IHasModel {
	
	public EmeraldHoe(String name, ToolMaterial material)
	{
		super(material);
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
