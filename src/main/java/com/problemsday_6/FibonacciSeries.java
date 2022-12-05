package com.problemsday_6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for fibonacci series");
		int n = sc.nextInt();

		int next = 1;
		int prev = 0;
		int sum = prev + next;
		System.out.println("Fibonacci series is ");
		System.out.print("0  1  ");
		while (sum <= n) {
			System.out.print(sum + "  ");
			prev = next;
			next = sum;
			sum = next + prev;
		}
		sc.close();

	}

}
