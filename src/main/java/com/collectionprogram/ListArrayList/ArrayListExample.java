package com.collectionprogram.ListArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("ONE");

		list.add("TWO");

		list.add("THREE");

		list.add(1, "FOUR");

		// Method 1: Using for loop

		for (String string : list) {

			System.out.println(string);
		}
		System.out.println(".........................");

		// Method 2: Using while loop

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println(".........................");
		
		// Method 3: Using for each loop with Lambda expressions
		
		list.forEach(s -> System.out.println(s));
		
		
		// Method 4: Using Enumeration Iterator 
		System.out.println(".........................");
		
			Enumeration<String> es= Collections.enumeration(list);
			while (es.hasMoreElements()) {
				String string = (String) es.nextElement();
				System.out.println(string);
			}
			
			System.out.println(".........................");
			
			// Method 5: Using LIST Iterator
			
			ListIterator<String> ls=list.listIterator();
			while (ls.hasNext()) {
				String string = (String) ls.next();
				System.out.println(string);
			}
			
			System.out.println("........g.................");
			while (ls.hasPrevious()) {
			System.out.println( ls.previous());
						}
	}

}
