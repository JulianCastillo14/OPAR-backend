/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.controlador;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.servicio.InmuebleServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/inmuebles")
public class InmuebleController {
    
    @Autowired
    InmuebleServicio inmuebleServicio;
    
    @GetMapping("/")
    public List<Inmueble> ObtenerInmuebles(){
        return inmuebleServicio.ObtenerInmuebles();
    }
}
