package Logic;

public class Logic1 {

	public static void main(String[] args) {
		int a = 45; //o\p is 45.
		System.out.println(a);
		int b = 045;// o\p is 37 becoz of it treat it as octal.
		System.out.println(b);
		int c = 0X45;// o\p 69 becoz it treate as Hexadecimal.
		System.out.println(c);
		int d = 0b1000101;// o\p 69 becoz (ob) is binary we can store binary value also.
		System.out.println(d);
		}
	}

//int(data type) a(variable name) = 655(literals).
