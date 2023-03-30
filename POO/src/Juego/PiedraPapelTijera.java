package Juego;

import java.util.Scanner;
import java.util.Random;


public class PiedraPapelTijera implements Juego{

    private String nombreJugador;
    private int Jugador;
    private int Maquina;
    
    public PiedraPapelTijera(){

    }

        Scanner azar = new Scanner(System.in);

    public PiedraPapelTijera (int Jugador, int Maquina) {
        this.Jugador = Jugador;
        this.Maquina = Maquina;
    }

    public void Iniciar(){
        azar.nextLine();
        System.out.println("digite su nombre completo");
        nombreJugador = azar.nextLine();

        
    }

    public void Jugar(){

        Random probabilidad = new Random();
        Maquina = probabilidad.nextInt(3);
        Maquina+=1;

        System.out.println("--------- Elija ---------");
        System.out.println("1.Piedra / 2.Papel / 3.Tijera");
        Jugador = azar.nextInt();

    }

    public void Finaliza(){

        System.out.println("Jugador: " + nombreJugador);
        System.out.println("Su elección: " + Jugador);
        System.out.println("Elección de la Maquina: " + Maquina);
        if (Jugador==Maquina){
            System.out.println("Empate");
        } else if (Jugador==1 && Maquina==2) {
            System.out.println("Perdiste");
        } else if (Jugador==1 && Maquina==3){
            System.out.println("Ganaste");
        } else if (Jugador==2 && Maquina==3) {
            System.out.println("Perdiste");
        } else if (Jugador==2 && Maquina==1){
            System.out.println("Ganaste");
        } else if (Jugador==3 && Maquina==1) {
            System.out.println("Perdiste");
        } else if (Jugador==3 && Maquina==2){
            System.out.println("Ganaste");
        } else{
            System.out.println("Elección no valida");
        }

        System.out.println("Gracias por utilizar nuestros recursos");

        azar.close();
    }

}
