package com.stringcodesprogram;

public class ProveStringsAreImmutable {
	
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";
	
	System.out.println(s1==s2);
	
	s1 =s1 + "J2EE";
	
	System.out.println(s1 == s2);
	
	System.out.println(s1);
	
	String ss = new String("JAVA");
	 
    System.out.println(ss);         //Output : JAVA

    ss.concat("J2EE");

    System.out.println(ss);         //Output : JAVA
	
	}

}
