/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author akshayrane
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginModel {
    
    private String userName;
    private String userPwd;
    
    @JsonCreator
    public LoginModel(@JsonProperty("name") String userName,
            @JsonProperty("password") String userPwd) {
        setUserName(userName);
        setUserPwd(userPwd);
       
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
    
    
}
