package com.ingenieriaII.api.services.serviceImplementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.ingenieriaII.api.models.Tecnicatura;
import com.ingenieriaII.api.repositorys.TecnicaturaRepository;
import com.ingenieriaII.api.services.TecnicaturaService;

public class TecServiceImplementacion implements TecnicaturaService {

    @Autowired
    private TecnicaturaRepository tecnicaturaRepository;

    @Override
    public ResponseEntity<Tecnicatura> createTec(Tecnicatura tecnicatura) {
        try {
            return ResponseEntity.ok(tecnicaturaRepository.save(tecnicatura));
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public List<Tecnicatura> getAllTec() {
        return tecnicaturaRepository.findAll();
    }

}
