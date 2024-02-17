package ControlFlowStatement;
import java.util.Scanner;
public class switch_casedemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		/*
		int num =sc.nextInt();
		switch(num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
			
			default:
				System.out.println("please provide appropriate number");
			
		}
		*/
		char ch='r';
		switch (ch) {
		case 'a':
			System.out.println(ch+ " is a vowel");
			break;
		case 'e':
			System.out.println(ch+ " is a vowel");
			break;
		case 'i':
			System.out.println(ch+ " is a vowel");
			break;
		case 'o':
			System.out.println(ch+ " is a vowel");
			break;
		case 'u':
			System.out.println(ch+ " is a vowel");
			break;

		default:
			System.out.println("not a vowel");
		}
	}

}
