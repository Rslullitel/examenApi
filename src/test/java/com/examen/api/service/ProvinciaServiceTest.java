package com.examen.api.service;

import com.examen.api.model.*;
import com.examen.api.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProvinciaServiceTest {

    private static final String BASE_URL = "https://apis.datos.gob.ar/georef/api/provincias?nombre=";

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ProvinciasService service;

    private InfoProvincias info;
    private Centroide centroide;

    @BeforeEach
    public void init(){
        centroide = new Centroide(-34.6298873058957, -68.5831228183798);
        info = new InfoProvincias(1, 0, new Parametro("mendoza"), new Provincia[]{new Provincia(1, "mendoza", centroide)}, 1);
    }


    @Test
    public void ShouldFindProvinciaByName_AndReturn_LatYLong(){
        when(restTemplate.getForObject(
                BASE_URL + "mendoza", InfoProvincias.class))
          .thenReturn(info);

        Centroide c = service.getLatLong("mendoza");
        assertEquals(centroide, c);
    }

}
