/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */ 
 import java.util.Date;
 
public class VacunaColocada {
    
    VacunaPrevista calendarioDeVacunacionPrevisto;
    Date fecha;

    public VacunaColocada(VacunaPrevista calendarioDeVacunacionPrevisto, Date fecha) {
        this.calendarioDeVacunacionPrevisto = calendarioDeVacunacionPrevisto;
        this.fecha = fecha;
    }

    public VacunaPrevista getCalendarioDeVacunacionPrevisto() {
        return calendarioDeVacunacionPrevisto;
    }

    public void setCalendarioDeVacunacionPrevisto(VacunaPrevista calendarioDeVacunacionPrevisto) {
        this.calendarioDeVacunacionPrevisto = calendarioDeVacunacionPrevisto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
