package Variables;

public class Dog {
	String name = "tommy";
	String bread ="locol bread";
	int cost = 0;
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.name);//dot(.) means go inside the dog (heap segment)to print the value of the dog .
		System.out.println(d.bread);
		System.out.println(d.cost);
	}
}
