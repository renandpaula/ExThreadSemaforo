package br.exercicio.semaforo.base;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JLabel;

public class Farol implements Runnable {

	private JLabel carro;
	private JLabel farolVermelho;
	private JLabel farolVerde;
	private JLabel farolAmarelo;
	private int tipo;
	private int luz;
	private boolean farolAberto = false;
	
	public Farol() {
		
	}
	
	public Farol(JLabel carro, JLabel semaforoVermelho, JLabel semaforoVerde, JLabel semaforoAmarelo) {
		this.carro = carro;
		this.farolVermelho = semaforoVermelho;
		this.farolVerde = semaforoVerde;
		this.farolAmarelo = semaforoAmarelo;
	}

	public Farol(JLabel carro, JLabel semaforoVermelho, JLabel semaforoVerde, JLabel semaforoAmarelo, int luz,
			int tipo) {
		this.carro = carro;
		this.farolVermelho = semaforoVermelho;
		this.farolVerde = semaforoVerde;
		this.farolAmarelo = semaforoAmarelo;
		this.luz = luz;
		this.tipo = tipo;
	}
	
	

	public JLabel getCarro() {
		return carro;
	}

	public void setCarro(JLabel carro) {
		this.carro = carro;
	}

	public JLabel getFarolVermelho() {
		return farolVermelho;
	}

	public void setFarolVermelho(JLabel farolVermelho) {
		this.farolVermelho = farolVermelho;
	}

	public JLabel getFarolVerde() {
		return farolVerde;
	}

	public void setFarolVerde(JLabel farolVerde) {
		this.farolVerde = farolVerde;
	}

	public JLabel getFarolAmarelo() {
		return farolAmarelo;
	}

	public void setFarolAmarelo(JLabel farolAmarelo) {
		this.farolAmarelo = farolAmarelo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getLuz() {
		return luz;
	}

	public void setLuz(int luz) {
		this.luz = luz;
	}

	public boolean isFarolAberto() {
		return farolAberto;
	}

	public void setFarolAberto(boolean farolAberto) {
		this.farolAberto = farolAberto;
	}

	public void run() {

		while (true) {

			if (farolAberto) {
				this.acelerarCarro();
			}

			try {  
				
				switch (luz) {
				case 1: // 1 = Farol Vermelho
					farolVermelho.setVisible(true);
					farolAmarelo.setVisible(false);
					farolVerde.setVisible(false);
					this.luz = 3;
					farolAberto = false;
					Thread.sleep(6800);
					break;
					
				case 2: // 2 = Farol Amarelo
					farolVermelho.setVisible(false);
					farolAmarelo.setVisible(true);
					farolVerde.setVisible(false);
					this.luz = 1;
					farolAberto = false;
					Thread.sleep(1800);
					break;
					
				case 3: // 3 = Farol Verde
					farolVermelho.setVisible(false);
					farolAmarelo.setVisible(false);
					farolVerde.setVisible(true);
					this.luz = 2;
					farolAberto = true;
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void acelerarCarro() {
		Rectangle posicao;
		posicao = carro.getBounds();
		int aux = 0;
		Random random = new Random();

		switch (tipo) {
		
		case 1: // Carro anda no eixo X (horizontal)
			while (aux < 2) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (aux == 1) {
					posicao.x = (posicao.x) + (random.nextInt(2));
					if (posicao.x >= 48) {
						aux = 2;
					}
				}
				posicao.x = (posicao.x) + (random.nextInt(5));
				carro.setBounds(posicao);
				if (posicao.x >= 800) {
					posicao.x = -100;
					aux = 1;
				}

			}
			break;
			
		case 2: // Carro anda no eixo Y (Vertical)
			while (aux < 2) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (aux == 1) {
					posicao.y = (posicao.y) - (random.nextInt(2));
					if (posicao.y <= 549) {
						aux = 2;
					}
				}
				posicao.y = (posicao.y) - (random.nextInt(5));
				carro.setBounds(posicao);
				if (posicao.y <= -100) {
					posicao.y = 800;
					aux = 1;
				}
			}
			break;
		}

	}
	

}
