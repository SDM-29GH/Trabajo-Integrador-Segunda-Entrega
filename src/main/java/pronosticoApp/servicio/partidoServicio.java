package pronosticoApp.servicio;

import pronosticoApp.entidades.Equipo;
import pronosticoApp.entidades.Partido;

import java.util.ArrayList;

public class partidoServicio {

    public  static void listaPartido(){
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        System.out.println("PARTIDO");
        Partido partido1 = new Partido();

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);

        partido1.setEquipos(equipos);

        partido1.setEquipo1(equipo1);
        partido1.setGolesEquipo1(1);
        partido1.setEquipo2(equipo2);
        partido1.setGolesEquipo2(2);

        partido1.getEquipos();

        partido1.getEquipo1();
        partido1.getGolesEquipo1();
        partido1.getEquipo2();
        partido1.getGolesEquipo2();

        for (Equipo aux: equipos) {
            System.out.println(aux.getNombre());
        }
        System.out.println(partido1.getEquipos().add(equipo1) +" vs "+ partido1.getEquipos().add(equipo2));

        System.out.println("Equipo: " + partido1.getEquipo1().getNombre() + " Goles: " + partido1.getGolesEquipo1());
        System.out.println("Equipo: " + partido1.getEquipo2().getNombre() + " Goles: " + partido1.getGolesEquipo2());
        System.out.println(partido1.getEquipos().add(equipo1));
    }
}
