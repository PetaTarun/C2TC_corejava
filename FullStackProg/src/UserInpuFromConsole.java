import java.util.Scanner;

public class UserInpuFromConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name..?");
		String name=scanner.nextLine();
		System.out.printf("hey %s , What is your age..?",name);
		int age=scanner.nextInt();
		System.out.println("enter the ph no");
		int phno=scanner.nextInt();
		System.out.printf("hey %s what is your father name..?",name);
		String fathername=scanner.nextLine();

	}

}
