package com.codemybackend.facility;


public class User {

    String h_name;

    public User() {
        //Default Constructor
    }

    public User(String h_name) {
        this.h_name = h_name;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }
}
