package com.bridgelabz;
import java.util.Scanner;


public class OctalToBinaryNumber {

	public static void main(String arg[]) {

		
		Scanner s = new Scanner(System.in);
		int [] octalNumberValue= {0,1,10,11,100,101,110,111};
		long octalNumber,tempOcatlNumber, binaryNumber,store;
		int reminder;
		
		System.out.println("enter any ocatk number");
		octalNumber=s.nextLong();
		tempOcatlNumber = octalNumber;
		binaryNumber = 0;
		store = 1;
		
		while(tempOcatlNumber != 0) {
			reminder = (int)(tempOcatlNumber % 10);
			binaryNumber = octalNumberValue[reminder] * store + binaryNumber;
			tempOcatlNumber /= 10;
			store *=1000;
		}
		System.out.println("Equivalent binary number: "+binaryNumber);
	}
}
