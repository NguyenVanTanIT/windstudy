package com.example.nguyentan.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayDapter extends BaseAdapter {

    ArrayList<String> data;
    Context context;

    @Override
    public int getCount() {

        return data.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvPrefix = view.findViewById(R.id.txt_prefix);
            viewHolder.tvName = view.findViewById(R.id.txt_Name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        String name = data.get(position);
        viewHolder.tvName.setText(name);
        String prefix = name.valueOf(name.charAt(0));
        viewHolder.tvPrefix.setText(prefix);
        return view;
    }

    // dùng viewholder để tăng hiệu năng
    class ViewHolder {
        TextView tvPrefix;
        TextView tvName;
    }
}
