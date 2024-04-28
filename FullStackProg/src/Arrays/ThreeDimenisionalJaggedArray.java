package Arrays;

import java.util.Scanner;

public class ThreeDimenisionalJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int [][][]a=new int [2][][];
		a[0]=new int[3][];
		a[1]=new int [2][];
	
		a[0][0]=new int [2];
		a[0][1]=new int [3];
		a[1][2]=new int [3];
		a[1][0]=new int [2];
		a[1][1]=new int [3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
					System.out.println("Enter the ages of school"+i+"class"+j+"student"+k);
				a[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("the ages are");
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
					System.out.println(a[i][j][k]);
				
			   }
		   }

	   }
	}
}
