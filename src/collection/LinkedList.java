package collection;

import java.util.LinkedList;

public class LinkedList { 
	/*
	* LinkedList is class implements List interface
	* Under line data structure is doubly LinkedList
	* LinkedList is non synchronize.
	*/
	

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		System.out.println(l1.isEmpty());
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		
		System.out.prinln(l1.size() );
		System.out.prinln(l1.contains(100) );
		

	}

}
