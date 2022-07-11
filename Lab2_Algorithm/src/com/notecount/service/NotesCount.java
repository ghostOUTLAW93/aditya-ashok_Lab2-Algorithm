package com.notecount.service;

public class NotesCount {

	public void countingNotes(int[] denomination, int amount) {

		int length = denomination.length, i = length - 1;
		
		// first the denomination of currency is sorted in ascending 
		SortNotes sort = new SortNotes();
		sort.mergeSort(denomination, 0, length -1);

		System.out.println("\nYour payment approach in order to give min no of notes will be");

		//two while loops for calculating no of notes for each denomination
		while(i >= 0) {
			//declaring a count variable for counting the no of notes in each denomination
			int count = 0;

			while(amount >= denomination[i]) {
				count = amount/denomination[i];
				amount %= denomination[i];				
			}

			if(count != 0)
				System.out.println(denomination[i]+" : "+ count);
			i--;
		}

		if(amount != 0)
			System.out.println("All the amount cannot be paid with above denominations of currency.\nRemaining amount is "+ amount);
	}

}
