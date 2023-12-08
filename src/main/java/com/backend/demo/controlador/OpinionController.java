/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.controlador;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.modelo.LoginCiudadano;
import com.backend.demo.modelo.Opinion;
import com.backend.demo.servicio.OpinionServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/opiniones")
public class OpinionController {
    
    @Autowired
    OpinionServicio opinionServicio;
    
    @PostMapping("/inmuebles")
    public List<Opinion> BuscarPorInmueble(@RequestBody Integer inmueble){
        System.out.println(inmueble.toString());
        return opinionServicio.ObtenerOpinionesInmueble(inmueble);
    }
}
