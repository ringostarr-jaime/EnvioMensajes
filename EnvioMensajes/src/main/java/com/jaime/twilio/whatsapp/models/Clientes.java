/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jymmy
 */
@Entity
@Table(name = "clientes", catalog = "twilioclientes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findById", query = "SELECT c FROM Clientes c WHERE c.id = :id"),
    @NamedQuery(name = "Clientes.findByNombre1", query = "SELECT c FROM Clientes c WHERE c.nombre1 = :nombre1"),
    @NamedQuery(name = "Clientes.findByNombre2", query = "SELECT c FROM Clientes c WHERE c.nombre2 = :nombre2"),
    @NamedQuery(name = "Clientes.findByApellido1", query = "SELECT c FROM Clientes c WHERE c.apellido1 = :apellido1"),
    @NamedQuery(name = "Clientes.findByApellido2", query = "SELECT c FROM Clientes c WHERE c.apellido2 = :apellido2"),
    @NamedQuery(name = "Clientes.findByEdad", query = "SELECT c FROM Clientes c WHERE c.edad = :edad"),
    @NamedQuery(name = "Clientes.findByNombre3", query = "SELECT c FROM Clientes c WHERE c.nombre3 = :nombre3"),
    @NamedQuery(name = "Clientes.findByApellido3", query = "SELECT c FROM Clientes c WHERE c.apellido3 = :apellido3")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nombre1", length = 100)
    private String nombre1;
    @Column(name = "nombre2", length = 100)
    private String nombre2;
    @Column(name = "apellido1", length = 100)
    private String apellido1;
    @Column(name = "apellido2", length = 100)
    private String apellido2;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "nombre3", length = 100)
    private String nombre3;
    @Column(name = "apellido3", length = 100)
    private String apellido3;

    public Clientes() {
    }

    public Clientes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido3() {
        return apellido3;
    }

    public void setApellido3(String apellido3) {
        this.apellido3 = apellido3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jaime.twilio.whatsapp.models.Clientes[ id=" + id + " ]";
    }
    
}
