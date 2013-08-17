/**
 * 
 */
package ejava.primitives;

/**
 * @author jinto.kuriakose 16-Aug-2013
 * 
 */
public class LabeledLoops {

	public static void main(String[] args) {
		test2();
	}

	static void test2(){
		System.out.println("started");
		assert(true);
		assert(false): "failed to execute";
		
	}
	static void test() {

		outer1: for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			inner1: for (int j = 0; j < 10; j++) {
				System.out.println("j = " + j);
				if (j > 2) {
					break outer1;
				} else {
					continue outer1;
				}
			}
			System.out.println("After inner1");
		}
		System.out.println("After outer1");
	}

	static void test1() {
		System.out.println(012);
		try {
			throw new Error();
		} catch (Exception e) {
		}
		throw new RuntimeException();
	}
}
