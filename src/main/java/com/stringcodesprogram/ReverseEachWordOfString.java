package com.stringcodesprogram;

public class ReverseEachWordOfString {

	private static String reverseEachWordOfString(String string) {
		
	String []	Stringinwords = string.split(" ");
		
	String stringreverse = "";
		
	for (int i = 0; i < Stringinwords.length; i++) {
		
		String word = Stringinwords[i];
		
		String reString = "";
		 for (int j = word.length() -1; j>=0;  j--) {
			
			 reString = reString + word.charAt(j) ; 
		}
		 stringreverse = stringreverse + reString + " " ; 
	}
		
		return stringreverse;
	}
	
	public static void main(String[] args) {
		
	System.out.println(	ReverseEachWordOfString.reverseEachWordOfString("Characters In c J ABCD"));

	}

}
