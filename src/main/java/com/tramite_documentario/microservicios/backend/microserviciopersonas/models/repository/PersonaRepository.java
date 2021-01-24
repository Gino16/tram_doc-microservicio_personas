package com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository;


import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {

    @Query("select p from Persona p where p.dniRuc like %?1%")
    public List<Persona> findByDniRuc(String dni);

    @Query("select p from Persona p where p.codEstudiante like %?1%")
    public List<Persona> findByCodEstudiante(String codEstudiante);

}
