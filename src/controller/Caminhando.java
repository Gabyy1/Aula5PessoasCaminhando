package controller;

public class Caminhando extends Thread {
	private int threadId;
	int distancia = 0;
	int distanciaT;
	public int passo;


	public Caminhando (int threadId, int dT) {
		
		this.distanciaT = dT;
		this.threadId = threadId;

	}
	
	public void Imprimir () {
		System.out.println("A pessoa " + threadId + " andou " + passo + " cm \t e percorreu " + distancia + " cm."); 
	}
	
	public void Caminhar () {
	
		
	    passo = (int) ((int) ((Math.random()*2.5)+4));
	    
	    distancia += passo;
		if (distancia > distanciaT) {
			distancia = distanciaT;
	   
		}
	}
	
	public void Porta (int threaId) {

		System.out.println("A pessoa " + threaId  + " chegou na porta.");
		
		int t = 0;
		
		t = (int) ((int) ((Math.random()*1.5)+1));
		
		System.out.println("A pessoa " + threaId  + " atravessou a porta.");
		
	}

	
	public void run () {
		while (distancia < distanciaT) {
			Caminhar();
			Imprimir();
		try {
				
				sleep (100);
				
			} catch ( InterruptedException e) {
			}
		} if (distancia >= distanciaT) {
			 Porta (threadId);
			
		
		}
	}
	}

