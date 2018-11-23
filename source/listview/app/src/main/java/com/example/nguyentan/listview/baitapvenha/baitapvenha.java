package com.example.nguyentan.listview.baitapvenha;

import android.icu.util.LocaleData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;

public class baitapvenha extends AppCompatActivity {

    EditText txtNamest, txtPhone,txtAddress;
    Button btnSaVe;
    ListView lvSTD;
    ArrayList<information> arrayStudent= new ArrayList<>();
    AdapterBTVN adapterBTVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitapvenha);

        addConTrols();
        addEvents();
    }

    private void addEvents() {
        btnSaVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NameStudent = txtNamest.getText().toString();
                int PhoneStudent = Integer.parseInt(txtPhone.getText().toString());
                String AddressStudent = txtAddress.getText().toString();

                information getinformation =new information(NameStudent,PhoneStudent,AddressStudent);

             if (getinformation.NameStudent==null){
                 Toast.makeText(getApplicationContext(),"chưa có dữ liệu",Toast.LENGTH_LONG).show();
             }else {

                 arrayStudent.add(getinformation);
                 adapterBTVN = new AdapterBTVN(getBaseContext(), R.layout.activity_baitapvenha, arrayStudent);
                 lvSTD.setAdapter(adapterBTVN);
             }
            }
        });


    }


    private void addConTrols() {
         txtNamest=findViewById(R.id.txt_namest);
         txtPhone=findViewById(R.id.txt_Phone);
         txtAddress=findViewById(R.id.txt_address);
         btnSaVe=findViewById(R.id.btn_save);
         lvSTD=findViewById(R.id.lv_DanhSach);

    }
}
