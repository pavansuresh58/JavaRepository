package ControlFlowStatement;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*
		int  a =sc.nextInt();
		int  b=sc.nextInt();
		 if(age>=18) {
			System.out.println("Valid age"); 
		int a = 100,b=900;
		if(a>b) {
			System.out.println(a+"  is greater than  "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		
		int  a =sc.nextInt();
		int  b=sc.nextInt();
		int  c =sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater");
		  }
		else if(b>a && b>c) {
			System.out.println("b is greater");
		  }
		else{
			System.out.println("c is greater");
		}
		
		String bname=sc.nextLine();
		if(bname.equalsIgnoreCase("chrome")){
			System.out.println("Test is executing on chrome!");
		}
		else if(bname.equalsIgnoreCase("firebox")) {
			System.out.println("firebox");
		}
		else if(bname.equalsIgnoreCase("safari")) {
			System.out.println("safari");
		}
		else {
			System.out.println("enter a valid broswer name");
		}
		*/
		String data=sc.nextLine();
		char ch=data.charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Ch is vowel");
		}
		else {
			System.out.println("Nothing is vowel");
		}
		/*
		if(ch=='a') {
			System.out.println("a is vowel");
		}
		else if(ch=='e') {
			System.out.println("e is vowel");
		}
		else if(ch=='i') {
			System.out.println("i is vowel");
		}
		else if(ch=='o') {
			System.out.println("o is vowel");
		}
		else if (ch=='u') {
			System.out.println("u is vowel");
		}
		else {
			System.out.println("nothing is vowel");
		}
		*/
		}
	}


