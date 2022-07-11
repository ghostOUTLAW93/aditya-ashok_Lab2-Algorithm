package com.notecount.service;

public class SortNotes {// class to sort the notes

	//In this method we are sorting the denominations provided by the user using merge sort
	public void mergeSort(int[] notes, int l, int r){

		//passing left(l) and right(r) as parameters
		//m is the mid point of the array
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(notes, l, m);
			mergeSort(notes, m + 1, r);

			merge(notes, l, m, r);
		}
	}

	private void merge(int[] notes, int l, int m, int r) {
		// declaring lengths of two sub arrays
		int len1 = m - l + 1;
		int len2 = r - m;

		//declaring two sub array of length len1 & len2 respectively
		int[] leftArr = new int[len1];
		int[] rightArr = new int[len2];

		//copying elements into left and right sub arrays
		for(int i = 0; i < len1; i++)
			leftArr[i] = notes[l + i];
		for(int j = 0; j < len2; j++)
			rightArr[j] = notes[m + 1 + j];

		//comparing the elements of sub arrays and putting them into the correct positions in the merged array
		int i = 0, j = 0;
		int k = l;

		while(i < len1 && j < len2) {
			if(leftArr[i] <= rightArr[j]) {
				notes[k] = leftArr[i];
				i++;
			}
			else {
				notes[k] = rightArr[j];
				j++;
			}
			k++;
		}

		//copying the remaining elements from left array
		while(i < len1) {
			notes[k] = leftArr[i];
			i++;
			k++;
		}

		//copying the remaining elements from right array
		while(j < len2) {
			notes[k] = rightArr[j];
			j++;
			k++;
		}

	}

}
