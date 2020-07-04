package com.example.findnumber.beans;

import java.io.Serializable;

/**
 *
 * @author eyraf
 */
public class Accout implements Serializable{
    
    private String username;
    private String password;

    public Accout(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
