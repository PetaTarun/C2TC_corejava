package Strings;

public class ConCatenationTypes {

	public static void main(String[] args) {
		// they are three types
		String S1 ="Java";
		String S2 ="PYTHON";
		
		String S3 ="java"+"PYTHON";//type 1 memory will allocated in constant pool
		String S4=S1+S2;//type 2 non constant poll
		String S5=S1.concat(S2);//type 3 non constant poll
		
		

	}

}
