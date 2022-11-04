package com.example.edcustechnicaltest;

import java.util.Date;

public class Persona {
   private String name;
   private  String lastName;
   private String gender;
   private Date brithday;
   private  String password;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBrithday() {
        return brithday;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
