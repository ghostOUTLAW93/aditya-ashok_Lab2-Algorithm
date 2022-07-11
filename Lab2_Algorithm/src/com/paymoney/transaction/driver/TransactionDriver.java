package com.paymoney.transaction.driver;

import java.util.Scanner;

import com.paymoney.transaction.services.CheckTransaction;

public class TransactionDriver {

	public static void main(String[] args) {

		// creating objects for scanning the input and invoking checkTransaction methods
		Scanner sc = new Scanner(System.in);
		CheckTransaction transactinService = new CheckTransaction();

		//initailizing the transaction array of the size given by the user
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transArr = new int[size];

		//getting the values of transaction from the user
		System.out.println("Enter the values of array");
		for(int i = 0; i < size; i++)
			transArr[i] = sc.nextInt();

		//taking the no. of targets from the user for checking the transaction ahievement
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		//invoking the method to check for the achievement
		transactinService.checkTransaction(transArr, targetNo);

		//closing the scanner resource
		sc.close();

	}

}
