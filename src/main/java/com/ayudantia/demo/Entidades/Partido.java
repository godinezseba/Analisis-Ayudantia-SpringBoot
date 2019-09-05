package com.ayudantia.demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Partido")
@Entity
public class Partido{
    @Id
    @GenericGenerator(name="incrementpartido", strategy="increment")
    @GeneratedValue(generator="incrementpartido")
    @Column(name="id_partido")
    long id;

    @Column(name="id_torneo")
    long idtorneo;

    @Column(name="id_equipoA")
    long idequipoA;

    @Column(name="id_equipoB")
    long idequipoB;

    @Column(name="scoreA")
    long scoreA;

    @Column(name="scoreB")
    long scoreB;

    Partido (){

    }

    public Partido(long id, long idtorneo, long idequipoA, long idequipoB, long scoreA, long scoreB) {
        this.id = id;
        this.idtorneo = idtorneo;
        this.idequipoA = idequipoA;
        this.idequipoB = idequipoB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdtorneo() {
        return this.idtorneo;
    }

    public void setIdtorneo(long idtorneo) {
        this.idtorneo = idtorneo;
    }

    public long getIdequipoA() {
        return this.idequipoA;
    }

    public void setIdequipoA(long idequipoA) {
        this.idequipoA = idequipoA;
    }

    public long getIdequipoB() {
        return this.idequipoB;
    }

    public void setIdequipoB(long idequipoB) {
        this.idequipoB = idequipoB;
    }

    public long getScoreA() {
        return this.scoreA;
    }

    public void setScoreA(long scoreA) {
        this.scoreA = scoreA;
    }

    public long getScoreB() {
        return this.scoreB;
    }

    public void setScoreB(long scoreB) {
        this.scoreB = scoreB;
    }

}