package com.examen.api.controller;

import com.examen.api.model.Centroide;
import com.examen.api.model.Provincia;
import com.examen.api.service.ProvinciasService;
import com.examen.api.service.UserService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static com.examen.api.constants.Paths.*;

@RestController
@RequestMapping(PROVINCIAS_PATH)
public class ProvinciasController {

    private final Logger logger = LoggerFactory.getLogger(ProvinciasController.class);

    @Autowired
    private ProvinciasService service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(PROVINCIA_BY_NAME_PATH)
    public ResponseEntity<Centroide> getLatLongByProvinciaName(@RequestParam String nombre) {
        logger.debug("GET request getLatLongByProvinciaName: {}", nombre);
        return new ResponseEntity<>(service.getLatLong(nombre), HttpStatus.OK);
    }

}
