package com.example.nguyentan.aclass;

import android.util.Log;

public class information {

    public   String  name;
    public   int  Age;
    public   String  Adress;
    public static String TAG="ktsv";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public information(String name, int age, String adress) {
        this.name = name;
        Age = age;
        Adress = adress;
    }
    void  getinformation(){
        Log.d(TAG,this.name);
        Log.d(TAG,String.valueOf(this.Age));
        Log.d(TAG,this.Adress);
    }
}
