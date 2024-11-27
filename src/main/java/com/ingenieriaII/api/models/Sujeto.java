package com.ingenieriaII.api.models;

public interface Sujeto {
    void agregarObservador(Alumno observador);
    void eliminarObservador(Alumno observador);
    void notificarObservadores();
}
