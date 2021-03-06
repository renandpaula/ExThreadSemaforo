package br.exercicio.semaforo.base;

import java.util.ArrayList;
import java.util.List;

public class Simulador {

	private List<Farol> listaFarol =  new ArrayList<Farol>();
	private Farol farol = new Farol();
	private Farol farol2 = new Farol();
	private Farol farol3 = new Farol();
	
	
	public Simulador(List<Farol> listaFarol) {
		this.listaFarol = listaFarol;
	}


	public void simularCenario1() {
		Farol farol = listaFarol.get(0);
		farol.setLuz(1);
		farol.setTipo(1);
		new Thread(farol).start();
	}

	public synchronized void simularCenario2() throws InterruptedException {
		Farol farol = listaFarol.get(0);
		Farol farol2 = listaFarol.get(1);
		farol.setLuz(3);
		farol.setTipo(1);
		farol2.setLuz(1);
		farol2.setTipo(2);
		Thread t1 = new Thread(farol);
		t1.start();
		
		Thread t2 =  new Thread(farol2);
		t2.start();
	}

	public void simularCenario3() {
		
		Farol farol = listaFarol.get(0);
		Farol farol2 = listaFarol.get(1);
		Farol farol3 = listaFarol.get(2);
		farol.setLuz(1);
		farol.setTipo(1);
		farol2.setLuz(1);
		farol2.setTipo(1);
		farol3.setLuz(1);
		farol3.setTipo(1);
		new Thread(farol3).start();
		new Thread(farol2).start();
		new Thread(farol).start();
				
	}

}
