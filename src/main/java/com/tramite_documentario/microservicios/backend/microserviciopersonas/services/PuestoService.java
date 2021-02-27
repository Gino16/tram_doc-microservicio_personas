package com.tramite_documentario.microservicios.backend.microserviciopersonas.services;

import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonService;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Puesto;

public interface PuestoService extends CommonService<Puesto> {
    public Puesto findByNombre(String nombre);
}
