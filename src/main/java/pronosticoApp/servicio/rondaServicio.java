package pronosticoApp.servicio;

import pronosticoApp.entidades.Partido;
import pronosticoApp.entidades.Ronda;

import java.util.ArrayList;

public class rondaServicio {

    public static void listaRonda(){
        Partido partido1 = new Partido();

        System.out.println("RONDA");
        Ronda ronda1 = new Ronda();
        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(partido1);

        ronda1.setNro("1");
        ronda1.setPartidos(partidos);

        ronda1.getNro();
        ronda1.getPartidos().add(partido1);

        System.out.println("Ronda: " + ronda1.getNro() + " Partido: " + ronda1.getPartidos().add(partido1));
    }
}
