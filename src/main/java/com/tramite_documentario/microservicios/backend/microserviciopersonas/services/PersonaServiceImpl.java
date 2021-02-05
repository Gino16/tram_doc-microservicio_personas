package com.tramite_documentario.microservicios.backend.microserviciopersonas.services;


import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonServiceImpl;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;
import com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl extends CommonServiceImpl<Persona, PersonaRepository> implements PersonaService{

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findByDniRuc(String dni) {
        return this.repository.findByDniRuc(dni);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findByCodEstudiante(String codEstudiante) {
        return this.repository.findByCodEstudiante(codEstudiante);
    }

    @Transactional
    public Persona findByCorreo(String correo){
        return this.repository.findByCorreo(correo);
    }
}
