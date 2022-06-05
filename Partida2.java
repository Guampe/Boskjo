import java.util.Arrays;

public class Partida2 extends Repartir {
    
    public void puntaje() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        if (puntosJugador1[0] != repartir.cartaJugador1 && puntosJugador2[0] != repartir.cartaJugador2){
            puntosJugador1[1] = repartir.cartaJugador1;
            puntosJugador2[1] = repartir.cartaJugador2;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            repartir.repartir();
        }

    }
}