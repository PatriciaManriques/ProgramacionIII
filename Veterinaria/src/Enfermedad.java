/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */
public class Enfermedad {
    
    String descripcionEnfermedad;
    String nombreEnfermedad;

    public Enfermedad(String descripcionEnfermedad, String nombreEnfermedad) {
        this.descripcionEnfermedad = descripcionEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getDescripcionEnfermedad() {
        return descripcionEnfermedad;
    }

    public void setDescripcionEnfermedad(String descripcionEnfermedad) {
        this.descripcionEnfermedad = descripcionEnfermedad;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }
    
    
}
