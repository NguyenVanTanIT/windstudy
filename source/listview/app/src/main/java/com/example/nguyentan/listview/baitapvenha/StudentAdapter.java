package com.example.nguyentan.listview.baitapvenha;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;


public class StudentAdapter extends BaseAdapter{
    ArrayList<Student> arrayinformation;
    Context context;
    int resource;

    public StudentAdapter(Context context, int activity_baitapvenha, ArrayList<Student> arrayStudent) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_student, parent, false);
            viewHolder= new ViewHolder();
            viewHolder.txtViewName=convertView.findViewById(R.id.txt_view_name);
            viewHolder.txtViewPhone=convertView.findViewById(R.id.txt_view_phone);
            viewHolder.txtViewAddress=convertView.findViewById(R.id.txt_view_address);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        
        Student information= this.arrayinformation.get(position);

        viewHolder.txtViewName.setText("UserName :" +information.getNameStudent());
        viewHolder.txtViewPhone.setText("Phone Number: "+information.getPhone());
        viewHolder.txtViewAddress.setText("Address :"+information.getAddressStudent());
        return convertView;
    }
    

    class ViewHolder{
        TextView txtViewName,txtViewPhone,txtViewAddress;

    }

}
