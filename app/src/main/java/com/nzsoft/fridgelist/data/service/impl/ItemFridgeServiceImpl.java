package com.nzsoft.fridgelist.data.service.impl;

import com.nzsoft.fridgelist.data.dao.ItemFridgeDAO;
import com.nzsoft.fridgelist.data.dao.impl.ItemFridgeDaoImpl;
import com.nzsoft.fridgelist.data.dto.ItemFridge;
import com.nzsoft.fridgelist.data.service.ItemFridgeService;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemFridgeServiceImpl implements ItemFridgeService {
    private ItemFridgeDAO itemFridgeDAO;

    public ItemFridgeServiceImpl() {
        this.itemFridgeDAO = new ItemFridgeDaoImpl();
    }

    public ItemFridge getItemFridgeById(int id) {
        return itemFridgeDAO.getItemFridgeById(id);
    }


    public List<ItemFridge> getAllItemsFridge() {
        return itemFridgeDAO.getAllItemsFridge();
    }
}
