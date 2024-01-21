package PassByValue;


public class Calculator {
	
		int c;
		int add(int a ,int b) {
		/*	int a = 4;
			int b = 5;*/
			c = a+b;
			return c;
		}
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			int num1 = 50;
			int num2=40;
			int res =  calc.add(num1, num2);
			System.out.println(res);//90
		}
	}


