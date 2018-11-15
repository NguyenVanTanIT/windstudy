package com.example.nguyentan.aclass.baiTapVeNhaBuoi4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.nguyentan.aclass.R;

public class oncheckhedchanged extends AppCompatActivity {
    EditText txt1, txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oncheckhedchanged);
        init();
    }

    private void init() {
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);

    }
}
