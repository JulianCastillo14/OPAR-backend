/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.modelo;

/**
 *
 * @author julia
 */

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = Imagen.TABLE_NAME)
public class Imagen {
    public static final String TABLE_NAME = "Imagen";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Imagen")
    private Integer idImagen;
    
    @ManyToOne
    @JoinColumn(name="Id_Inmueble")
    @JsonBackReference
    private Inmueble inmueble;
    
    @Column(name = "URL")
    private String url;

    public Imagen() {
    }

    public Imagen(Inmueble inmueble, String url) {
        this.inmueble = inmueble;
        this.url = url;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

