package com.ingenieriaII.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ingenieriaII.api.models.Alumno;
import com.ingenieriaII.api.services.AlumnoService;

@RestController
@RequestMapping(value = "/alumno",produces = MediaType.APPLICATION_JSON_VALUE)
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Alumno> create(@RequestBody Alumno alumno){
        return alumnoService.createAlumno(alumno);
    }

    @GetMapping
    public List<Alumno> getAlumnos(){
        return alumnoService.getAllAlumnos();
    }
}
