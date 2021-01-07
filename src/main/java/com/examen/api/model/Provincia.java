package com.examen.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Provincia {

    //@Id
    //@GeneratedValue
    @JsonProperty("id")
    private long id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("centroide")
    private Centroide centroide;

    public Provincia() {}

    public Provincia(long id, String nombre, Centroide centroide){
        this.id = id;
        this.nombre = nombre;
        this.centroide = centroide;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Centroide getCentroide() {
        return centroide;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCentroide(Centroide centroide) {
        this.centroide = centroide;
    }
}
