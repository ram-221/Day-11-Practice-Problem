package com.bridgelabz;

public class DecimalToOctal {

	public static void main(String[] args){
	      int input, i, j;
	      input = 9;
	      System.out.println("The decimal number is defined as " +input);
	      int[] octal = new int[100];
	      System.out.println("The octal value is ");
	      i = 0;
	      while (input != 0) {
	         octal[i] = input % 8;
	        input = input / 8;
	         i++;
	      }
	      for ( j = i - 1; j >= 0; j--)
	         System.out.print(octal[j]);
	   }
}
