package Arrays;

import java.util.Scanner;

public class TwoDimensionalArray 
{
		public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			int [][]a=new int [2][5];
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
