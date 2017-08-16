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
public class Visita {
    
    Paciente paciente;
    String motivoDeVisita;
    float pesoEnLaVisita;
    Date fechaVisita;

    public Visita(Paciente paciente, String motivoDeVisita, float pesoEnLaVisita, Date fechaVisita) {
        this.paciente = paciente;
        this.motivoDeVisita = motivoDeVisita;
        this.pesoEnLaVisita = pesoEnLaVisita;
        this.fechaVisita = fechaVisita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivoDeVisita() {
        return motivoDeVisita;
    }

    public void setMotivoDeVisita(String motivoDeVisita) {
        this.motivoDeVisita = motivoDeVisita;
    }

    public float getPesoEnLaVisita() {
        return pesoEnLaVisita;
    }

    public void setPesoEnLaVisita(float pesoEnLaVisita) {
        this.pesoEnLaVisita = pesoEnLaVisita;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

  
    
}
