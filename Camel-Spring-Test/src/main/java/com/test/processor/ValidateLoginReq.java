/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.processor;

import com.test.model.LoginModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author akshayrane
 */
public class ValidateLoginReq implements Processor{

    @Override
    public void process(Exchange exchng) throws Exception
        {
        LoginModel loginModel=exchng.getIn().getBody(LoginModel.class);
        
        //check if attributes empty or null
        //if null throw some customise Exception new ValidationException("InvalidRequest");
        
        //else 
        exchng.getIn().setBody(loginModel);
        
        }
    
}
