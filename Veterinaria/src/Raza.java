/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */
public class Raza {
    
    String descripcion;
    Especie especie;
    String nombreDeRaza;

    public Raza() {
    }

    
    public Raza(String descripcion, Especie especie, String nombreDeRaza) {
        this.descripcion = descripcion;
        this.especie = especie;
        this.nombreDeRaza = nombreDeRaza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getNombreDeRaza() {
        return nombreDeRaza;
    }

    public void setNombreDeRaza(String nombreDeRaza) {
        this.nombreDeRaza = nombreDeRaza;
    }
    
    
    
    
}
