/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.exception;

/**
 *
 * @author akshayrane
 */
public class InvalidUserException extends Exception{

    public InvalidUserException(String message) {
        super(message);
    }
    
}
