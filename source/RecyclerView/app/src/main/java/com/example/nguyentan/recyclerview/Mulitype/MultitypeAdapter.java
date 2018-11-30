package com.example.nguyentan.recyclerview.Mulitype;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentan.recyclerview.R;
import com.example.nguyentan.recyclerview.Recyclerview.Student;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan on 11/28/2018.
 */

public class MultitypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Object> arrData;
    Context context;


    @Override
    public int getItemViewType(int position) {
    // nếu mà đấy là tring trả về 0
        if (arrData.get(position) instanceof  String) {
            return 0;
        }
        // nếu là đối tượng thì trả về 1
        else {
            return 1;
        }



    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType ==1){
            View view= LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            return new StudentViewHolder(view);
        }
        else {
            View view= LayoutInflater.from(context).inflate(R.layout.item_multitpye, parent, false);
            return new HeaderViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       if (arrData.get(position) instanceof  String ){
           ((HeaderViewHolder)holder).textHeader.setText((String)arrData.get(position));

       }else {
           Student student = (Student) arrData.get(position);
           ((StudentViewHolder)holder).txtName.setText(student.getNameStudent());
       }
    }

    @Override
    public int getItemCount() {
        return arrData.size();
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView textHeader;
        public HeaderViewHolder(View itemView) {
            super(itemView);
            textHeader=itemView.findViewById(R.id.tv_time);
        }
    }
    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        public StudentViewHolder(View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txt_Name);
        }
    }

}
