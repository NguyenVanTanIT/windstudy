package com.example.nguyentan.aclass.quanLyTaiLieu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;


import com.example.nguyentan.aclass.R;

public class sachActivity extends TaiLieuActivity {
    EditText txtTenSach, txtTenTacGia,txtSoTrang;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sach);
    }

    @Override
    public void init() {
        super.init();
        txtTenSach=findViewById(R.id.txtTenSach);
        txtTenTacGia=findViewById(R.id.txtTenTacGia);
        txtSoTrang=findViewById(R.id.txtSoTrang);
    }
}

