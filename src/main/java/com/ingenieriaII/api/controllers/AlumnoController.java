package com.ingenieriaII.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingenieriaII.api.models.Alumno;
import com.ingenieriaII.api.services.AlumnoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Alumno> create(@RequestBody Alumno alumno){
        return alumnoService.createAlumno(alumno);
    }
}
