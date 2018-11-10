package com.example.nguyentan.aclass.Setting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.nguyentan.aclass.R;

public class setting_main_activity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Switch swwifi, swblutoot;
    CheckBox cbBatterySave;
    EditText txtPhonName;
    Button btnSave, btnXoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_main_activity);
        init();
    }

    private void init() {
        swwifi = findViewById(R.id.switch1);
        swblutoot = findViewById(R.id.switch2);
        cbBatterySave = findViewById(R.id.checkBox);
        txtPhonName = findViewById(R.id.txtName_Phone);
        btnSave = findViewById(R.id.btnsave);
        btnXoa = findViewById(R.id.btn_delete);
        // Cách 1 sử dụng interface
    /*    btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                actionClick();
            }
        });
       */
        btnSave.setOnClickListener(this);
        btnXoa.setOnClickListener(this);
        swblutoot.setOnCheckedChangeListener(this);
        swwifi.setOnCheckedChangeListener(this);
        cbBatterySave.setOnCheckedChangeListener(this);
        txtPhonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("Edittex", "beforeTextChanged: "
                        +s+"  "
                        +start+" "
                        +count+"  "
                        +after );
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("Edittex", "beforeTextChanged: "
                        +s+"  "
                        +start+" "
                        +count+"  "
                         );
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Edittex", "beforeTextChanged: "
                        +s+"  "

                );
            }
        });

    }

    void actionClick() {
        // lấy ra trạng thái
        boolean iswifi = swwifi.isChecked();
        boolean isblutoot = swblutoot.isChecked();
        boolean isBattery = cbBatterySave.isChecked();
        String phonName = txtPhonName.getText().toString();
        Log.d("String", "onClick:" + iswifi + " " + isblutoot + " " + isBattery + " " + phonName);
    }
    void actionClear(){
        swwifi.setChecked(false);
        swblutoot.setChecked(false);
        cbBatterySave.setChecked(false);
        txtPhonName.setText("");
    }
    @Override
    public void onClick(View v) {
        Log.d("click", "onClick: ");
        int id = v.getId();
        switch (id){
            case R.id.btnsave: {
                actionClick();
                break;
            }
            case R.id.btn_delete:{
                actionClear();
                break;
            }
            default:
                break;
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id= buttonView.getId();
        switch (id){
            case R.id.switch1: {
                if ( isChecked){
                    Toast.makeText(this, "wifi is on", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "wifi is off", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.switch2:{
                if ( isChecked){
                    Toast.makeText(this, "blutoot is on", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "blutoot is off", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.checkBox:{
                if ( isChecked){
                    Toast.makeText(this, "battery is on", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "battery is off", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:
                break;
        }
    }

}
