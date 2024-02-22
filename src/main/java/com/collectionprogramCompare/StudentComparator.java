package com.collectionprogramCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	int age;
	String name, address;

	public Student(int age, String name, String address) {

		this.age = age;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student> {

	// Method
	// Sorting in ascending order of age number
	public int compare(Student a, Student b) {

		return a.age - b.age; // a - b  // sort in ascending order 
		// b - a  // sort in descending order
	}
}

class Sortbyname implements Comparator<Student> {

	// Method
	// Sorting in ascending order of name
	public int compare(Student a, Student b) {

		return a.name.compareTo(b.name); // a - b  // sort in ascending order 
		// b - a  // sort in descending order
	}

}

public class StudentComparator {

	// Main driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
		ar.add(new Student(38, "Mayank", "london"));
		ar.add(new Student(31, "Anshul", "nyc"));
		ar.add(new Student(21, "Solanki", "jaipur"));
		ar.add(new Student(25, "Aggarwal", "Hongkong"));

		for (Student student : ar) 
			System.out.println(student);
		System.out.println(".........................");
		Collections.sort(ar, new Sortbyname());
		for (Student student : ar) {
			
			System.out.println(student);
		}
		System.out.println(".........................");
		Collections.sort(ar, new Sortbyroll());
		for (Student student : ar) {
			
			System.out.println(student);
		}
	}
}