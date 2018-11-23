package com.example.nguyentan.listview.baitapvenha;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;


public class AdapterBTVN extends BaseAdapter{
    ArrayList<information> arrayinformation;
    Context context;
    int resource;

    public AdapterBTVN(Context context, int activity_baitapvenha, ArrayList<information> arrayStudent) {
    this.context =context;
    this.arrayinformation=arrayStudent;
    this.resource=activity_baitapvenha;
    }

    @Override
    public int getCount() {
        return arrayinformation.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayinformation.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if ( convertView ==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_btvn,parent,false);
            viewHolder= new ViewHolder();
            viewHolder.txtViewName=convertView.findViewById(R.id.txt_View_Name);
            viewHolder.txtViewPhone=convertView.findViewById(R.id.txt_View_Phone);
            viewHolder.txtViewAddress=convertView.findViewById(R.id.txt_View_Address);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        
        information  information= this.arrayinformation.get(position);
        viewHolder.txtViewName.setText("UserName :" +information.getNameStudent());
        viewHolder.txtViewPhone.setText("Phone Number: "+information.getPhone());
        viewHolder.txtViewAddress.setText("Address :"+information.getAddressStudent());
        return convertView;
    }
    

    class ViewHolder{
        TextView txtViewName,txtViewPhone,txtViewAddress;

    }

}
