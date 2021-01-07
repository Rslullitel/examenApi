package com.examen.api;

import com.examen.api.model.Provincia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiApplication {

	private static final Logger log = LoggerFactory.getLogger(ApiApplication.class);

	@Bean
	public RestTemplate getresttemplate() {
		return new RestTemplate();
	}

	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Provincia provincia = restTemplate.getForObject(
					"https://apis.datos.gob.ar/georef/api/provincias?nombre=?cordoba", Provincia.class);
			log.info(provincia.getCentroide().toString());
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
