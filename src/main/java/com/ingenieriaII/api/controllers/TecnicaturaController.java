package com.ingenieriaII.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingenieriaII.api.models.Tecnicatura;
import com.ingenieriaII.api.services.TecnicaturaService;

@RestController
@RequestMapping(value = "/tecnicatura", produces = MediaType.APPLICATION_JSON_VALUE)
public class TecnicaturaController {

    @Autowired
    private TecnicaturaService tecnicaturaService;

    @PostMapping
    public ResponseEntity<Tecnicatura> create(@RequestBody Tecnicatura tecnicatura){
        return tecnicaturaService.createTec(tecnicatura);
    }

    @GetMapping
    public List<Tecnicatura> getAll(){
        return tecnicaturaService.getAllTec();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tecnicatura> update(@PathVariable Integer id, @RequestBody Tecnicatura tecnicatura){
        return tecnicaturaService.updateTec(id, tecnicatura);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tecnicatura> getById(@PathVariable Integer id){
        return tecnicaturaService.findByIdTec(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tecnicatura> deleteById(@PathVariable Integer id){
        return tecnicaturaService.deleteTec(id);
    }

    @PutMapping("/addAlumno/{idTecnicatura}/{idAlumno}")
    public ResponseEntity<Tecnicatura> addAlumnoTecnicatura(@PathVariable Integer idTecnicatura, @PathVariable Integer idAlumno){
        return tecnicaturaService.addAluTec(idTecnicatura,idAlumno);
    }

    @DeleteMapping("/removeAlumno/{idTecnicatura}/{idAlumno}")
    public ResponseEntity<Tecnicatura> removeAlumno(@PathVariable Integer idTecnicatura, @PathVariable Integer idAlumno){
        return tecnicaturaService.removeAluTec(idTecnicatura, idAlumno);
    }

    
}
