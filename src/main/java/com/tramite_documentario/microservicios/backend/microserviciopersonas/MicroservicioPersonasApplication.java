package com.tramite_documentario.microservicios.backend.microserviciopersonas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.tramite_documentario.microservicio.backend.commonpersonas.models.entity")
public class MicroservicioPersonasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicioPersonasApplication.class, args);
    }

}
