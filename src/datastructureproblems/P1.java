package datastructureproblems;

import java.util.LinkedList;
import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a sentance");
	String str = sc.nextLine();
	String[] arr = str.split(" ");

	//adding array to list
	LinkedList<String> list = new LinkedList<String>();
	for(int i = 0; i< arr.length; i++) {
		list.add(arr[i]);
	}
	System.out.println(list);
	
	//taking the word from user
	System.out.println("Enter the word to search");
	String word = sc.next();
	
	//searching the list for the word
	if(!list.contains(word))
		list.add(word);
	else
		list.remove(word);
	System.out.println(list);
}
}
