package Variables;

public class Dog {   //this are called instance variable becouse it crested inside the class;
	String name = "tommy";
	String bread ="locol bread";
	int cost = 0;
	public static void main(String[] args) {
		Dog d = new Dog(); // this are callled local variable becoz it is created in the main method which  are created in main method is called is loal variable;
		System.out.println(d.name);//dot(.) means go inside the dog (heap segment)to print the value of the dog .
		System.out.println(d.bread);
		System.out.println(d.cost);
	}
}
