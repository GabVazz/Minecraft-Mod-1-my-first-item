package com.gab.myfirstitem.item;

import com.gab.myfirstitem.MyFirstItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //definisco un oggetto item e lo chiamo rubino
    //gli dico anche in che sezione degli items del gioco inserirlo
    public static final Item RUBINO = registraItem("rubino", new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.MISC)));

    //lo registro qui dentro
    private static Item registraItem(String nome, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MyFirstItem.MOD_ID, nome), item);
    }

    //registra tutti gli item definiti sopra in game
    public static void registraModItems() {
        System.out.println("Sto registrando i mod items per il seguente ID: " + MyFirstItem.MOD_ID);
    }
}
