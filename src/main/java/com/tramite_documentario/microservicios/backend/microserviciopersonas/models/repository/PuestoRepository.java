package com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository;

import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Puesto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface PuestoRepository extends PagingAndSortingRepository<Puesto, Long> {
}