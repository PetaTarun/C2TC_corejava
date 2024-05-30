package Arrays;

public class AddingOfTwoNoUsingArr {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {5,4,3,2,1};
		int c[]=new int[a.length];
		for (int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
		}
		
		System.out.println("the sum of two arrays are:");
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
				
	}
}
