package com.ingenieriaII.api.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Alumno extends Persona implements Observador{

    private String tituloSecundario;
    private String escuelaSecundaria;
    private Integer anioEgreso;
    private String resolucion;
    private String estadoResolucion;
    private String fechaCaducidadResolucion;
    @Override
    public void actualizar(String estadoVigencia, String fechaCaducidad) {
        System.out.println("actualizarce");
        if(!estadoVigencia.equals(estadoResolucion)){
            this.estadoResolucion = estadoVigencia;
            this.fechaCaducidadResolucion = fechaCaducidad;
        }
    }
    
    
}
