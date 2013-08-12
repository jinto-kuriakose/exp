/**
 * 
 */
package ejava.interfaces;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public interface InferfaceTest {

	void test();
	
	public interface InferfaceTest1 {
		void test1();
	}
	
	interface InferfaceTest2 {
		void test2();
	}
	abstract interface InferfaceTest3 extends InferfaceTest2,InferfaceTest1,InferfaceTest,InferfaceTest4 {
		void test3();
	}
}

 interface InferfaceTest4 {
	void test4();
}
