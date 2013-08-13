/**
 * 
 */
package ejava.methods;

/**
 * @author jinto.kuriakose
 * 12-Aug-2013
 *
 */
public class MethodTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		varArgs(10,44,77);
	}
	
	static void test(Integer data, final Integer secondData){
		
		/*
		 * 
		 * 		Integer data = new Integer(10);
		Integer secondData = new Integer(20);
		System.out.println("Before ..");
		System.out.println("data="+data+", secondData"+secondData);
		System.out.println(data.hashCode());
		
		test(data, secondData);
		
		System.out.println("After ..");
		System.out.println("data="+data+", secondData"+secondData);
		System.out.println(data.hashCode());
		 */
		data = new Integer(100);
		System.out.println(data.hashCode());
		//secondData = data;
	}
	
	static void varArgs(int a, Integer... integers ){
		System.out.println("a="+a);
		System.out.println("integers="+integers);
		if(null != integers && integers.length>0){
			System.out.println("length="+integers.length);
			System.out.println(integers[0]);
		}
	}
}
