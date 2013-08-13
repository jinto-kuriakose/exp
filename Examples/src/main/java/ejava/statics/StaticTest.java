/**
 * 
 */
package ejava.statics;

/**
 * @author jinto.kuriakose 13-Aug-2013
 * 
 */
public class StaticTest {

	public StaticTest() {
		this("d");
		instanceMethod();
		staticMethod();
	}

	public StaticTest(String s) {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	void instanceMethod() {
		staticMethod();
	}

	static void staticMethod() {
		// instanceMethod();
		new StaticTest().instanceMethod();
	}

}

//////////////////////////////////////////////////////

class RecursiveThis{
	
//	public RecursiveThis(){
//		this("d");
//	}
//	public RecursiveThis(String s){
//		this();
//	}
}

///////////////////////////////////////////////////////

class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	Animal() {
		this(makeRandomName());
	}

	/*  This method must be static.
		That's because you cannot invoke an instance (in other words, nonstatic)
		method (or access an instance variable) until after the super constructor has run
	*/
	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name);
	}
}