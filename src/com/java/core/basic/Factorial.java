package com.java.core.basic;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double num = sc.nextLong();
		
		long fact = 1;
		
		if(num==0 || num ==1 )
		{
			fact = 1;
		}
		else {
			for(long i=1;i<=num;i++) {
				fact = fact * i;
			}
		}
		System.out.println("The factorial of num " + num + " is: " + fact);
		sc.close();
	}

}
