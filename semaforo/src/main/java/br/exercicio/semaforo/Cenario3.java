package br.exercicio.semaforo;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.exercicio.semaforo.base.Farol;
import br.exercicio.semaforo.base.Simulador;

public class Cenario3 extends JFrame {

	private JLabel farolVermelho = new JLabel();
	private JLabel farolVermelho2 = new JLabel();
	private JLabel farolVermelho3 = new JLabel();
	private JLabel farolAmarelo = new JLabel(); 
	private JLabel farolAmarelo2 = new JLabel(); 
	private JLabel farolAmarelo3 = new JLabel(); 
	private JLabel farolVerde = new JLabel(); 
	private JLabel farolVerde2 = new JLabel();
	private JLabel farolVerde3 = new JLabel();
	private JLabel paisagem = new JLabel(); 
	private JLabel carro = new JLabel(); 
	private JPanel cenario = new JPanel();
	private Farol farol = new Farol(); 
	private Farol farol2 = new Farol();
	private Farol farol3 = new Farol();
	private List<Farol> listaFarol = new ArrayList<Farol>();

	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cenario3 frame = new Cenario3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cenario3() {

		constroiCenario();

		Simulador simulador = new Simulador(listaFarol);
		simulador.simularCenario3();
	}

	public void constroiCenario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 5, 700, 720);
		setResizable(false);
		setContentPane(cenario);
		cenario.setLayout(null);

		/* Farol Vermelho 1 */
		farolVermelho.setIcon(new ImageIcon("imagens/semaforos/vermelho/semaforo4.png"));
		farolVermelho.setBounds(195, 360, 43, 128);
		cenario.add(farolVermelho);
		farol.setFarolVermelho(farolVermelho);

		/* Farol Vermelho 2 */
		farolVermelho2.setIcon(new ImageIcon("imagens/semaforos/vermelho/semaforo4.png"));
		farolVermelho2.setBounds(405, 360, 43, 128);
		cenario.add(farolVermelho2);
		farol2.setFarolVermelho(farolVermelho2);
		
		/* Farol Vermelho 3 */
		farolVermelho3.setIcon(new ImageIcon("imagens/semaforos/vermelho/semaforo4.png"));
		farolVermelho3.setBounds(605, 360, 43, 128);
		cenario.add(farolVermelho3);
		farol3.setFarolVermelho(farolVermelho3);

		/* Farol Amarelo 1*/
		farolAmarelo.setIcon(new ImageIcon("imagens/semaforos/amarelo/semaforo4.png"));
		farolAmarelo.setBounds(195, 360, 43, 128);
		farolAmarelo.setVisible(false);
		cenario.add(farolAmarelo);
		farol.setFarolAmarelo(farolAmarelo);

		/* Farol Amarelo 2 */
		farolAmarelo2.setIcon(new ImageIcon("imagens/semaforos/amarelo/semaforo4.png"));
		farolAmarelo2.setBounds(405, 360, 43, 128);
		farolAmarelo2.setVisible(false);
		cenario.add(farolAmarelo2);
		farol2.setFarolAmarelo(farolAmarelo2);
		
		/* Farol Amarelo 3 */
		farolAmarelo3.setIcon(new ImageIcon("imagens/semaforos/amarelo/semaforo4.png"));
		farolAmarelo3.setBounds(605, 360, 43, 128);
		farolAmarelo3.setVisible(false);
		cenario.add(farolAmarelo3);
		farol3.setFarolAmarelo(farolAmarelo3);

		/* Farol Verde 1 */
		farolVerde.setIcon(new ImageIcon("imagens/semaforos/verde/semaforo4.png"));
		farolVerde.setBounds(195, 360, 43, 128);
		farolVerde.setVisible(false);
		cenario.add(farolVerde);
		farol.setFarolVerde(farolVerde);

		/* Farol Verde 2 */
		farolVerde2.setIcon(new ImageIcon("imagens/semaforos/verde/semaforo4.png"));
		farolVerde2.setBounds(405, 360, 43, 128);
		farolVerde2.setVisible(false);
		cenario.add(farolVerde2);
		farol2.setFarolVerde(farolVerde2);
		
		/* Farol Verde 3 */
		farolVerde3.setIcon(new ImageIcon("imagens/semaforos/verde/semaforo4.png"));
		farolVerde3.setBounds(605, 360, 43, 128);
		farolVerde3.setVisible(false);
		cenario.add(farolVerde3);
		farol3.setFarolVerde(farolVerde3);

		/* Carro */
		carro.setIcon(new ImageIcon("imagens/carros/carro4.png"));
		carro.setBounds(54, 381, 115, 64);
		carro.setVisible(true);
		cenario.add(carro);
		farol.setCarro(carro);
		farol2.setCarro(carro);
		farol3.setCarro(carro);
		
		/* Paisagem */
		paisagem.setBounds(0, 0, 700, 700);
		paisagem.setIcon(new ImageIcon("imagens/fundo.png"));
		cenario.add(paisagem);

		/* Adiciona os farois na lista */
		listaFarol.add(farol);
		listaFarol.add(farol2);
		listaFarol.add(farol3);
	}

}
