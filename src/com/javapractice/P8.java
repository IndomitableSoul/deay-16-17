package com.javapractice;

public class P8 {
	static boolean isPrime(int num) {
		if(num == 1 || num==0)
			return false;
		for (int i = 2; i<= num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	static void printPrimebetween(int num1,int num2) {
		for(int i=num1; i<=num2;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printPrimebetween(0, 1000);
	}
}
