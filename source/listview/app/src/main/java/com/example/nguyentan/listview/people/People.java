package com.example.nguyentan.listview.people;

/**
 * Created by Nguyen Tan on 11/24/2018.
 */

public class People {
    public  String namePeople;
    public  int yearOldPeople;
    public  String addressPeople;

    public People(String namePeople, int yearOldPeople, String addressPeople) {
        this.namePeople = namePeople;
        this.yearOldPeople = yearOldPeople;
        this.addressPeople = addressPeople;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public int getYearOldPeople() {
        return yearOldPeople;
    }

    public void setYearOldPeople(int yearOldPeople) {
        this.yearOldPeople = yearOldPeople;
    }

    public String getAddressPeople() {
        return addressPeople;
    }

    public void setAddressPeople(String addressPeople) {
        this.addressPeople = addressPeople;
    }
}
