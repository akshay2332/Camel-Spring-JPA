/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akshay.camel.spring.test.route;

import com.test.entities.CassEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author akshayrane
 */
public class TestClass {
    
     public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cassandraPU");
        EntityManager em = emf.createEntityManager();

        CassEntity cassEntity=new CassEntity();
        //cassEntity.setId(Long.MIN_VALUE);
        cassEntity.setName("abc");
        em.persist(cassEntity);
        em.close();
        emf.close();
    }
    
}
