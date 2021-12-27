package com.javapractice;

import java.util.ArrayList;

//Java program for implementation of Bubble Sort
public class P4 {

	static void bubbleSort(Integer arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	
	static void printArray(Integer arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(64);
		list.add(32);
		list.add(24);
		list.add(90);
		Integer[] arr = new Integer[list.size()];
		//converting list to array of Integers
	    arr = list.toArray(arr);
		System.out.println("Unsorted Array");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}
}

