package com.nzsoft.fridgelist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nzsoft.fridgelist.R;
import com.nzsoft.fridgelist.data.dto.ItemNote;

import java.util.List;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemNoteAdapter extends BaseAdapter {

    private List<ItemNote> itemNoteList;
    private LayoutInflater layoutInflater;

    public ItemNoteAdapter(Context context, List<ItemNote> itemNoteList) {
        this.itemNoteList = itemNoteList;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemNoteList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemNoteList.get(position);
    }

    @Override
    public long getItemId(int position) {
        ItemNote itemNote = itemNoteList.get(position);
        return itemNote.getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.itemnote_layout, parent, false);
        }

        ItemNote itemNote = (ItemNote) getItem(position);

        TextView itemNoteNameView = (TextView) view.findViewById(R.id.itemNoteName);
        itemNoteNameView.setText(itemNote.toString());

        TextView itemNoteCountView = (TextView) view.findViewById(R.id.itemNoteCount);
        itemNoteCountView.setText(Double.toString(itemNote.getCount()));

        TextView itemNoteCommentView = (TextView) view.findViewById(R.id.itemNoteComment);
        itemNoteCommentView.setText(itemNote.getComment());


        return view;
    }
}
