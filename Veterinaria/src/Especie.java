/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */
public class Especie {
    
    String descripcionEspecie;
    String nombreEspecie;

    public Especie(String descripcionEspecie, String nombreEspecie) {
        this.descripcionEspecie = descripcionEspecie;
        this.nombreEspecie = nombreEspecie;
    }

    public String getDescripcionEspecie() {
        return descripcionEspecie;
    }

    public void setDescripcionEspecie(String descripcionEspecie) {
        this.descripcionEspecie = descripcionEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }
    
    
}
