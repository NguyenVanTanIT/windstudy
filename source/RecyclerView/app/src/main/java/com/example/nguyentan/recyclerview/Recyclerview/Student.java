package com.example.nguyentan.recyclerview.Recyclerview;

public class Student {
    public String NameStudent;
    public int Phone;
    public String AddressStudent;

    public Student(String nameStudent, int phone, String addressStudent) {

        NameStudent = nameStudent;
        Phone = phone;
        AddressStudent = addressStudent;
    }

    public String getNameStudent() {
        return NameStudent;
    }

    public void setNameStudent(String nameStudent) {
        NameStudent = nameStudent;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getAddressStudent() {
        return AddressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        AddressStudent = addressStudent;
    }

    public Student() {
    }
}
