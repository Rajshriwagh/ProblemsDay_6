package com.problemsday_6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static boolean checkCouponExists(int couponArr[], int coupon, int head) {
		System.out.println("Checkin in coupon array ");
		for (int i = 0; i < head; i++) {
			System.out.println("couparray checking " + coupon + " with " + couponArr[i]);
			if (couponArr[i] == coupon)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of coupons ");
		int n = sc.nextInt();

		int couponArr[] = new int[n];
		int head = 0;

		Random rndm = new Random();
		int counter = 0;

		while (head != n) {
			int num = rndm.nextInt(n);
			counter++;
			System.out.println("Random number generated " + num);
			System.out.println("counter = " + counter + " and head is " + head);
//			System.out.println(checkCouponExists(coupArr, num, head));
			if (!checkCouponExists(couponArr, num, head)) {
				couponArr[head] = num;
				head++;
				System.out.println("Added " + num + " in coupon array");
			}
		}

		System.out.println("Elements in coupon ");
		System.out.println("Total random numbers needed to generate " + n + " coupons are " + counter);

	}

}
