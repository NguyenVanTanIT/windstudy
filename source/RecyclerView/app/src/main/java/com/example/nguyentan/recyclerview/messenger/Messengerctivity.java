package com.example.nguyentan.recyclerview.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nguyentan.recyclerview.R;

import java.util.ArrayList;
import java.util.Random;

public class Messengerctivity extends AppCompatActivity {
    RecyclerView rcMessenger;
    EditText edtContent;
    Button btnSend;
    ArrayList<Messenger> arrayMessenger= new ArrayList<>();
    MessengerAdapter adapterMessenger= new MessengerAdapter( this,arrayMessenger);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);

        init();
        addEvents();
        prepareData();

    }

    private void addEvents() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareData();
                reset();
                adapterMessenger.notifyDataSetChanged();
            }
        });
    }
    private void prepareData(){
        String content = edtContent.getText().toString();
        Random rd= new Random();
        int going = rd.nextInt(2);
        arrayMessenger.add(0,new Messenger(content,going,""));
        adapterMessenger.notifyDataSetChanged();

    }
     public  void reset(){
         edtContent.setText("");

     }


    private void init() {
        rcMessenger= findViewById(R.id.rv_messenger);
        edtContent=findViewById(R.id.edt_content);
        btnSend=findViewById(R.id.btn_send);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext(),
                                                                          LinearLayoutManager.VERTICAL, true);
        rcMessenger.setLayoutManager(linearLayoutManager);
        rcMessenger.setAdapter(adapterMessenger);
    }
}
