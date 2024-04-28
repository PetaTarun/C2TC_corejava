package Logics;

import java.util.Scanner;

public class InputOutputProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.print("enter a character");
		    String str = sc.next();
	        char ch = str.charAt(0);
	        if (ch >= 'A' && ch <= 'Z') {
	        	System.out.println("1");
	        }
	        	else if (ch >='a' && ch<='z') {
	        		System.out.println("0");
	        	}
	        	else {
	        	System.out.println("-1");
	        	}
	        }
}
	        

	
