package com.example.nguyentan.listview.baitapvenha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;

public class Main_Activity_Student extends AppCompatActivity {

    EditText txtNamest, txtPhone,txtAddress;
    Button btnSaVe;
    ListView lvSTD;
    ArrayList<Student> arrayStudent= new ArrayList<>();
    AdapterStudent adapterBTVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Student);

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

                Student getinformation =new Student(NameStudent, PhoneStudent, AddressStudent);

             if (getinformation.NameStudent==null){
                 Toast.makeText(getApplicationContext(),"chưa có dữ liệu",Toast.LENGTH_LONG).show();
             }else {

                 arrayStudent.add(getinformation);
                 adapterBTVN = new AdapterStudent(getBaseContext(), R.layout.activity_Student, arrayStudent);
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
