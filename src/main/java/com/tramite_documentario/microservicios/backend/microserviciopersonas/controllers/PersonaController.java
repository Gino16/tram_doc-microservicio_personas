package com.tramite_documentario.microservicios.backend.microserviciopersonas.controllers;


import com.tramite_documentario.microservicio.backend.commonmicroservicios.controllers.CommonController;
import com.tramite_documentario.microservicio.backend.commonmicroservicios.services.CommonService;
import com.tramite_documentario.microservicio.backend.commonpersonas.models.entity.Persona;
import com.tramite_documentario.microservicios.backend.microserviciopersonas.services.PersonaService;
import com.tramite_documentario.microservicios.backend.microserviciopersonas.services.PuestoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

//@CrossOrigin({"*"})
@RestController
public class PersonaController extends CommonController<Persona, PersonaService> {

    @Autowired
    private PuestoServiceImpl puestoService;

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@Valid @RequestBody Persona persona, BindingResult result, @PathVariable Long id){
        if (result.hasErrors()){
            this.validar(result);
        }

        Optional<Persona> p = this.service.findById(id);
        if (p.isPresent()) {
            Persona personaDb = p.get();
            personaDb.setNombre(persona.getNombre());
            personaDb.setCorreo(persona.getCorreo());
            return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(personaDb));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/puestos")
    public ResponseEntity<?> listarPuestos(){
        return ResponseEntity.ok().body(puestoService.findAll());
    }

    @GetMapping("/buscar-por-dni/{dniRuc}")
    public ResponseEntity<?> findPersonasByDni(@PathVariable String dniRuc){
        return ResponseEntity.ok(this.service.findByDniRuc(dniRuc));
    }

    @GetMapping("/buscar-por-codEstudiante/{codEstudiante}")
    public ResponseEntity<?> findPersonasByCodEstudiante(@PathVariable String codEstudiante){
        return ResponseEntity.ok(this.service.findByCodEstudiante(codEstudiante));
    }

    @GetMapping("/buscar-por-email/{correo}")
    public ResponseEntity<?> findPersonaByCorreo(@PathVariable String correo){
        Persona persona = this.service.findByCorreo(correo);

        return persona != null ? ResponseEntity.ok(persona) : ResponseEntity.notFound().build();
    }
}
