package com.sortingalgorithm;

public class MyBubbleSort {

	// logic to sort the elements
	public static void bubble_sort(int[] arr) {
		int n = arr.length;
		int k;
		int count = 0;
		for (int m = n; m >= 0; m--) {
			count = 0;
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (arr[i] > arr[k]) {
					swapNumbers(i, k, arr);
				} else {
					count++;
				}
			}
			if (count == n - 1) {
				break;
			}
			printNumbers(arr);
		}
	}

	private static void swapNumbers(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_sort(input);

	}
}
