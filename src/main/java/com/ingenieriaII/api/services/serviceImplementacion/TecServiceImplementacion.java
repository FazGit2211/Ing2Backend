package com.ingenieriaII.api.services.serviceImplementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ingenieriaII.api.models.Tecnicatura;
import com.ingenieriaII.api.repositorys.TecnicaturaRepository;
import com.ingenieriaII.api.services.TecnicaturaService;

@Service
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

    @Override
    public ResponseEntity<Tecnicatura> updateTec(Integer id, Tecnicatura tecnicatura) {
        try {
            Optional<Tecnicatura> existeTec = tecnicaturaRepository.findById(id);
            if (existeTec.isPresent()) {
                Tecnicatura tecnicaturaActual = existeTec.get();
                tecnicaturaActual.setNombre(tecnicatura.getNombre());
                tecnicaturaActual.setDuracion(tecnicatura.getDuracion());
                tecnicaturaActual.setCantidadAsignaturas(tecnicatura.getCantidadAsignaturas());
                tecnicaturaActual.setNumeroResolucion(tecnicatura.getNumeroResolucion());
                // Guardar la tecnicatura actualizada
                Tecnicatura updatedTecnicatura = tecnicaturaRepository.save(tecnicaturaActual);
                // Retornar la respuesta con el objeto actualizado
                return ResponseEntity.ok(updatedTecnicatura);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Tecnicatura> findByIdTec(Integer id) {
        try {
            Optional<Tecnicatura> existTec = tecnicaturaRepository.findById(id);
            return ResponseEntity.ok(existTec.get());
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Tecnicatura> deleteTec(Integer id) {
        try {
            Optional<Tecnicatura> existTec = tecnicaturaRepository.findById(id);
            if(existTec.isPresent()){
                Tecnicatura tecnicatura = existTec.get();
                tecnicaturaRepository.delete(tecnicatura);
                return ResponseEntity.ok(tecnicatura);
            }            
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.badRequest().build();
    }

}
