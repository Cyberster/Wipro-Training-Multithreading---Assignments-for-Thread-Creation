package com.w3epic.wiprotraining.assignment3.bean;

public class SalesPersons extends Thread {
	private String[] names = {"Bob", "Alice", "John", "Richard", "Harry"};
	
	@Override
	public void run() {		
		for (String name : names) {			
			System.out.println(name);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		//for (int i = 0; i < 100; i++) System.out.println(Thread.currentThread().getName() + ": " + i);
	}
}
