package org.julie.runnable;

public class FirstRunnable {

	public static void main(String[] args) {

		//uses lambda expression!!!
		
		Runnable runnable = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
		};
		
		Thread t = new Thread(runnable);
		
		t.setName("Julie's thread");
		
		t.start();
		
		//t.run(); // NO NO NO!!!  this runs in the main thread rather than the one we named
	}
}
