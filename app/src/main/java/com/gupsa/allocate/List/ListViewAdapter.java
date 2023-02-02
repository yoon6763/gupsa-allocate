package com.gupsa.allocate.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gupsa.allocate.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private TextView titleTextView;
    private TextView contentTextView;

    private ArrayList<Listviewitem> listviewitemArrayList = new ArrayList<Listviewitem>();

    public ListViewAdapter(){

    }
    @Override
    public int getCount() {
        return listviewitemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewitemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos=position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_listviewitem, parent, false);
        }

        titleTextView = (TextView) convertView.findViewById(R.id.title);
        contentTextView = (TextView) convertView.findViewById(R.id.address);

        Listviewitem listviewitem=listviewitemArrayList.get(position);

        titleTextView.setText(listviewitem.getTitle());
        contentTextView.setText(listviewitem.getContent());
        return convertView;
    }

    public void addItem(String title, String content){
        Listviewitem item = new Listviewitem();

        item.setTitle(title);
        item.setContent(content);

        listviewitemArrayList.add(item);
    }
}
