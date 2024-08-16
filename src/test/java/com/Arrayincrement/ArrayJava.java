package com.Arrayincrement;

public class ArrayJava {
	
	    public int[] plusOne(int[] digits) {
	        for (int i = digits.length - 1; i >= 0; i--) {
	            // If the current digit is less than 9, simply increment it
	            if (digits[i] < 9) {
	                digits[i]++;
	                return digits;
	            }
	            // If the current digit is 9, set it to 0 and continue to the next digit
	            digits[i] = 0;
	        }
	        // If all digits are 9, we need to add a leading 1
	        int[] newNumber = new int[digits.length + 1];
	        newNumber[0] = 1;
	        return newNumber;
	    }

	    public static void main(String[] args) {
	    	ArrayJava solution = new ArrayJava();
	        int[] digits = {1, 2, 3};
	        int[] result = solution.plusOne(digits);
	        for (int digit : result) {
	            System.out.print(digit);
	        }
	    }
	}

	


