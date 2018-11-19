package com.example.nguyentan.confirm;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SensorManage extends AppCompatActivity implements SensorEventListener {
    //tạo ra biên môi trường
    SensorManager sensorManage;
    Sensor sensor;
    TextView txtHienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_manage);
        txtHienThi= findViewById(R.id.txtHienThi);

        // đăng ký Sensor với service
        sensorManage=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor= sensorManage.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorManage.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float giatri=event.values[0];
        if (giatri==0) {
            txtHienThi.setText("Thiết bị gần");
        }
        else {
            txtHienThi.setText("Thiết bị xa");
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
