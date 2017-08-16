/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pato
 */import java.util.Date;
public class Persona {
    
    String apellido;
    String direccionDePersona;
    String documento;
    Date   fechaDeNacimiento;
    String nombre;
    String telefono;

    public Persona(String apellido, String direccionDePersona, String documento, Date fechaDeNacimiento, String nombre, String telefono) {
        this.apellido = apellido;
        this.direccionDePersona = direccionDePersona;
        this.documento = documento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccionDePersona() {
        return direccionDePersona;
    }

    public void setDireccionDePersona(String direccionDePersona) {
        this.direccionDePersona = direccionDePersona;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
