package DataTypes;
 public class Integer {  // or whole numbers.
  public static void main(String[] args) {
	//1.Ram is a collection of Bytes.
    //2. 1 byte =8 bits.
		byte a = -128;//minimum -128 max +127.
		System.out.println(a);
		byte b = 127;
		System.out.println(b);{
			short c = -32768;//min -32768 max 32762.
			short d = 32767;
			System.out.println(c);
			System.out.println(d);{
				int e = -2147483648;
				int f = 2147483647;
				System.out.println(e+" to "+f);
  //long g = 9223372036854775807; error=The literal 9223372036854775807 of type int is out of range 
  //long h = -9223372036854775808;to solve put in sufex(last) l 0r L.
				        long g = 9223372036854775807L;
				        long h = -9223372036854775808l;
				        System.out.printf("g = %d, h = %d", g, h);
				   }
				}
             }
		}


