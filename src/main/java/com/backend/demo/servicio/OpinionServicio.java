/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.modelo.Opinion;
import com.backend.demo.repositorio.OpinionRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */

@Service
@Transactional
    public class OpinionServicio implements IOpinionServicio {

    @Autowired
    OpinionRepositorio opinionRepositorio;
    
    @Override
    public List<Opinion> ObtenerOpinionesInmueble(Integer inmueble) {
        return opinionRepositorio.findByInmueble(inmueble);
    }

    @Override
    public Opinion AgregarOpinion(Opinion opinion) {
        return opinionRepositorio.save(opinion);
    }
    
    
}
