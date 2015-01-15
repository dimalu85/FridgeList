package com.nzsoft.fridgelist.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nzsoft.fridgelist.R;
import com.nzsoft.fridgelist.adapter.ItemNoteAdapter;
import com.nzsoft.fridgelist.data.dto.ItemNote;
import com.nzsoft.fridgelist.data.service.ItemNoteService;
import com.nzsoft.fridgelist.data.service.impl.ItemNoteServiceImpl;

import java.util.List;

/**
 * Created by Малусевич on 15.01.2015.
 */
public class NoteListFragment extends Fragment {
    public static final String TAG = "NoteListFragment";
    private ListView itemNoteListView;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.notelist_fragment, null);

        itemNoteListView = (ListView) rootView.findViewById(R.id.itemNoteListView);

        ItemNoteService itemNoteService = new ItemNoteServiceImpl();

        List<ItemNote> itemNoteList = itemNoteService.getAllItemsNote();

        ItemNoteAdapter itemNoteAdapter = new ItemNoteAdapter(getActivity().getApplicationContext(), itemNoteList);

        itemNoteListView.setAdapter(itemNoteAdapter);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
