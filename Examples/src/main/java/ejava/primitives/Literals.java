/**
 * 
 */
package ejava.primitives;

/**
 * @author jinto.kuriakose 13-Aug-2013
 * 
 */
public class Literals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAssignmentOperators();
	}
	static void testAssignmentOperators(){
	//	final int x=10;
		int x=10;
		int y = x+10;
		y = x++;
		
		System.out.println(y);
	}

	static void arrayTest() {

		int a[] 	 		= new int[]{1,2}; // anonymous array creation
		/**
		 * ?" You can use it to create a just-in-time array
to use, for example, as an argument to a method that takes an array parameter.
The following code demonstrates a just-in-time array argument:
		 */
		
		int aa[] 	 		= {1,2};
		int a1[]	 		= new int[11];
		int a2[][]	 		= new int[11][];
		int a3[][] 	 		= new int[11][22];
		int a4[][][]		= new int[11][][];
		int a5[][][] 		= new int[11][22][];
		int a6[][][] 		= new int[11][22][33];
		int a7[][][][]		= new int[11][][][];
		int a8[][][][][]	= new int[11][][][][];
		
		int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
		
		int[][][] scores2 = {{{5,2,4,7}, {9,2}, {3,4}},{}};
		
		System.out.println(a);
	}

	static void test1() {
		Integer a = new Integer(12);
		Integer b = a;
		System.out.println("a=" + a + "  b=" + b);

		b = null;
		System.out.println("a=" + a + "  b=" + b);
	}

	static void test() {
		char n = '\n';

		System.out.println(n);
	}
}

class HexTest {
	public static void main(String[] args) {
		int x = 0X0001;
		int y = 0x7fffffff;
		int z = 0xDeadCafe;
		int m = 0Xdd;
		System.out.println("x = " + x + " y = " + y + " z = " + z);

		float xx = 20.33F;
		double yy = 30.30;
	}
}

class Octal {
	public static void main(String[] args) {
		int six = 06; // Equal to decimal 6
		int seven = 07; // Equal to decimal 7
		int eight = 010; // Equal to decimal 8
		int nine = 011; // Equal to decimal 9
		System.out.println("Octal 010 = " + eight);
		System.out.println("Octal 011 = " + nine);

		System.out.println(012);
		System.out.println(012L);
		System.out.println(012l);

		// int wrong = 089;

		int octal = 011111111111;
		int decimal = 999999999;
		System.out.println("octal = " + octal);
	}
}