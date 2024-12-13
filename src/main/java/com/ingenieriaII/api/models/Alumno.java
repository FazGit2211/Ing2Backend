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
    private String estadoVigenciaResolucion;
    private String fechaCaducidadResolucion;
    @Override
    public void actualizar(String numResolucion, String estadoVigencia, String fechaCaducidad) {
        System.out.println("actualizarce");
        if(!numResolucion.equals(this.resolucion)){
            this.estadoResolucion = false;
            this.estadoVigenciaResolucion = estadoVigencia;
            this.fechaCaducidadResolucion = fechaCaducidad;
        }
    }
    
    
}
