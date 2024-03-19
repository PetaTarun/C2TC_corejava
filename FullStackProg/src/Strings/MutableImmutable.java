package Strings;

public class MutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ABCD"; // ABCD is immutable
		System.out.println(S);
		S =S.concat("EFGH");//ABCDEFGH is immutable because  if modifies the mutable string the new string is created that is immutable string
		
		System.out.println(S);
	}

}
