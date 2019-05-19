package br.exercicio.semaforo.base;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Simulador
 *
 * @author mariojp
 */
public class Simulador extends JFrame {

    private List<Semaforo> semaforos = new ArrayList<Semaforo>();

    public List<Semaforo> getSemaforos() {
        return semaforos;
    }

    public Simulador(List<Semaforo> semaforos, int largura, int altura)  {
        super("Simulador");
        setLayout(new FlowLayout());
        for(Semaforo semaforo : semaforos) {
            add(semaforo);
        }
        this.setSize(largura, altura);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
