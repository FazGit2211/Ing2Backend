package com.ingenieriaII.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingenieriaII.api.models.Tecnicatura;
import com.ingenieriaII.api.services.TecnicaturaService;

@RestController
@RequestMapping("/tecnicatura")
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
}
