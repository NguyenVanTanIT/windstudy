package com.example.nguyentan.recyclerview.Recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nguyentan.recyclerview.Conversation;
import com.example.nguyentan.recyclerview.R;

import java.util.ArrayList;

public class RecyclerViewctivity extends AppCompatActivity {
    RecyclerView rvStudent;
    ArrayList<Student>arrayConversation= new ArrayList();
    RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        init();
        preparData();

        //cần thêm layoutManager
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
//        rvStudent.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,true);
        rvStudent.setLayoutManager(gridLayoutManager);

        // Adapter giống listview
        recyclerViewAdapter.dataStudent=arrayConversation;
        recyclerViewAdapter.context= this;
        rvStudent.setAdapter(recyclerViewAdapter);
    }

    private void preparData() {
        for (int i = 0; i < 200 ; i++) {
            Student student = new Student("SV"+i,22,"address"+i);
                 arrayConversation.add(student);
        }
    }

    private void init() {
        rvStudent=findViewById(R.id.rc_student);
    }
}
