/**
 * 
 */
package ejava.primitives;

/**
 * @author jinto.kuriakose 16-Aug-2013
 * 
 */
public class Switch {

	enum Color {
		red, green, blue
	}

	public static void main(String[] args) {
		test3();
	}

	public static void test3() {
		int x = 7;
		switch (x) {
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("default");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		}
	}

	public static void test2() {
		Color c = Color.green;
		switch (c) {
		case red:
			System.out.print("red ");
		case green:
			System.out.print("green ");
		case blue:
			System.out.print("blue ");
		default:
			System.out.println("done");
		}
	}

	private static void test1() {

		String d = "P";
		switch (d) {
		case "s": {
			System.out.println(d);
		}
		case "m": {
			System.out.println("From M");
		}
		case "P": {
			System.out.println("from P");
		}
		default: {
			System.out.println("Default");
		}
		}
	}

}

class SwitchEnum {

}