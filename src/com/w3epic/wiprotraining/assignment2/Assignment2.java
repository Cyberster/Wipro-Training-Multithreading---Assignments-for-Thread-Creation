/*
store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. 
If the random colour index matches to red stop display.
Note: perform this task by implementing Runnable interface
 */

package com.w3epic.wiprotraining.assignment2;

import java.util.Random;

public class Assignment2 implements Runnable {

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		Thread t1 = new Thread(assignment2);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}
