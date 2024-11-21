package com.ingenieriaII.api.services;

import org.springframework.http.ResponseEntity;

import com.ingenieriaII.api.models.Alumno;

public interface AlumnoService {

    ResponseEntity<Alumno> createAlumno(Alumno alumno);
}
