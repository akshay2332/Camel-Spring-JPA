/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.repository;

import com.test.entities.CassEntity;
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
public class CassReposirtory {
    @PersistenceContext(unitName = "cassandraPU")
    private EntityManager entityManager;
    
    @Transactional
    public void methodCass(Exchange exchange)
        {
        System.out.println("com.test.repository.CassReposirtory.methodCass()");
        CassEntity cassEntity=new CassEntity();
        //cassEntity.setId(Long.MIN_VALUE);
        cassEntity.setName("abc");
        
       
        //entityManager.getTransaction().begin();
        entityManager.persist(cassEntity);
        //entityManager.getTransaction().commit();
        //entityManager.close();
        
        
        }
    
    
}
