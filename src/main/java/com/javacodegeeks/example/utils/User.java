/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.example.utils;

/**
 *
 * @author lenovo
 */
public class User {
    
    private String name;
    private String password;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
}
