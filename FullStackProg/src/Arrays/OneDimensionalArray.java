package Arrays;

import java.util.Scanner;

public class OneDimensionalArray { //create an array to store the ages of 5 students;
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);	
	    int[] a = new int[5];
	    	for(int i=0;i<5;i++) 
	    	{
	    		System.out.println("Enter the ages:");
	    	    a[i]=scan.nextInt();
	    	}
	    	System.out.println("The ages are:");
	    	for(int i =0;i<5;i++) 
	    	{
	    		System.out.println(a[i]);
	    	}
	    
	    
	}  // int a [3] =50; //to store the data in index 3 that is 50
}