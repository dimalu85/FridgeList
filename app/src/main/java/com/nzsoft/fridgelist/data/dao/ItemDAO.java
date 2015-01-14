package com.nzsoft.fridgelist.data.dao;

import com.nzsoft.fridgelist.data.dto.Item;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public interface ItemDAO {
    public Item getItemById (int id);
    public List<Item> getAllItems();
}
