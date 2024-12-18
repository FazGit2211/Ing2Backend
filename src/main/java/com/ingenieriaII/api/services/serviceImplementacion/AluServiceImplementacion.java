package com.ingenieriaII.api.services.serviceImplementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ingenieriaII.api.models.Alumno;
import com.ingenieriaII.api.repositorys.AlumnoRepository;
import com.ingenieriaII.api.services.AlumnoService;
@Service
public class AluServiceImplementacion implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @Override
    public ResponseEntity<Alumno> createAlumno(Alumno alumno) {
        try {
            return ResponseEntity.ok(alumnoRepository.save(alumno));
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public ResponseEntity<Alumno> deleteAlumno(Integer alumnoId) {
        try {
            Optional<Alumno> alumExist = alumnoRepository.findById(alumnoId);
            if(alumExist.isPresent()){
                Alumno alumnoActual = alumExist.get();
                alumnoRepository.deleteById(alumnoId);
                return ResponseEntity.ok(alumnoActual);
            }            
        } catch (Exception e) {
            System.out.println(e);            
        }        
        return ResponseEntity.badRequest().build();
    }

}
