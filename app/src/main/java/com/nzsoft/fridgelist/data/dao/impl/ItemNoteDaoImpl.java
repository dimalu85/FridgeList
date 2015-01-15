package com.nzsoft.fridgelist.data.dao.impl;

import com.nzsoft.fridgelist.data.dao.ItemNoteDAO;
import com.nzsoft.fridgelist.data.dto.Item;
import com.nzsoft.fridgelist.data.dto.ItemNote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemNoteDaoImpl implements ItemNoteDAO {

    public ItemNote getItemNoteById(int id) {
        return null;
    }

    public List<ItemNote> getAllItemsNote() {
        List<ItemNote> itemNoteList = new ArrayList<ItemNote>();

        String name = "Яблоки";
        String comment = "зеленые";
        Item item = new Item(name);
        ItemNote itemNote = new ItemNote(item, 3, comment);
        itemNoteList.add(itemNote);

        name = "Молоко";
        comment = "жир 3,5%";
        item = new Item(name);
        itemNote = new ItemNote(item, 2, comment);
        itemNoteList.add(itemNote);

        name = "Яйца";
        item = new Item(name);
        itemNote = new ItemNote(item, 10);
        itemNoteList.add(itemNote);

        name = "Масло сливочное";
        comment = "губернское";
        item = new Item(name);
        itemNote = new ItemNote(item, 2, comment);
        itemNoteList.add(itemNote);

        return itemNoteList;
    }
}
