package PassByReference;

public class Car {
     String name;
     int cost;
     
     void modifyCar(Car y)
     {
    	 y.name="BMW";
    	 y.cost=20000;
    	 
     }

}
class Test 
{
	public static void main(String[] args) {
		Car x=new Car();
		x.name="maruthi";
		x.cost=10000;
		System.out.println(x.name);
		System.out.println(x.cost);
		x.modifyCar(x);
		System.out.println(x.name);
		System.out.println(x.cost);
	}
}