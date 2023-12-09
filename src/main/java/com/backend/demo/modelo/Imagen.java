package com.backend.demo.modelo;

/**
 *
 * @author julia
 */

import com.backend.demo.deserializer.InmuebleDeserializer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
    @JsonDeserialize(using = InmuebleDeserializer.class)
    @JsonBackReference
    private Inmueble idInmueble;
    
    @Column(name = "URL")
    private String url;

    public Imagen() {
    }

    public Imagen(Inmueble idInmueble, String url) {
        this.idInmueble = idInmueble;
        this.url = url;
    }
    
    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public Inmueble getInmueble() {
        return idInmueble;
    }

    public void setInmueble(Inmueble idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Imagen{" + "idImagen=" + idImagen + ", idInmueble=" + idInmueble + ", url=" + url + '}';
    }
}

