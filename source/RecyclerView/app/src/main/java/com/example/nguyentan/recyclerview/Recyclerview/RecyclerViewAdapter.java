package com.example.nguyentan.recyclerview.Recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentan.recyclerview.R;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan on 11/28/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.StudentViewHolder> {

    ArrayList<Student> dataStudent;
    Context context;

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        StudentViewHolder studentViewHolder= new StudentViewHolder(view);
        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student student = dataStudent.get(position);
        holder.txtName.setText(student.getNameStudent());
//        holder.txtViewAddress.setText(""+student.getPhone());
//        holder.txtViewAddress.setText(student.getAddressStudent());

    }

    @Override
    public int getItemCount() {
        return dataStudent.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtViewPhone,txtViewAddress;

        public StudentViewHolder(View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txt_Name);
//            txtViewPhone=itemView.findViewById(R.id.txt_view_phone);
//            txtViewAddress=itemView.findViewById(R.id.txt_view_address);

        }
    }

}
