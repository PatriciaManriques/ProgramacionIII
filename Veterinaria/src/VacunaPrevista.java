
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */
public class VacunaPrevista {
    
    Enfermedad enfermedad;
    Date fechaVacuna;

    public VacunaPrevista(Enfermedad enfermedad, Date fechaVacuna) {
        this.enfermedad = enfermedad;
        this.fechaVacuna = fechaVacuna;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Date getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }
    
    
}
