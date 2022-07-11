package com.notecount.driver;

import java.util.Scanner;

import com.notecount.service.NotesCount;

public class NoteCountDriver {

	public static void main(String[] args) {
		// import the scanner and the service packages
		//sorting and count implementation is done in the service packages
		//mergeSort is recomended because of its less time complexity

		Scanner sc = new Scanner(System.in);
		NotesCount countNotes = new NotesCount();

		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();

		//creating an array for taking all the denominations from the user
		int[] notes = new int[size];
		System.out.println("\nEnter the curency denomination value");
		for(int i = 0; i < size; i++)
			notes[i] = sc.nextInt();

		System.out.println("\nEnter the amount you want to pay");
		int amount = sc.nextInt();

		//invoking the method to count notes
		countNotes.countingNotes(notes, amount);

		sc.close();
	}

}
