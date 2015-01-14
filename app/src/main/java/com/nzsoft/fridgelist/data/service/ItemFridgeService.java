package com.nzsoft.fridgelist.data.service;

import com.nzsoft.fridgelist.data.dto.ItemFridge;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public interface ItemFridgeService {
    public ItemFridge getItemFridgeById(int id);
    public List<ItemFridge> getAllItemsFridge();
}
