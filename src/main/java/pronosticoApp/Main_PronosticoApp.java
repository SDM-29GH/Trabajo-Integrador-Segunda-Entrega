package pronosticoApp;

import pronosticoApp.enumeraciones.ResultadoEnum;
import pronosticoApp.servicio.equipoServicio;
import pronosticoApp.servicio.partidoServicio;
import pronosticoApp.servicio.pronosticoServicio;
import pronosticoApp.servicio.rondaServicio;

import java.util.Locale;
import java.util.Scanner;

public class Main_PronosticoApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

            System.out.println("Bienvenido en pronostico APP");
            System.out.println("Realice su pronostico del partido: ");
            equipoServicio.listaEquipo();
            System.out.println("Pronostique cual equipo quiere que sea el ganador: ");
            String equipoGanador = entrada.next();
            if (equipoGanador.equalsIgnoreCase(ResultadoEnum.GANADOR.name())){
                System.out.println("Felicitaciones por acertar");
            }
            
        partidoServicio.listaPartido();
        rondaServicio.listaRonda();
        pronosticoServicio.listaPronostico();

    }
}
