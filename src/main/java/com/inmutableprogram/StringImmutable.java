package com.inmutableprogram;

final class Student {

	// Member attributes of final class
	private final String name;
	private final int regNo;

	public Student(String name, int regNo) {

		// This keyword refers to current instance itself
		this.name = name;
		this.regNo = regNo;

	}

	// Method 1
	public String getName() {
		return name;
	}

	// Method 2
	public int getRegNo() {
		return regNo;
	}

}
	// Main class
public	class StringImmutable {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        Student s = new Student("ABC", 101);
	 
	        // Calling the above methods 1,2,3 of class1
	        // inside main() method in class2 and
	        // executing the print statement over them
	        System.out.println(s.getName());
	        System.out.println(s.getRegNo());
}
}
