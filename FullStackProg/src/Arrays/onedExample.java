package Arrays;


import java.util.Scanner;

public class onedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int a[]=new int [3];{
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the ages:");
			a[i]=scan.nextInt();
		}
		}
		System.out.println("The ages Are:");{
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
	}

}
}
}