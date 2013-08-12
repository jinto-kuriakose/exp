/**
 * 
 */
package ejava.classloading;

import com.jinto.Employe;

/**
 * @author jinto.kuriakose
 * 09-Aug-2013
 *
 */
public class ClassLoadingExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testingLoader();
	}
	/**
	 * 
	 */
	private static void testingLoader() {
		System.out.println(System.getProperties());
		Employe employe = new Employe();
		
	}

}
