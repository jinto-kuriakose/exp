/**
 * 
 */
package ejava.inhetitence;

import ejava.inhetitence2.DefaultMemberClass;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class Inheritance1 extends ClassB {
	
	int no ;

	public static void main(String[] args) {
		
		Inheritance1 inheritance1 = new Inheritance1();
		System.out.println(inheritance1.no);
		inheritance1.test();
		
		DefaultMemberClass class1  =new  DefaultMemberClass();
		
	}

	void test(){
		System.out.println(no);
		System.out.println(this.no);
		//super.test();
	}
}

class ClassB{
	public int no=30;
	public static int number=30;
	
	void test(){
		System.out.println("from ClassB");
	}
}
