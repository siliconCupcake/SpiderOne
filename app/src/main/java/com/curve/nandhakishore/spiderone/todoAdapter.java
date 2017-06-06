package com.curve.nandhakishore.spiderone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Nandha Kishore on 05-06-2017.
 */

public class todoAdapter  extends  BaseAdapter {

    ArrayList<String> dataset;
    Context context;

    public todoAdapter(Context c, ArrayList<String> d) {
        context = c;
        dataset = d;
    }

    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int i) {
        return dataset.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_layout, viewGroup, false);
        }

        TextView list_item = (TextView) view.findViewById(R.id.item_name);
        list_item.setText("  " + dataset.get(i));
        TextView list_pos = (TextView) view.findViewById(R.id.item_position);
        list_pos.setText("  Position " + Integer.toString(i+1));
        return view;
    }

}