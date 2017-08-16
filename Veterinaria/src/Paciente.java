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
import java.util.List;

public class Paciente {

    private List<VacunaPrevista> calendarioDeVacunacion;
    int codigo;
    String colorDePelo;
    Date fechaDeNacimiento;
    List<Dolencia> historialPaciente;
    float pesoActual;
    Raza raza;
    List<VacunaColocada> vacunasColocadas;
    List<Visita> visita;

    public Paciente() {
    }

    
    public Paciente(List<VacunaPrevista> calendarioDeVacunacion, int codigo, String colorDePelo, Date fechaDeNacimiento, List<Dolencia> historialPaciente, float pesoActual, Raza raza, List<VacunaColocada> vacunasColocadas, List<Visita> visita) {
        this.calendarioDeVacunacion = calendarioDeVacunacion;
        this.codigo = codigo;
        this.colorDePelo = colorDePelo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.historialPaciente = historialPaciente;
        this.pesoActual = pesoActual;
        this.raza = raza;
        this.vacunasColocadas = vacunasColocadas;
        this.visita = visita;
    }

    public List<VacunaPrevista> getCalendarioDeVacunacion() {
        return calendarioDeVacunacion;
    }

    public void setCalendarioDeVacunacion(List<VacunaPrevista> calendarioDeVacunacion) {
        this.calendarioDeVacunacion = calendarioDeVacunacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public List<Dolencia> getHistorialPaciente() {
        return historialPaciente;
    }

    public void setHistorialPaciente(List<Dolencia> historialPaciente) {
        this.historialPaciente = historialPaciente;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public List<VacunaColocada> getVacunasColocadas() {
        return vacunasColocadas;
    }

    public void setVacunasColocadas(List<VacunaColocada> vacunasColocadas) {
        this.vacunasColocadas = vacunasColocadas;
    }

    public List<Visita> getVisita() {
        return visita;
    }

    public void setVisita(List<Visita> visita) {
        this.visita = visita;
    }
    
    
}
