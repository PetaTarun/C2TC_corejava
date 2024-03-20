package Arrays;

import java.util.Scanner;

public class TwodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int [][]a=new int [3][2];
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
			{	
				System.out.println("Enter the ages:"+i+"student"+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("The ages are");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
			{	
				System.out.println(a[i][j]);
				
			}
		}
			
		
	}
}
