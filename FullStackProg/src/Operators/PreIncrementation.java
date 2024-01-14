package Operators;

public class PreIncrementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 5; // incrementation means plus(++) pre incrementation means adding 2 plus before the value ex ++2;
       ++a;
       System.out.println(a);    //o/p  6;  hear we adding 1+5=6;
       int  b = ++a;
       System.out.println(a);    //0/p  7;  hear 1+6=7;
       System.out.println(b);	//o/p   7;
       int c =++a + ++a + ++a ;
       System.out.println();     //  1+7=8 + 8+1=9 + 9+1=10  =27;
	}

}
