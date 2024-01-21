package Variables;

public class Test{
	int a=12;
	float b=12.5f;
	boolean c= true;
	double d =12.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		 System.out.println(t.a);//12
		 System.out.println(t.b);
		 System.out.println(t.c);
		 System.out.println(t.d);
		  
		 t.a = 55;
		 System.out.println(t.a);//55
		 
	}

}
