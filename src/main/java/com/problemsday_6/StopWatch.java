package com.problemsday_6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("Enter character to start stopwatch ");
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();

		long start = System.currentTimeMillis();

		System.out.println("Enter character to stop stopwatch");
		int ed = sc.nextInt();
		long end = System.currentTimeMillis();

		long timeElapsed = end - start;

		System.out.println("Time elapsed is " + timeElapsed + " milliseconds");
		sc.close();

	}

}
