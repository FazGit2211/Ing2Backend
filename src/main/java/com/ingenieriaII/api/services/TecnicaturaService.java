package com.ingenieriaII.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ingenieriaII.api.models.Tecnicatura;
@Service
public interface TecnicaturaService {
    ResponseEntity<Tecnicatura> createTec(Tecnicatura tecnicatura);
    List<Tecnicatura> getAllTec();
}
