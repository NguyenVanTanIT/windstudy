package com.example.nguyentan.listview.people;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan on 11/24/2018.
 */

public class PeopleAdapter extends BaseAdapter {
    Context context;
    int resource;
    ArrayList<People> arrayPeople;


    public PeopleAdapter(Context baseContext, int activity_people, ArrayList<People> arrayPeople) {
        this.context=baseContext;
        this.resource=activity_people;
        this.arrayPeople=arrayPeople;
    }

    @Override
    public int getCount() {
        return arrayPeople.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayPeople.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_people,parent,false);
            viewHolder= new ViewHolder();
            viewHolder.vName=convertView.findViewById(R.id.txt_item_people_name);
            viewHolder.VYearOld=convertView.findViewById(R.id.txt_item_people_year_old);
            viewHolder.vAddress=convertView.findViewById(R.id.txt_item_people_addess);

            convertView.setTag(viewHolder);

        }
        else {
            viewHolder =(ViewHolder) convertView.getTag();
        }

        People people= arrayPeople.get(position);
        viewHolder.vName.setText(people.getNamePeople());
        viewHolder.VYearOld.setText(""+people.getYearOldPeople());
        viewHolder.vAddress.setText(people.getAddressPeople());

        return convertView;
    }

    class ViewHolder{
        TextView vName,VYearOld,vAddress;
    }
}
