/**
 * 
 */
package ejava.primitives;

/**
 * @author jinto.kuriakose 16-Aug-2013
 * 
 */
public class BitWise {

	public static void main(String[] args) {
		test2();
	}
	static void test2(){
		System.out.println("xor " + ((2<3) ^ (4>3)));
		
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
	}

	static void test1() {
		byte b1 = 6 & 8;
		byte b2 = 7 | 9;
		byte b3 = 5 ^ 4;
		System.out.println(b1 + " " + b2 + " " + b3);

		int z = 5;
		if (++z > 5 || ++z > 6) {
			z++;
			System.out.println(z);
		}
		if (++z >2 | ++z < 6) {
			z++;
			System.out.println(z);
		}
		
		if (++z <2 & ++z > 6) {
			System.out.println("z="+z);
		}

	}
}
