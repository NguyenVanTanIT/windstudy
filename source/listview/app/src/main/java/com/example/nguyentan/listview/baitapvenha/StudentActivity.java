package com.example.nguyentan.listview.baitapvenha;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.example.nguyentan.listview.R;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    EditText txtNamest, txtPhone, txtAddress;
    Button btnSaVe, btnUpDate, btnDelete;
    ListView lvSTD;
    ArrayList<Student> arrayStudent = new ArrayList<>();
    StudentAdapter adapterBTVN;

    int currposiion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
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
                Student student = new Student(NameStudent, PhoneStudent, AddressStudent);
                arrayStudent.add(student);
                clearEditText();
                adapterBTVN.notifyDataSetChanged();


            }
        });
//kích vào item
        lvSTD.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // lấy đối tượng ra
                Student student = arrayStudent.get(position);
                txtNamest.setText(student.getNameStudent());
                txtPhone.setText("" + student.getPhone());
                txtAddress.setText(student.getAddressStudent());

                currposiion = position;
            }
        });
        btnUpDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = arrayStudent.get(currposiion);
                student.setNameStudent(txtNamest.getText().toString());
                student.setPhone(Integer.parseInt(txtPhone.getText().toString()));
                student.setAddressStudent(txtAddress.getText().toString());
                adapterBTVN.notifyDataSetChanged();
            }

        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayStudent.remove(currposiion);
                adapterBTVN.notifyDataSetChanged();
            }
        });

    }

    void clearEditText() {
        txtNamest.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
    }

    private void addConTrols() {
        txtNamest = findViewById(R.id.txt_namest);
        txtPhone = findViewById(R.id.txt_phone);
        txtAddress = findViewById(R.id.txt_address);
        btnSaVe = findViewById(R.id.btn_save);
        lvSTD = findViewById(R.id.lv_danhsach);
        btnUpDate = findViewById(R.id.btn_update);
        btnDelete = findViewById(R.id.btn_delete);
        adapterBTVN = new StudentAdapter(getBaseContext(), R.layout.activity_student, arrayStudent);
        lvSTD.setAdapter(adapterBTVN);
    }
}
