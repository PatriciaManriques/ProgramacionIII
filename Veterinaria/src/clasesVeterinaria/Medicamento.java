package clasesVeterinaria;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicamento
 *
 */
@Entity

public class Medicamento implements Serializable {

	   
	@Id
	private long idMedicamento;
	private String codigo;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Medicamento() {
		super();
	}   
	public long getIdMedicamento() {
		return this.idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}   
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
