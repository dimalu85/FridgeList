package com.nzsoft.fridgelist.data.service;

import com.nzsoft.fridgelist.data.dto.ItemNote;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public interface ItemNoteService {
    public ItemNote getItemNoteById(int id);
    public List<ItemNote> getAllItemsNote();
}
