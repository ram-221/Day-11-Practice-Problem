package com.bridgelabz;

public class DecimalToBinary {

	public static void main(String args[])
	{   
		int decimal = 11;
		int binary[] = new int[20];
		int i = 0; 
		 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			binary[i++] = r;
			decimal = decimal/2;
		}
		
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+"");
	}
}
