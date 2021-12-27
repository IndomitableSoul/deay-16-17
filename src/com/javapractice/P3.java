package com.javapractice;

//Java program to sort an Array of Strings using insertion sort
public class P3 {

    //function to implement Insertion Sort.
	static void sort(String []s, int n)
	{
		for (int i=1 ;i<n; i++)
		{
			String temp = s[i];
	
			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length())
			{
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
		}
	}


	static void printArray(String str[], int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(str[i]+" ");
	}


	public static void main(String args[])
	{
		String []arr = {"apple", "pineapple", "banana", "guava"};
		int n = arr.length;
	
		sort(arr,n);
		
		printArray(arr, n);
		
	}
}
