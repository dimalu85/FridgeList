package com.nzsoft.fridgelist.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nzsoft.fridgelist.R;
import com.nzsoft.fridgelist.adapter.ItemFridgeAdapter;
import com.nzsoft.fridgelist.data.dto.ItemFridge;
import com.nzsoft.fridgelist.data.service.ItemFridgeService;
import com.nzsoft.fridgelist.data.service.impl.ItemFridgeServiceImpl;

import java.util.List;

/**
 * Created by Малусевич on 15.01.2015.
 */
public class FridgeListFragment extends Fragment{
    public static final String TAG = "FridgeListFragment";
    private ListView itemFridgeListView;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fridgelist_fragment, null);

        itemFridgeListView = (ListView) rootView.findViewById(R.id.itemFridgeListView);

        ItemFridgeService itemFridgeService = new ItemFridgeServiceImpl();

        List<ItemFridge> itemFridgeList = itemFridgeService.getAllItemsFridge();

        ItemFridgeAdapter itemFridgeAdapter = new ItemFridgeAdapter(getActivity().getApplicationContext(), itemFridgeList);

        itemFridgeListView.setAdapter(itemFridgeAdapter);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
