package com.nzsoft.fridgelist.data.dao;

import com.nzsoft.fridgelist.data.dto.ItemNote;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public interface ItemNoteDAO {
    public ItemNote getItemNoteById(int id);
    public List<ItemNote> getAllItemsNote();
}
