package com.javapractice;

import java.util.*;

class P1{
		//iterative method approach
		static void permute(String s,String answer)
		{
			if (s.length() == 0)
			{
				System.out.print(answer + " ");
				return;
			}
			
			for(int i = 0 ;i < s.length(); i++)
			{
				char ch = s.charAt(i);
				String left_substr = s.substring(0, i);
				String right_substr = s.substring(i + 1);
				String rest = left_substr + right_substr;
				permute(rest, answer + ch);
			}
		}
		
		//Recursive method approach
		static	void permute(String str, int l, int r) 
		 { 
		    if (l == r) 
		      System.out.println(str); 
		    else
		    { 
		    	for (int i = l; i <= r; i++) 
		    		{ 
		    			str = swap(str,l,i); 
		    			permute(str, l+1, r); 
		    			str = swap(str,l,i); 
		    		} 
		    } 
		 } 
		public static String swap(String a, int i, int j) 
		{ 
		 char temp; 
		 char[] charArray = a.toCharArray(); 
		 temp = charArray[i] ; 
		 charArray[i] = charArray[j]; 
		 charArray[j] = temp; 
		 return String.valueOf(charArray); 
		} 
		

		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);	
			String s;
			String answer="";
			
			System.out.print("Enter the string : ");
			s = scan.next();
			int n = s.length();
			System.out.println("All possible strings are : ");
			permute(s, answer);
			System.out.println("All possible strings are : ");
			permute(s, 0, n-1);
		}
}


