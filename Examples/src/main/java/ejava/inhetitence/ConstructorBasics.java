/**
 * 
 */
package ejava.inhetitence;

/**
 * @author jinto.kuriakose
 * 13-Aug-2013
 *
 */
public class ConstructorBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//A a = new C();
		//AA aa = new BB();
	}
}

class A {
	public A(){
		test();
		System.out.println("Inside A..");
		test();
	}
	private void test(){
		System.out.println("Test method in A class");
	}
}

class B extends A{
	public B(){
		super();
		System.out.println("Inside B..");
	}
	public B(int a){
		//super();
		this();
		System.out.println("Inside B with arg = "+a);
	}
}

class C extends B{
	int a=10;
	public C(){
		//super(a);
		super(10);
		System.out.println("Inside C..");
	}
	public C(int a){
		System.out.println("Inside C with arg = "+a);
	}
}


class AA{
	public AA(int a){
		System.out.println("No def Cons");
	}
}
class BB extends AA{

	public BB(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
}