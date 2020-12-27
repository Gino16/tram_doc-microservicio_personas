package com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository;


import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {
}
