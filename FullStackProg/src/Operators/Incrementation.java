package Operators;

public class Incrementation {//Value will be Incremented First and then incremented value is used in expression
    public static void main(String[] args) {
		int a=5;
		int b=a++ + ++a + a++ + ++a; //5+1=5 1+5=6 6+1=7 1+7=8
		System.out.println(b); //o/p 28
		int c=a++ + a++ + ++a + ++a + a++; // 
		System.out.println(c);//37
	}

}
