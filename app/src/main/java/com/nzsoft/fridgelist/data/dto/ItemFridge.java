package com.nzsoft.fridgelist.data.dto;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemFridge extends ItemListObject {
    public ItemFridge(int id, Item item, double count) {
        super(id, item, count);
    }

    public ItemFridge(Item item, double count) {
        super(item, count);
    }

    public ItemFridge(Item item) {
        super(item);
    }
}
