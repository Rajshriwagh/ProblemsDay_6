package com.problemsday_6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		
		int reverse = 0;
		
		for(int i=n;i!=0;i/=10)
		{
		reverse = reverse * 10 + (i%10);
		}
		
		System.out.println("Reversed number is " + reverse);

	}

}
