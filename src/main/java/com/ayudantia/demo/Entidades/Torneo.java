package com.ayudantia.demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="TORNEO")
@Entity
public class Torneo {
    @Id
    @GenericGenerator(name="incrementtorneo", strategy="increment")
    @GeneratedValue(generator="incrementtorneo")
    @Column(name="id_torneo")
    private long id;

    @Column(name="nombre")
    String nombre;

    @Column(name="pais")
    String pais;

    public Torneo(){

    }

    public Torneo(long id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}