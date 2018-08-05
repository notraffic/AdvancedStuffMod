package libroru.morestuff.init;

import java.util.ArrayList;
import java.util.List;
import libroru.morestuff.items.ItemBase;
import libroru.morestuff.items.tools.ToolAxe;
import libroru.morestuff.items.tools.ToolHoe;
import libroru.morestuff.items.tools.ToolPickaxe;
import libroru.morestuff.items.tools.ToolSpade;
import libroru.morestuff.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Mats
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT = EnumHelper.addToolMaterial("material_obsidian_ingot", 3, 3122, 10.0F, 6.0F, 10);
	
	//Items
	public static final Item STONESTICK = new ItemBase("stone_stick");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

	
	//Tools
	public static final ItemSword OBSIDIA_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN_INGOT);
}