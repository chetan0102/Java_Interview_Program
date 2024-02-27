package com.extraprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maximum3numbersAndminimum3 {

	public static void main(String[] args) {

		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 88, 71, 75, 44, 56, 15, 24, 75, 31, 89);
		 
		 System.out.println("3 min no.");
		 
		 listOfIntegers.stream().sorted().limit(3).forEach(System.out:: println);
         
		 System.out.println("4 max no.");
		 
		 listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(4).forEach(System.out::println);
		 
		 System.out.println("4 max  no. remove duplicate as well");
		 
		 listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(5).distinct().forEach(System.out::println); // remove duplicate as well
	}

}
