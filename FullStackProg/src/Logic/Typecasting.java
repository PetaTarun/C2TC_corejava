package Logic;

public class Typecasting {

	public static void main(String[] args) {
	      double a = 130;
	      byte b = (byte)a;
	      System.out.println(a);//o\p 130.
	      System.out.println(b);//o\p -126.
	      byte c = 127;
	      c = (byte)(c+1);
	      System.out.println(c);}// o\p -128
	}


