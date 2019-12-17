package com.ayudantia.demo.HLTV.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Equipo;
import com.ayudantia.demo.HLTV.Servicios.EquipoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/equipo")
public class EquipoController{
    @Autowired
    @Qualifier("servicioequipo")
    EquipoServicio servicio;

    @GetMapping("/equipo")
    public Equipo obtenerEquipo(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/equipo")
    public boolean agregarEquipo(@RequestBody @Valid Equipo equipo){
        return servicio.crear(equipo);
    }

    @PutMapping("/equipo")
    public boolean actualizarEquipo(@RequestBody @Valid Equipo equipo){
        return servicio.actualizar(equipo);
    }

    @DeleteMapping("/equipo/{id}")
    public boolean borrarEquipo(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/getAll")
    public List<Equipo> getAllEquipo(){
        return servicio.obtenerAll();
    }

}