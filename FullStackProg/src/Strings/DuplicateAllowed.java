package Strings;

public class DuplicateAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="java";
		String S2=new String("java");
		if(S1==S2)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("reference aree not equal");
		}
		if(S1.equals(S2))
		{
			System.out.println("Values are equal");
		}
		else
		{
			System.out.println("Values are not equal");
		}
	}

}
