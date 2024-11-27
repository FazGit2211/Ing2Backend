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
    private boolean estadoResolucion;
    @Override
    public void actualizar(String numResolucion) {
        System.out.println("actualizarce");
        if(!numResolucion.equals(this.resolucion)){
            this.estadoResolucion = false;
        }
    }
    
    
}
