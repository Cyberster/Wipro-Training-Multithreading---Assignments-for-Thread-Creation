/*
1. Create class of SalesPersons as a thread that will display fives sales persons name.
2. Create a class as Days as other Thread that has array of seven days.
3. Call the instance of SalesPersons in Days and start both the threads
4. suspend SalesPersons on Sunday and resume on wednesday 

Note: use suspend, resume methods from thread
 */

package com.w3epic.wiprotraining.assignment3;

import com.w3epic.wiprotraining.assignment3.bean.Days;

public class Assignment3 {
	//public static SalesPersons salesPersons;
	//public static Days days;
	
	public static void main(String[] args) {				
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();		
	}
}
