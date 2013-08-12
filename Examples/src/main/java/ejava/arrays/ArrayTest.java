/**
 * 
 */
package ejava.arrays;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GraphObj[][] objs = new GraphObj[10][2];
		System.out.println(objs);
		
		GraphObj graphObj = new GraphObj();
		graphObj.setVertex("V10");
		
		objs[1] = new GraphObj[10];
		objs[1][6] = graphObj;
		
		System.out.println(objs[1][6].getVertex());
	}

}
