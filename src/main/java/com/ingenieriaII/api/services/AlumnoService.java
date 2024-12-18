package com.ingenieriaII.api.services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ingenieriaII.api.models.Alumno;

public interface AlumnoService {

    ResponseEntity<Alumno> createAlumno(Alumno alumno);
    List<Alumno> getAllAlumnos();
    ResponseEntity<Alumno> deleteAlumno(Integer alumnoId);
}
