package view;

import controller.Caminhando;

public class Main {

	final static int dT = 200;
	            

	public static void main(String[] args) {
		for (int threadId = 1; threadId <= 4; threadId++) {
			new Caminhando (threadId, dT).start();
			
		}
	}

}
