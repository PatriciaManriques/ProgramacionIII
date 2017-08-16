
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pato
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Especie gato = new Especie("Felino", "Gato");
        Especie perro = new Especie("Canino", "Perro");
        Raza pitbull = new Raza("Perro malo", perro, "Pitbull");
        Raza salchicha = new Raza("Perro largo", perro, "Salchicha");
        Raza caniche = new Raza("Perro ruludo", perro, "Caniche");
        Raza siames = new Raza("Ojos celeste", gato, "Siames");
        Raza persa = new Raza("Cara achatada", gato, "Persa");
        
        

        Paciente p1 = new Paciente();
        p1.setCodigo(0);
        p1.setColorDePelo("negro");
        p1.setPesoActual(22);
        p1.setRaza(pitbull);
        p1.setFechaDeNacimiento(new Date(2009, Calendar.FEBRUARY, 10));
        List<Visita> visitaP1 = new ArrayList<Visita>();
        visitaP1.add(new Visita(p1, "Parvovirus", 0f, new Date(2011, Calendar.JULY, 3)));
        visitaP1.add(new Visita(p1, "Peluqueria", 0f, new Date(2011, Calendar.JUNE, 16)));
        visitaP1.add(new Visita(p1, "Parasitos", 0f, new Date(2011, Calendar.JUNE, 26)));
        p1.setVisita(visitaP1);
        
        Enfermedad Rabia = new Enfermedad("Espuma blanca por la boca","Rabia");
        Enfermedad Parasitos = new Enfermedad("Picazon","Parasitos");
        Enfermedad Moquillo = new Enfermedad("Catarro","Moquillo");
        
        VacunaPrevista vp1 = new VacunaPrevista(Rabia, new Date(2011, Calendar.MARCH,31));
        VacunaPrevista vp2 = new VacunaPrevista(Parasitos, new Date(2011, Calendar.APRIL,30));
        VacunaPrevista vp3 = new VacunaPrevista(Moquillo, new Date(2011, Calendar.MAY,31));
        
        VacunaColocada vc1 = new VacunaColocada(vp1, new Date(2011, Calendar.APRIL, 05));
        VacunaColocada vc2 = new VacunaColocada(vp1, new Date(2011, Calendar.MAY, 05));
        VacunaColocada vc3 = new VacunaColocada(vp1, new Date(2011, Calendar.JUNE, 05));
        
        p1.setCalendarioDeVacunacion(new ArrayList<VacunaPrevista>());
        
        p1.getCalendarioDeVacunacion().add(vp1);
        p1.getCalendarioDeVacunacion().add(vp2);
        p1.getCalendarioDeVacunacion().add(vp3);
        
        p1.setVacunasColocadas(new ArrayList<VacunaColocada>());
      
        p1.getVacunasColocadas().add(vc1);
        p1.getVacunasColocadas().add(vc2);
        p1.getVacunasColocadas().add(vc3);
                
        
        Paciente p2 = new Paciente();
        p2.setCodigo(1);
        p2.setColorDePelo("negro");
        p2.setPesoActual(16);
        p2.setRaza(pitbull);
        p2.setFechaDeNacimiento(new Date(2008, Calendar.FEBRUARY, 11));
        List<Visita> visitaP2 = new ArrayList<Visita>();
        visitaP2.add(new Visita(p2, "Vomito", 0f, new Date(2011, Calendar.JULY, 3)));
        visitaP2.add(new Visita(p2, "Vacuna", 0f, new Date(2011, Calendar.JUNE, 16)));
        visitaP2.add(new Visita(p2, "Parasitos", 0f, new Date(2011, Calendar.JUNE, 26)));
        p2.setVisita(visitaP2);
        
      
     //   p2.getCalendarioDeVacunacion().add(vp1);
     //   p2.getCalendarioDeVacunacion().add(vp2);
     //   p2.getCalendarioDeVacunacion().add(vp3);
        
        Paciente p3 = new Paciente();
        p3.setCodigo(0);
        p3.setColorDePelo("blanco");
        p3.setPesoActual(15);
        p3.setRaza(pitbull);
        p3.setFechaDeNacimiento(new Date(2009, Calendar.FEBRUARY, 10));
        List<Visita> visitaP3 = new ArrayList<Visita>();
        visitaP3.add(new Visita(p3, "Parvovirus", 0f, new Date(2011, Calendar.JULY, 3)));
        visitaP3.add(new Visita(p3, "Vacuna", 0f, new Date(2011, Calendar.JUNE, 16)));
        visitaP3.add(new Visita(p3, "Parasitos", 0f, new Date(2011, Calendar.JUNE, 26)));
        p3.setVisita(visitaP3);
        
        
//        p3.getCalendarioDeVacunacion().add(vp1);
//        p3.getCalendarioDeVacunacion().add(vp2);
//        p3.getCalendarioDeVacunacion().add(vp3);
        
        Paciente p4 = new Paciente();
        p4.setCodigo(0);
        p4.setColorDePelo("negro");
        p4.setPesoActual(20);
        p4.setRaza(pitbull);
        p4.setFechaDeNacimiento(new Date(2009, Calendar.FEBRUARY, 10));
        List<Visita> visitaP4 = new ArrayList<Visita>();
        visitaP4.add(new Visita(p4, "Parvovirus", 0f, new Date(2011, Calendar.JULY, 3)));
        visitaP4.add(new Visita(p4, "Peluqueria", 0f, new Date(2011, Calendar.JUNE, 16)));
        visitaP4.add(new Visita(p4, "Parasitos", 0f, new Date(2011, Calendar.JUNE, 26)));
        p4.setVisita(visitaP4);

        
//        p4.getCalendarioDeVacunacion().add(vp1);
//        p4.getCalendarioDeVacunacion().add(vp2);
//        p4.getCalendarioDeVacunacion().add(vp3);
        
        GestorPaciente gestorPaciente = new GestorPaciente();
        
        gestorPaciente.setListaPaciente(new ArrayList<Paciente>());
        gestorPaciente.getListaPaciente().add(p1);
        //gestorPaciente.getListaPaciente().add(p2);
       // gestorPaciente.getListaPaciente().add(p3);
        //gestorPaciente.getListaPaciente().add(p4);
        
        //Raza resultado = gestorPaciente.consultaPorEnfermedad("Parvovirus");
        
        //System.out.println("Raza resultado= " + resultado.getNombreDeRaza() );
        
        int cantidadDeAnimalesConVacunasAlDia = gestorPaciente.ConsultaVacunaAlDia(22f ,new Date(2011, Calendar.MARCH, 3) , new Date(2011, Calendar.JULY, 3));
        System.out.println("Cantidad de animales mayores de 25 kg con vacunas al dia= " + cantidadDeAnimalesConVacunasAlDia );
        
        
    }

}
