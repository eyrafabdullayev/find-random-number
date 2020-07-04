package com.example.findnumber.beans;

import java.io.Serializable;

public class Competitor implements Serializable {
    
    private String name;
    private String surname;
    private Accout accout;
    private Integer point;
    
    public Competitor(Accout accout,String name,String surname){
        this.name = name;
        this.surname = surname;
        this.accout = accout;
        this.point = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Accout getAccout() {
        return accout;
    }

    public void setAccout(Accout accout) {
        this.accout = accout;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
    
}
