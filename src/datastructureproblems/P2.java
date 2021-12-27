package datastructureproblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Add 5 numbers to your list");
	int size = 5;

	//adding array to list
	LinkedList<Integer> list = new LinkedList<>();
	for(int i = 0; i< size; i++) {
		
		list.add(sc.nextInt());
	}
	Collections.sort(list);
	System.out.println(list);
	
	//taking the number from user
	System.out.println("Enter the number to search");
	int num = sc.nextInt();
	
	//searching the list for the word
	if(!list.contains(num))
		list.add(num);
	else
		list.remove((Integer)num);
	Collections.sort(list);
	System.out.println(list);
}
}
