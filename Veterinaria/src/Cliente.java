/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    String apellidoDeFamilia;
    int codigo;
    List<Persona> integrantesFamilia;
    Localidad localidad;
    String nroCuentaBancaria;
    List<Paciente> listadoPacientes = new ArrayList<Paciente>();
    public Cliente() {
    }

    public Cliente(String apellidoDeFamilia, int codigo, List<Persona> integrantesFamilia, Localidad localidad, String nroCuentaBancaria, List<Paciente> listadoPacientes) {
        this.apellidoDeFamilia = apellidoDeFamilia;
        this.codigo = codigo;
        this.integrantesFamilia = integrantesFamilia;
        this.localidad = localidad;
        this.nroCuentaBancaria = nroCuentaBancaria;
        this.listadoPacientes = listadoPacientes;
    }

    public String getApellidoDeFamilia() {
        return apellidoDeFamilia;
    }

    public void setApellidoDeFamilia(String apellidoDeFamilia) {
        this.apellidoDeFamilia = apellidoDeFamilia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getIntegrantesFamilia() {
        return integrantesFamilia;
    }

    public void setIntegrantesFamilia(List<Persona> integrantesFamilia) {
        this.integrantesFamilia = integrantesFamilia;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public String getNroCuentaBancaria() {
        return nroCuentaBancaria;
    }

    public void setNroCuentaBancaria(String nroCuentaBancaria) {
        this.nroCuentaBancaria = nroCuentaBancaria;
    }

    public List<Paciente> getListadoPacientes() {
        return listadoPacientes;
    }

    public void setListadoPacientes(List<Paciente> listadoPacientes) {
        this.listadoPacientes = listadoPacientes;
    }

    
   
    
}
