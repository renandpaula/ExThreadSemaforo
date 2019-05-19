package br.exercicio.semaforo.base;

import javax.swing.*;
import java.awt.*;


/**
 * Representa uma Luz
 *
 * @author mariojp
 */
public class Luz extends JPanel {

    private Color cor = null;

    public Luz(Color color){
        this.cor = color;
    }

    public void setCor(Color cor) {
        this.cor = cor;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(cor);
        g.fillOval(0,0,20,20);
    }

    public Dimension getPreferredSize() {
        return new Dimension(20,20);
    }

}
