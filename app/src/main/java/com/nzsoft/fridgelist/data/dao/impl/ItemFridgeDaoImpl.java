package com.nzsoft.fridgelist.data.dao.impl;

import com.nzsoft.fridgelist.data.dao.ItemFridgeDAO;
import com.nzsoft.fridgelist.data.dto.Item;
import com.nzsoft.fridgelist.data.dto.ItemFridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemFridgeDaoImpl implements ItemFridgeDAO{

    public ItemFridge getItemFridgeById(int id) {
        return null;
    }

    public List<ItemFridge> getAllItemsFridge() {
        List<ItemFridge> itemFridgeList = new ArrayList<ItemFridge>();

        String name = "Apple";
        Item item = new Item(name);
        ItemFridge itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        name = "Milk";
        item = new Item(name);
        itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        name = "Eggs";
        item = new Item(name);
        itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        name = "Bread";
        item = new Item(name);
        itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        name = "Hum";
        item = new Item(name);
        itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        name = "Butter";
        item = new Item(name);
        itemFridge = new ItemFridge(item);
        itemFridgeList.add(itemFridge);

        return itemFridgeList;
    }
}
