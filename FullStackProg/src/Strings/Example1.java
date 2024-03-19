package Strings;

import java.util.Scanner;


public class Example1 {//no,of vowels in a given string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		int count=0;
		for (int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(c=='a'|| c=='A'|| c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			{
				count++;
				
			}
		}
	
		System.out.println(count);
}
}

	


