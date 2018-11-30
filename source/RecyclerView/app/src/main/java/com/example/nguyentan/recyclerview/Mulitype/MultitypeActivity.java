package com.example.nguyentan.recyclerview.Mulitype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.example.nguyentan.recyclerview.R;
import com.example.nguyentan.recyclerview.Recyclerview.Student;

import java.util.ArrayList;

public class MultitypeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Object> arData = new ArrayList<>();
    MultitypeAdapter adapter = new MultitypeAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitype);

        init();
        preparData();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter.arrData=arData;
        adapter.context=this;
        recyclerView.setAdapter(adapter);
    }

    private void preparData() {
        arData.add("20/11/2018");
        for (int i = 0; i < 10; i++) {
            Student student = new Student("SV"+i, 22, "address"+i);
            arData.add(student);

        }arData.add("28/11/2018");
        for (int i = 0; i < 10; i++) {
            Student student = new Student("SV"+i, 22, "address"+i);
            arData.add(student);

        }
    }

    private void init() {
        recyclerView=findViewById(R.id.rv_multitype);

    }
}
