/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.controllers;

import com.jaime.twilio.whatsapp.models.Mensaje;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jymmy
 */
@Api("WhatsApp")
@RestController
@RequestMapping(value = "api")
public class WhastappController {

    //---Debes poner tu SID y tu token que te proporciona TWILIO
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";
   
    //---Envia mensaje de texto
    public String from = "+12056560133";
    //----Para enviar por whatsapp debemos agregar whatsapp: a los numeros antes
    public String from2 = "whatsapp:+14155238886";
    

    @ApiOperation(
            value = "Envia 1 mensaje de texto a 1 numero el numero debe iniciar con +",
            notes = "Ejemplo "
                    + "{\n"
            + "\"mensaje\": \"Hola Jaime\",\n"
            + "\"numero\": \"+503XXXXXXXX\"\n"
            + "}"
    )
    @RequestMapping(value = "/enviarMensaje", method = RequestMethod.POST)
    public String enviarMsn(@RequestBody Mensaje mensaje) {
        String respuesta = "";
         System.out.println(mensaje.getNumero()); 
         System.out.println(from); 
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(   
                     new com.twilio.type.PhoneNumber(mensaje.getNumero()),
                    new com.twilio.type.PhoneNumber(from),
                    mensaje.getMensaje())
                    .create();           
            System.out.println(message.getSid()); 
            respuesta = "Exito al enviar";
        } catch (Exception e) {
            respuesta = "Error " + e;
        }

        return respuesta;
    }
    
    @ApiOperation(
            value = "Envia 1 mensaje de Whatsapp a 1 numero el numero debe iniciar con +",
            notes = "Ejemplo "
                    + "{\n"
            + "\"mensaje\": \"Hola Jaime\",\n"
            + "\"numero\": \"+503XXXXXXXX\"\n"
            + "}"
    )
    @RequestMapping(value = "/enviarWhatsapp", method = RequestMethod.POST)
    public String enviarWhatsapp(@RequestBody Mensaje mensaje) {
        String respuesta = "";
         System.out.println(mensaje.getNumero()); 
         System.out.println(from); 
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(   
                     new com.twilio.type.PhoneNumber("whatsapp:"+mensaje.getNumero()),
                    new com.twilio.type.PhoneNumber(from2),
                    mensaje.getMensaje())
                    .create();           
            System.out.println(message.getSid()); 
            respuesta = "Exito al enviar";
        } catch (Exception e) {
            respuesta = "Error " + e;
        }

        return respuesta;
    }

    @ApiOperation(
            value = "Prueba de servicios",
            notes = ""
    )
    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public String Saludar() {
        String respuesta = "Hola probador swagger";
        return respuesta;
    }
  
}
