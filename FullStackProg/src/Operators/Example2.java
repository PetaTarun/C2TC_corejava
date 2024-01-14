package Operators;

public class Example2 {
public static void main(String[] args) {
	int a=5;
	int b;
	  b = ++a + a++ + a++ + --a + a-- + --a + a++ + ++a;
	System.out.println(a);
	System.out.println(b);//6+6+7+7+7+5+5+7=50
}
}
