package com.example.nguyentan.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvConversation;
    ArrayList<Conversation> conversations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvConversation = findViewById(R.id.rcv_conversation);
        // đổ dữ liệ cho arrlist
        Conversation conversation1= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation2= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation3= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation4= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation5= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation6= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation7= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation8= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation9= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation10= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation11= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation12= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation13= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation14= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation15= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation16= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation17= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation18= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation19= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation20= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation21= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation22= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation23= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation24= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation25= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation26= new Conversation("nguyễn văn Tân","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation27= new Conversation("nguyễn văn Minh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation28= new Conversation("nguyễn văn Linh","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation29= new Conversation("Nguyễn Thị Trang ","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");
        Conversation conversation30= new Conversation("Nguyễn Thùy Trang","00:00", "HÔM NAY LÀ THỨ 2","CVCVCVCVC");


        conversations.add(conversation1);
        conversations.add(conversation2);
        conversations.add(conversation3);
        conversations.add(conversation4);
        conversations.add(conversation5);
        conversations.add(conversation5);
        conversations.add(conversation6);
        conversations.add(conversation7);
        conversations.add(conversation8);
        conversations.add(conversation9);
        conversations.add(conversation11);
        conversations.add(conversation10);
        conversations.add(conversation12);
        conversations.add(conversation14);
        conversations.add(conversation15);
        conversations.add(conversation21);
        conversations.add(conversation17);
        conversations.add(conversation13);
        conversations.add(conversation18);
        conversations.add(conversation19);
        conversations.add(conversation20);
        conversations.add(conversation22);
        conversations.add(conversation23);
        conversations.add(conversation24);
        conversations.add(conversation25);
        conversations.add(conversation30);
        conversations.add(conversation26);
        conversations.add(conversation27);
        conversations.add(conversation28);
        conversations.add(conversation29);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rcvConversation.setLayoutManager(linearLayoutManager);

        ConversationAdapter conversationAdapter = new ConversationAdapter();
        conversationAdapter.arraylistconversations=conversations;
        conversationAdapter.context = MainActivity.this;
        rcvConversation.setAdapter(conversationAdapter);


    }
}
