package com.ingenieriaII.api.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Alumno extends Persona implements Observador{

    private String tituloSecundario;
    private String escuelaSecundaria;
    private Integer anioEgreso;

    public Alumno(Integer id,String nombre,String apellido,String dniPasaporte,String genero,String email,String telefono,String partido,String calle,String numero,String departamento,String pasillo,String pais,String localidad,Integer piso,String tituloSecundario, String escuelaSecundaria, Integer anioEgreso) {
        super(id,nombre,apellido,dniPasaporte,genero,email,telefono,partido,calle,numero,departamento,pasillo,pais,localidad,piso);
        this.tituloSecundario = tituloSecundario;
        this.escuelaSecundaria = escuelaSecundaria;
        this.anioEgreso = anioEgreso;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("actualizarce");
    }
    
    
}
