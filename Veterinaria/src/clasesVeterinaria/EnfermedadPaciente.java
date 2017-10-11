package clasesVeterinaria;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnfermedadPaciente
 *
 */
@Entity

public class EnfermedadPaciente implements Serializable {

	   
	@Id
	private long idEnfermedadPaciente;
	private Enfermedad enfermedad;
	private LocalDate fechaEnfermedad;
	private ArrayList<Medicacion> medicacion;
	private static final long serialVersionUID = 1L;

	public EnfermedadPaciente() {
		super();
	}   
	public long getIdEnfermedadPaciente() {
		return this.idEnfermedadPaciente;
	}

	public void setIdEnfermedadPaciente(long idEnfermedadPaciente) {
		this.idEnfermedadPaciente = idEnfermedadPaciente;
	}   
	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}   
	public LocalDate getFechaEnfermedad() {
		return this.fechaEnfermedad;
	}

	public void setFechaEnfermedad(LocalDate fechaEnfermedad) {
		this.fechaEnfermedad = fechaEnfermedad;
	}   
	public ArrayList<Medicacion> getMedicacion() {
		return this.medicacion;
	}

	public void setMedicacion(ArrayList<Medicacion> medicacion) {
		this.medicacion = medicacion;
	}
   
}
