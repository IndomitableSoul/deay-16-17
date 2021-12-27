package com.javapractice;

import java.util.ArrayList;
import java.util.Arrays;


//Java program to implement Binary Search for strings

public class P2 {
	
	static int binarySearch(String[] arr, String x)
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		return -1;
	}

	
	public static void main(String []args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("pineapple");
		list.add("banana");
		list.add("guava");
		//Collections.sort(list);
 		String[] arr = new String[list.size()];
 		arr = list.toArray(arr);
 		Arrays.sort(arr);
		String x = "pineapple";
		int result = binarySearch(arr, x.toLowerCase());

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at "
							+ "index " + result);
	}
}
