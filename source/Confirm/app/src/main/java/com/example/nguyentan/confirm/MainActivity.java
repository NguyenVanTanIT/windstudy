package com.example.nguyentan.confirm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText edit_1,edit_2,edit_3,edit_4,edit_5,edit_6;
    View btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit_1=findViewById(R.id.edit_1);
        edit_2=findViewById(R.id.edit_2);
        edit_3=findViewById(R.id.edit_3);
        edit_4=findViewById(R.id.edit_4);
        edit_5=findViewById(R.id.edit_5);
        edit_6=findViewById(R.id.edit_6);
        edit_1.addTextChangedListener(this);
        edit_2.addTextChangedListener(this);
        edit_3.addTextChangedListener(this);
        edit_4.addTextChangedListener(this);
        edit_5.addTextChangedListener(this);
        edit_6.addTextChangedListener(this);
        btnConfirm=findViewById(R.id.btn_conFirm);


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
     if (edit_1.getText().toString().length()>0){
         edit_2.requestFocus();
     }
     if (edit_2.getText().toString().length()>0){
         edit_3.requestFocus();
     }
     if (edit_3.getText().toString().length()>0){
         edit_4.requestFocus();
     }
     if (edit_4.getText().toString().length()>0){
         edit_5.requestFocus();
     }
     if (edit_5.getText().toString().length()>0){
         edit_6.requestFocus();
     }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
