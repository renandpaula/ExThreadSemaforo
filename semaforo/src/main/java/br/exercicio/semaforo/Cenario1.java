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


public class Cenario1 extends JFrame {
	
	private JLabel farolVermelho = new JLabel();
	private JLabel farolAmarelo = new JLabel(); 
	private JLabel farolVerde = new JLabel(); 
	private JLabel paisagem = new JLabel(); 
	private JLabel carro = new JLabel(); 
	private JPanel cenario = new JPanel();
	private Farol farol = new Farol(); 
	private List<Farol> listaFarol = new ArrayList<Farol>();
	

	private static final long serialVersionUID = 1L;

	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					Cenario1 frame = new Cenario1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public Cenario1() {
		
		constroiCenario();

		
		Simulador simulador = new Simulador(listaFarol);
		simulador.simularCenario1();

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
		
		/* Farol Amarelo 1*/
		farolAmarelo.setIcon(new ImageIcon("imagens/semaforos/amarelo/semaforo4.png"));
		farolAmarelo.setBounds(195, 360, 43, 128);
		farolAmarelo.setVisible(false);
		cenario.add(farolAmarelo);
		farol.setFarolAmarelo(farolAmarelo);
		
		/* Farol Verde 1*/
		farolVerde.setIcon(new ImageIcon("imagens/semaforos/verde/semaforo4.png"));
		farolVerde.setBounds(195, 360, 43, 128);
		farolVerde.setVisible(false);
		cenario.add(farolVerde);
		farol.setFarolVerde(farolVerde);
		
		/* Paisagem */
		paisagem.setBounds(0, 0, 700, 700);
		paisagem.setIcon(new ImageIcon("imagens/fundo.png"));
		cenario.add(paisagem);
		
		/* Carro 1 */
		carro.setIcon(new ImageIcon("imagens/carros/carro4.png"));
		carro.setBounds(54, 381, 115, 64);
		carro.setVisible(true);
		cenario.add(carro);
		farol.setCarro(carro);
		
		/* Adiciona os farois na lista */
		listaFarol.add(farol);
		
	}
	
	

}
