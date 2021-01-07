package com.examen.api.service;

import com.examen.api.model.Centroide;
import com.examen.api.model.InfoProvincias;
import com.examen.api.model.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProvinciasService {

    private static final String BASE_URL = "https://apis.datos.gob.ar/georef/api/provincias?nombre=";

    @Autowired
    private RestTemplate restTemplate;

    public Centroide getLatLong(String nombre){
        InfoProvincias infoProvincias = restTemplate.getForObject(
                BASE_URL + nombre,
                InfoProvincias.class);
        Provincia[] p = infoProvincias.getProvincias();
        Centroide c = p[0].getCentroide();
        return  c;
    }

}
