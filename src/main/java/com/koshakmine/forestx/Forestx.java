package com.koshakmine.forestx;

import com.koshakmine.forestx.blocks.BlackberryBush;
import com.koshakmine.forestx.blocks.BlueberryBush;
import com.koshakmine.forestx.blocks.CranberryBush;
import com.koshakmine.forestx.blocks.RaspberryBush;
import com.koshakmine.forestx.items.BerryItem;
import com.koshakmine.forestx.items.FoodItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Forestx implements ModInitializer {
    static String MOD_ID = "forestx";
    //Items
    public static final Item Berrypie = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()));
    public static final Item Raspberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Blackberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Cranberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Blueberry = new BerryItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).build()));
    public static final Item Salt_cod = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()));
    public static final Item Salt_salmon = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()));
    public static final Item Salt_egg = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()));
    public static final Item Salt_tropical_fish = new FoodItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()));
    public static final Item Salt = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    //Blocks
    public static final RaspberryBush RaspberryBush = new RaspberryBush(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.SWEET_BERRY_BUSH).nonOpaque());
    public static final BlackberryBush BlackberryBush = new BlackberryBush(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.SWEET_BERRY_BUSH).nonOpaque());
    public static final BlueberryBush BlueberryBush = new BlueberryBush(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.SWEET_BERRY_BUSH).nonOpaque());
    public static final CranberryBush CranberryBush = new CranberryBush(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.SWEET_BERRY_BUSH).nonOpaque());
    //Registry
    @Override
    public void onInitialize() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_pie"), Berrypie);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raspberries"), Raspberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blackberries"), Blackberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cranberries"), Cranberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blueberries"), Blueberry);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt"), Salt);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_cod"), Salt_cod);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_salmon"), Salt_salmon);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_egg"), Salt_egg);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_tropical_fish"), Salt_tropical_fish);
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush_raspberry"), RaspberryBush);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush_blackberry"), BlackberryBush);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush_blueberry"), BlueberryBush);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush_cranberry"), CranberryBush);
    }
}
