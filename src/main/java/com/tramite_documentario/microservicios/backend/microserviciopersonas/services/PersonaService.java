package com.tramite_documentario.microservicios.backend.microserviciopersonas.services;

import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonService;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;

import java.util.List;

public interface PersonaService extends CommonService<Persona> {
    public List<Persona> findByDniRuc(String dni);

    public List<Persona> findByCodEstudiante(String codEstudiante);

    public Persona findByCorreo(String correo);
}
