/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.dao;

import com.jaime.twilio.whatsapp.models.Clientes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jymmy
 */
@Repository
@Transactional
public class ClientesImp implements ClientesInterfaces {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int create(Clientes c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clientes read(Clientes c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Clientes c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Clientes c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> All() {
        String query = "FROM Clientes";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Clientes> Filter(List<Integer> ids) {      
        List<Clientes> lista = new ArrayList<>();
        String query = "SELECT c FROM Clientes c WHERE c.id=?1";
        for (int i = 0; i < ids.size(); i++) {
            System.out.println("ids.get(i) "+ids.get(i));
            Query q = entityManager.createQuery(query);  
             System.out.println(" getSingleResult() "+((Clientes) q.setParameter(1, ids.get(i)).getSingleResult()));
            lista.add(((Clientes) q.setParameter(1, ids.get(i)).getSingleResult()));
       }        
        return lista;

    }

}
