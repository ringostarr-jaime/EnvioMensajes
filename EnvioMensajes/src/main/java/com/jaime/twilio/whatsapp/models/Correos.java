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
@Table(name = "correos", catalog = "twilioclientes", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correos.findAll", query = "SELECT c FROM Correos c"),
    @NamedQuery(name = "Correos.findById", query = "SELECT c FROM Correos c WHERE c.id = :id"),
    @NamedQuery(name = "Correos.findByCorreo", query = "SELECT c FROM Correos c WHERE c.correo = :correo"),
    @NamedQuery(name = "Correos.findByIdcliente", query = "SELECT c FROM Correos c WHERE c.idcliente = :idcliente")})
public class Correos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "correo", length = 100)
    private String correo;
    @Column(name = "idcliente")
    private Integer idcliente;

    public Correos() {
    }

    public Correos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
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
        if (!(object instanceof Correos)) {
            return false;
        }
        Correos other = (Correos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jaime.twilio.whatsapp.models.Correos[ id=" + id + " ]";
    }
    
}
