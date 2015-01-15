package com.nzsoft.fridgelist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nzsoft.fridgelist.R;
import com.nzsoft.fridgelist.data.dto.ItemFridge;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemFridgeAdapter extends BaseAdapter {

    private List<ItemFridge> itemFridgeList;
    private LayoutInflater layoutInflater;

    public ItemFridgeAdapter(Context context, List<ItemFridge> itemFridgeList) {
        this.itemFridgeList = itemFridgeList;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemFridgeList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemFridgeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        ItemFridge itemFridge = itemFridgeList.get(position);
        return itemFridge.getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.itemfridge_layout, parent, false);
        }

        ItemFridge itemFridge = (ItemFridge) getItem(position);

        TextView itemFridgeNameView = (TextView) view.findViewById(R.id.itemFridgeName);
        itemFridgeNameView.setText(itemFridge.toString());

        TextView itemFridgeCountView = (TextView) view.findViewById(R.id.itemFridgeCount);
        itemFridgeCountView.setText(Double.toString(itemFridge.getCount()));


        return view;
    }
}
