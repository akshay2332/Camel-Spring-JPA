/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.repository;

import com.test.entities.PostgresEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Akshay
 */
@Repository
public class PossRepository {
    
    @PersistenceContext(unitName = "postgresPU")
    private EntityManager entityManager;
    
    @Transactional
    public void methodPoss(Exchange exchange)
        {
        System.out.println("com.test.repository.PossRepository.methodPoss()");
        
        System.out.println("com.test.repository.CassReposirtory.methodCass()");
        PostgresEntity cassEntity=new PostgresEntity();
       // cassEntity.setId(Long.MIN_VALUE);
        cassEntity.setName("abc");
        
       
        //entityManager.getTransaction().begin();
        entityManager.persist(cassEntity);
        }
    
    @Transactional
    public void checkLogin(Exchange exchange)
        {
        //write response from here by checking in db
        //else throw exception new InvalidUserException    
            
        }
    
    
}
