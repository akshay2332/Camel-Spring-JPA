/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author akshayrane
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterModel {
    
    private String userName;
    private String userPwd;
    private String userEmail;

    @JsonCreator
    public RegisterModel(@JsonProperty("name") String userName,
            @JsonProperty("password") String userPwd,
            @JsonProperty("email") String userEmail) {
        setUserName(userName);
        setUserPwd(userPwd);
        setUserEmail(userEmail);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    
    
    
}
