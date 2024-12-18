package com.ingenieriaII.api.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Tecnicatura implements Sujeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    private int duracion;
    private int cantidadAsignaturas;
    private String numeroResolucion;
    private String estadoVigencia;
    private String fechaCaducidad;

    @OneToMany
    private List<Alumno> alumnos = new ArrayList<>();

    public Tecnicatura() {
    }

    @Override
    public void agregarObservador(Alumno observador) {
        alumnos.add(observador);
    }

    @Override
    public void eliminarObservador(Alumno observador) {
        alumnos.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Alumno alumno : alumnos) {
            alumno.actualizar(estadoVigencia, fechaCaducidad);
        }
    }

    // Método para simular algún cambio en la tecnicatura
    public void actualizarTecnicatura() {        
        notificarObservadores(); // Notificar a todos los alumnos que hubo un cambio
    }
}
