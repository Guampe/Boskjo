import java.util.Arrays;

public class Partida {
    
    int carta[] = new int [6];
    int aleaCarta;
    int aleaCarta2;
    int sumaCartas;
    int arraque;
    boolean continua;
    boolean apuesta;
    int valorApuesta;
    boolean ganador;

    public void repartirCarta() {
        this.aleaCarta = (int) (Math.round(Math.random() * 11));
        System.out.println(aleaCarta);
        for (int aleaCarta2 = 0; aleaCarta2 < carta.length; aleaCarta2 ++)
        carta[aleaCarta2] = (int) (Math.round(Math.random() * 11));

    
    }
    
    public void test() {
        System.out.println(Arrays.toString(carta));

    
    }

 

}
