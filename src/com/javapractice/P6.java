package com.javapractice;

/*JAVA program to check whether two strings 
 * are anagrams of each other*/

import java.util.Scanner;
import java.util.Arrays;

public class P6 {
	
		/* function to check whether two strings are
		anagram of each other */
		static boolean areAnagram(char[] str1, char[] str2)
		{
			
			int n1 = str1.length;
			int n2 = str2.length;

			// If length of both strings is not same,
			// then they cannot be anagram
			if (n1 != n2)
				return false;

			// Sorting both strings
			Arrays.sort(str1);
			Arrays.sort(str2);

			// Comparing sorted strings
			for (int i = 0; i < n1; i++)
				if (str1[i] != str2[i])
					return false;

			return true;
		}

		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st String");
			String s1 = sc.next().toLowerCase();
			System.out.println("Enter 2nd String");
			String s2 = sc.next().toLowerCase();
			char str1[] = s1.toCharArray();
			char str2[] = s2.toCharArray();
		
			
			if (areAnagram(str1, str2))
				System.out.println("The two strings are"
								+ " anagram of each other");
			else
				System.out.println("The two strings are not"
								+ " anagram of each other");
		}
}

	