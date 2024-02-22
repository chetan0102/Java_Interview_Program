package com.Stringcodesprogram;

public class ReverseAString {
	
	
	public static void main(String[] args) {
		
		//1) Using StringBuffer class
		
		StringBuffer sbf = new StringBuffer("Chetan");
		 
		System.out.println(sbf.reverse());    //Output : natehC
		
		
		
		//2) Using iterative method
		
		String str = "Darshana";
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : anahsraD
		}
		System.out.println("...........................");
	System.out.println(	ReverseAString.recursiveMethod("Siya"));
	}
	
	
	//3) Using recursive method.
	
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	
	

}
