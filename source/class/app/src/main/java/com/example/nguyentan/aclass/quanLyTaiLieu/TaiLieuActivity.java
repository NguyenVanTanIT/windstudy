package com.example.nguyentan.aclass.quanLyTaiLieu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nguyentan.aclass.R;

public class TaiLieuActivity extends AppCompatActivity {

    EditText txtID, txtProducer, txtCount;
    TextView txtShow;
    Button btnSave;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.quanlysach);
      init();

    }

    public void init() {
        txtID=findViewById(R.id.txtMaTaiTieu);
        txtProducer=findViewById(R.id.txtNhaXuatBan);
        txtCount=findViewById(R.id.txtInputsoBan);
        txtShow=findViewById(R.id.txtShow);
        btnSave=findViewById(R.id.btnLogin);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TaiLieu taiLieu= new TaiLieu();
                taiLieu.maTaiLieu= txtID.getText().toString();
                taiLieu.NhaXuatBan=txtProducer.getText().toString();
                taiLieu.soBanPhatHanh=Integer.parseInt(txtCount.getText().toString());



            }
        });
    }


}
