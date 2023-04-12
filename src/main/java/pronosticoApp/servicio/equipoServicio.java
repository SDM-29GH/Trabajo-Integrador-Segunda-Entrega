package pronosticoApp.servicio;

import pronosticoApp.entidades.Equipo;

public class equipoServicio {

    public static void listaEquipo(){
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        equipo1.setNombre("Argentina");
        equipo1.setDescripcion("Equipo Sudamericano");
        equipo2.setNombre("Arabia Saudita");
        equipo2.setDescripcion("Equipo de Medio Oriente");

        equipo1.getNombre();
        equipo1.getDescripcion();
        equipo2.getNombre();
        equipo2.getDescripcion();
        System.out.println(equipo1.getNombre());
        System.out.println(equipo1.getNombre()+" vs "+equipo2.getNombre());
    }

}
