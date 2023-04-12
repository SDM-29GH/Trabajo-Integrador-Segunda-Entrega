package pronosticoApp.servicio;

import pronosticoApp.entidades.Equipo;
import pronosticoApp.entidades.Partido;
import pronosticoApp.entidades.Pronostico;
import pronosticoApp.enumeraciones.ResultadoEnum;

public class pronosticoServicio {

    public static void listaPronostico(){
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        Partido partido1 = new Partido();
        Pronostico pronostico1 = new Pronostico();

        pronostico1.setEquipo(equipo1);
        pronostico1.setEquipo(equipo2);
        pronostico1.setPartido(partido1);
        pronostico1.setResultado(ResultadoEnum.GANADOR);

        System.out.println(pronostico1.getResultado());
    }
}
