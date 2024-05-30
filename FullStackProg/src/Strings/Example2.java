package Strings;
//import java.util.Scanner;
public class Example2 {

	 static String reverse(String s) {
		// TODO Auto-generated method stub
		String t="";
		for(int i =s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		return t;
	}
	 public static void main(String[] args) {
		String s ="Tarun";
		System.out.println(reverse(s));
	}
}
