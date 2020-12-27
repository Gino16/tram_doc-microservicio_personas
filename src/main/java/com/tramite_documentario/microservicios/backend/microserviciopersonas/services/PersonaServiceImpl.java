package com.tramite_documentario.microservicios.backend.microserviciopersonas.services;


import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonServiceImpl;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;
import com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends CommonServiceImpl<Persona, PersonaRepository> implements PersonaService{

}
