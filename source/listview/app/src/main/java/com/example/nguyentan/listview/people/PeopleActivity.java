package com.example.nguyentan.listview.people;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.nguyentan.listview.R;

import java.util.ArrayList;

public class PeopleActivity extends AppCompatActivity {
    EditText etxtName, etxtAddress,etxtYearOld;
    Button btnSaVePoeple, btnClear, btnUpdate;
    ListView lVPeople;

    ArrayList<People> arrayPeople = new ArrayList<>();
    PeopleAdapter peopleAdapter;
    int currposiion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        addControls();
        addEvents();
    }

    private void addEvents() {

        lVPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                currposiion=position;
                People people= arrayPeople.get(position);
                etxtName.setText(people.getNamePeople());
                etxtYearOld.setText(""+people.getYearOldPeople());
                etxtAddress.setText(people.getAddressPeople());

            }
        });
        btnSaVePoeple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String naMe = etxtName.getText().toString();
                int yearOld =Integer.parseInt(etxtYearOld.getText().toString());
                String address =etxtAddress.getText().toString();
                People people =new People(naMe,yearOld,address);
                arrayPeople.add(people);
                clear();
                peopleAdapter.notifyDataSetChanged();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayPeople.remove(currposiion);
                peopleAdapter.notifyDataSetChanged();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                People people= arrayPeople.get(currposiion);
                people.setNamePeople(etxtName.getText().toString());
                people.setYearOldPeople(Integer.parseInt(etxtYearOld.getText().toString()));
                people.setAddressPeople(etxtAddress.getText().toString());

                peopleAdapter.notifyDataSetChanged();
            }
        });

    }

    private void addControls() {
        etxtName=findViewById(R.id.etxt_name);
        etxtYearOld=findViewById(R.id.etxt_year_old);
        etxtAddress=findViewById(R.id.etxt_address);
        btnSaVePoeple=findViewById(R.id.btn_people_save);
        btnClear=findViewById(R.id.btn_clear_people);
        btnUpdate=findViewById(R.id.btn_update_people);


        lVPeople=findViewById(R.id.lv_people);
        peopleAdapter = new PeopleAdapter(getBaseContext(),R.layout.activity_people,arrayPeople);
        lVPeople.setAdapter(peopleAdapter);
    }
    void clear(){
        etxtName.setText("");
        etxtYearOld.setText("");
        etxtAddress.setText("");
    }
}
