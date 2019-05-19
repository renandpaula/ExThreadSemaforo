package br.exercicio.semaforo;

import br.exercicio.semaforo.base.Semaforo;
import br.exercicio.semaforo.base.Simulador;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * Dois Semaforos voce deve sincronizalos como um cruzamento
 *
 */
public class Cenario2 {


    Semaforo semaforo1 = new Semaforo(1);
    Semaforo semaforo2 = new Semaforo(2);

    public Cenario2() {
        List<Semaforo> semaforos = new ArrayList<Semaforo>();
        semaforos.add(semaforo1);
        semaforos.add(semaforo2);

        Simulador simulador = new Simulador(semaforos,300,150);
        new Thread(semaforo1).start();
        new Thread(semaforo2).start();


    }

    public static void main(String[] args) {
        new Cenario2();
    }
}
