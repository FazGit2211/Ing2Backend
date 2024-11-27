package com.ingenieriaII.api.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String nombre;
    private String apellido;
    private String dniPasaporte;
    private String genero;
    private String email;
    private String telefono;
    private String partido;
    private String calle;
    private String numero;
    private String departamento;
    private String pasillo;
    private String pais;
    private String localidad;
    private Integer piso;
    private String fechaNacimiento;
}
