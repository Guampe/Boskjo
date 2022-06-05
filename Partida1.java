import java.util.Arrays;

public class Partida1 extends Repartir {
    
    public void puntaje() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        puntosJugador1[0] = repartir.cartaJugador1;
        puntosJugador2[0] = repartir.cartaJugador2;
        System.out.println(Arrays.toString(puntosJugador1));
        System.out.println(Arrays.toString(puntosJugador2));
    }



 /*   
    public void repartirCarta1() {
        primeraCarta1 = (int) (Math.round(Math.random() * 11));
        System.out.println(primeraCarta1);
    }


    public void repartirCarta2() {
        primeraCarta2 = (int) (Math.round(Math.random() * 11));
        if (primeraCarta2 != primeraCarta1) {
            System.out.println(primeraCarta2);
        } else {
            repartirCarta2();
        }

    }
*/
}
