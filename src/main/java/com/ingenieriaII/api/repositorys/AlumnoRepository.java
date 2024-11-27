package com.ingenieriaII.api.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingenieriaII.api.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno,Integer> {
}
