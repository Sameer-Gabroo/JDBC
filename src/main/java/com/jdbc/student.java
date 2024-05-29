package com.jdbc;

public class student {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public student(String name, int ID, String city) {
        Name = name;
        this.ID = ID;
        City = city;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    private int ID;

    private String City;
}
