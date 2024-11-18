package com.ingenieriaII.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.ingenieriaII.api.models.Tecnicatura;

public interface TecnicaturaService {
    ResponseEntity<Tecnicatura> createTec(Tecnicatura tecnicatura);
    List<Tecnicatura> getAllTec();
    ResponseEntity<Tecnicatura> updateTec(Integer id, Tecnicatura tecnicatura);
    ResponseEntity<Tecnicatura> findByIdTec(Integer id);
}
