package com.nzsoft.fridgelist.data.service.impl;

import com.nzsoft.fridgelist.data.dao.ItemNoteDAO;
import com.nzsoft.fridgelist.data.dao.impl.ItemNoteDaoImpl;
import com.nzsoft.fridgelist.data.dto.ItemNote;
import com.nzsoft.fridgelist.data.service.ItemNoteService;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemNoteServiceImpl implements ItemNoteService {

    private ItemNoteDAO itemNoteDAO;

    public ItemNoteServiceImpl() {
        this.itemNoteDAO = new ItemNoteDaoImpl();
    }

    public ItemNote getItemNoteById(int id) {
        return itemNoteDAO.getItemNoteById(id);
    }

    public List<ItemNote> getAllItemsNote() {
        return itemNoteDAO.getAllItemsNote();
    }
}
