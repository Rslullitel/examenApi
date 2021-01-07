package com.examen.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoProvincias {

    @JsonProperty("cantidad")
    private int cantidad;

    @JsonProperty("inicio")
    private int inicio;

    @JsonProperty("parametros")
    private Parametro parametros;

    @JsonProperty("provincias")
    private Provincia[] provincias;

    @JsonProperty("total")
    private int total;

    public InfoProvincias() {}

    public InfoProvincias(int cantidad, int inicio, Parametro parametros, Provincia[] provincias, int total) {
        this.cantidad = cantidad;
        this.inicio = inicio;
        this.parametros = parametros;
        this.provincias = provincias;
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public Parametro getParametros() {
        return parametros;
    }

    public void setParametros(Parametro parametros) {
        this.parametros = parametros;
    }

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
