
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
public class Dolencia {
    
    String diagnostico;
    Dosis dosis;
    Date fecha;
    Medicamento medicamento;
    Enfermedad nombreEnfermedad;

    public Dolencia(String diagnostico, Dosis dosis, Date fecha, Medicamento medicamento, Enfermedad nombreEnfermedad) {
        this.diagnostico = diagnostico;
        this.dosis = dosis;
        this.fecha = fecha;
        this.medicamento = medicamento;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Dosis getDosis() {
        return dosis;
    }

    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Enfermedad getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(Enfermedad nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }
    
    
}
