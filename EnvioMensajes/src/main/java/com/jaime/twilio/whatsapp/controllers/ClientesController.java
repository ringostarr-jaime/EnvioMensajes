/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.controllers;

import com.jaime.twilio.whatsapp.dao.ClientesInterfaces;
import com.jaime.twilio.whatsapp.models.Clientes;
import io.swagger.annotations.Api;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jymmy
 */
@Api("Clientes")
@RestController
@RequestMapping(value = "api")
public class ClientesController {

    @Autowired
    private ClientesInterfaces obj;

    @GetMapping(path = "/listarClientes")
    public List<Clientes> all() {
        List<Clientes> clientes = new ArrayList<>();
        try {
            clientes = obj.All();
        } catch (Exception e) {
            Clientes cl = new Clientes();
            cl.setId(0);
            cl.setNombre1("SIN CONEXION");
            cl.setApellido1("SIN CONEXION");
            clientes.add(cl);
        }
        return clientes;
    }

    @GetMapping(path = "/listarClientesById")
    public List<Clientes> all2() {
        List<Clientes> clientes = new ArrayList<>();
        try {
            List<Integer> ids2 = new ArrayList<>();
            ids2.add(2);
            ids2.add(3);
            clientes = obj.Filter(ids2);
        } catch (Exception e) {
            Clientes cl = new Clientes();
            cl.setId(0);
            cl.setNombre1("SIN CONEXION");
            cl.setApellido1("SIN CONEXION");
            clientes.add(cl);
        }
        return clientes;
    }

}
