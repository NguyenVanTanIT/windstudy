package com.example.nguyentan.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtIpnutName, txtInputAge,txtInputAdress;
    Button btnLogin;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIpnutName=findViewById(R.id.txtInputName);
        txtInputAge=findViewById(R.id.txtInputAge);
        txtInputAdress=findViewById(R.id.txtInputAdress);
        txtView=findViewById(R.id.txtView);

        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {






            }
        });

    }
}
