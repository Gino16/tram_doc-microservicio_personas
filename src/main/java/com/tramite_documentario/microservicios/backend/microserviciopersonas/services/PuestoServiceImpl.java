package com.tramite_documentario.microservicios.backend.microserviciopersonas.services;

import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonServiceImpl;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Puesto;
import com.tramite_documentario.microservicios.backend.microserviciopersonas.models.repository.PuestoRepository;
import org.springframework.stereotype.Service;

@Service
public class PuestoServiceImpl extends CommonServiceImpl<Puesto, PuestoRepository> implements PuestoService{
}
