/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.dao;

import com.jaime.twilio.whatsapp.models.Clientes;
import java.util.List;

/**
 *
 * @author Jymmy
 */
public interface ClientesInterfaces {
    
    public int create(Clientes c);    
    public Clientes read(Clientes c);
    public int update(Clientes c);
    public int delete(Clientes c);    
    public List<Clientes> All();
    public List<Clientes> Filter(List<Integer> ids);
}
