package com.example.nguyentan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrName= new ArrayList<>();
    ListView LV_DS003;
    ArrayDapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareData();
        init();

        arrayAdapter= new ArrayDapter(getBaseContext(),R.layout.activity_main,arrName);
//        arrayAdapter.data=arrName;
//        arrayAdapter.context=this;
        LV_DS003.setAdapter(arrayAdapter);

    }
    void init(){
        LV_DS003=findViewById(R.id.lv_Ds003);
    }



    void prepareData(){
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
    }
}
