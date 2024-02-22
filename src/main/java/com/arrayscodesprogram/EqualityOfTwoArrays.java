 package com.arrayscodesprogram;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	
	public static void main(String[] args) {
		
		// 1) Iterative Method 
		
		int[] arrayOne = {2, 5, 1, 7, 4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    
	
	// 2) Using Arrays.equals() Method
	
	
	String[] s1 = {"java", "j2ee", "struts", "hibernate"};
	 
    String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

    String[] s3 = {"java", "j2ee", "struts", "hibernate"};

   
    System.out.println(Arrays.equals(s1, s2));        //Output : false

    System.out.println(Arrays.equals(s1, s3));      //Output : ture
	
 // 3) Using sort the Arrays.equals() Method
    
    String[] ss1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
    
    String[] ss2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

    Arrays.sort(ss1);

    Arrays.sort(ss2);

    System.out.println(Arrays.equals(ss1, ss2));       //Output : true
    
   // 4) Using Arrays.deepEquals() Method :
    
    String[][] s11 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
    
    String[][] s12 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

    System.out.println(Arrays.deepEquals(s11, s12));     //Output : true
     
    //Calling equals() method on same arrays will return false
     
    System.out.println(Arrays.equals(s11, s12));        //Output : false
     
    //That's why use deepEquals() method to compare multidimensional arrays

}

}
