package com.extraprogram;

public class ArmstrongNumber {

	static void checkArmstrongNumber(int number)
    {
        int copyOfNumber = number;
 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
 
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
 
            int lastDigitToThePowerOfNoOfDigits = 1;
 
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
 
            sum = sum + lastDigitToThePowerOfNoOfDigits;
 
            copyOfNumber = copyOfNumber / 10;
        }
 
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }
 
    public static void main(String[] args)
    {
        checkArmstrongNumber(153); // 153 = 13 + 53 + 33 = 1 + 125 + 27 = 153
 
        checkArmstrongNumber(9474); // 9474 = 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
        
        checkArmstrongNumber(1674); // 1674 = 14 + 64 + 74 + 44 = 1 + 1296 + 2401 + 256 = 3954
        
          
    }
}