package com.ayudantia.demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="EQUIPO")
@Entity
public class Equipo{
    @Id
    @GenericGenerator(name="incrementequipo", strategy="increment")
    @GeneratedValue(generator="incrementequipo")
    @Column(name="id_equipo")
    long id;
    
    @Column(name="nombre")
    String nombre;

    @Column(name="pais")
    String pais;

    public Equipo(){

    }

    public Equipo(long id, String nombre, String pais) {
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