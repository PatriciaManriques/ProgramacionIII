
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pato
 */
public class GestorPaciente {

    private List<Paciente> listaPaciente;

    public GestorPaciente() {
    }

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(List<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }

    public Raza consultaPorEnfermedad(String motivoVisita) {

        HashMap<Raza, Integer> cantidadVisita = new HashMap<Raza, Integer>();

        Raza RazaResultado = new Raza();

        for (Paciente i : listaPaciente) {
            int cantidadVisitas=0;
            for (Visita j : i.getVisita()) {

                if (j.motivoDeVisita.equals(motivoVisita)) {
                    
                    
                    if(null == cantidadVisita.get(i.getRaza())){
                        cantidadVisitas=0;
                    }
                    cantidadVisitas++;

                    cantidadVisita.put(i.getRaza(), cantidadVisitas);
                }

            }

        }
        int max = 0;
        for (Map.Entry<Raza, Integer> entry : cantidadVisita.entrySet()) {
            Raza key = entry.getKey();
            Integer value = entry.getValue();
            if (value > max) {
                RazaResultado = key;
                max = value;
            }
        }

        return RazaResultado;
    }
    
    public int ConsultaVacunaAlDia(float pesoKg, Date fechaDesde, Date fechaHasta){
    	int cont=0;
    	int resultado=0;
    	
    	for(Paciente item : listaPaciente){
    		if(item.getPesoActual() > pesoKg){
    			cont=0;
    			for(VacunaColocada vacuna : item.getVacunasColocadas()){
    				if(fechaDesde.before(vacuna.fecha) && fechaHasta.after(vacuna.fecha)){
    					 cont++;
    				}
    			
    			}
    			if(item.getCalendarioDeVacunacion().size() == cont){
    				resultado++;
    			}
    		}
    		
    	}
    	
    	
    	return resultado;
    }

}
