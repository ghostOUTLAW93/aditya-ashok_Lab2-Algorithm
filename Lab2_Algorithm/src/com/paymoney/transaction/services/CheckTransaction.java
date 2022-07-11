package com.paymoney.transaction.services;

import java.util.Scanner;

public class CheckTransaction {

	Scanner sc = new Scanner(System.in);

	//a method to check transaction achievement
	public void checkTransaction(int[] arr, int tarNo) {

		int length = arr.length;

		int targetValue;
		
		for(int i = 1; i <= tarNo; i++) {
			int achievedValue = 0;
			System.out.println("\nEnter the value of target");
			targetValue = sc.nextInt();

			for(int j = 0; j < length; j++ ) {
				achievedValue += arr[j];
				if(achievedValue >= targetValue) {
					System.out.println("Target achieved after " + (j+1) + " transaction");
					break;
				}

			}

			if(achievedValue < targetValue) {
				System.out.println("Given target is not achieved!"); 
			}
		}
	}
}
