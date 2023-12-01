/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.LoginCiudadano;
import com.backend.demo.repositorio.CiudadanoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */
@Service
@Transactional
public class CiudadanoServicio implements ICiudadanoServicio{
    
    @Autowired
    CiudadanoRepositorio ciudadanoRepositorio;

    @Override
    public Integer LoginCiudadano(LoginCiudadano login) {
       return ciudadanoRepositorio.findByUsuarioYContraseñaCount(login.getUsuario(), login.getContraseña());
    }
    
}
