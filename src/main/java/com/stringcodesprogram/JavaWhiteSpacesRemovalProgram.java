package com.stringcodesprogram;

public class JavaWhiteSpacesRemovalProgram {

	public static void main(String[] args) {

		String s = "Enter input string to be cleaned from white spaces...!";
		
		
		// 1) Using Built-In Methods
		
		 String stringWithoutSpaces = s.replaceAll("\\s+", "");
		 
		 System.out.println(s);
		 System.out.println(stringWithoutSpaces);
		 
		// 2) Without Using Built-In Methods
		 
		 char[] charArray = s.toCharArray();
         
	        String stringWithoutSpaces1 = "";
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	            	stringWithoutSpaces1 = stringWithoutSpaces1 + charArray[i];
	            }
	        }
	         
	        System.out.println("Input String : "+s);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces1);
	}

}
