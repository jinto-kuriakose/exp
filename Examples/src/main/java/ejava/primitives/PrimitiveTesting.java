/**
 * 
 */
package ejava.primitives;

/**
 * @author jinto.kuriakose
 * 12-Aug-2013
 *
 */
public class PrimitiveTesting {

	public static void main(String[] args) {
		enumTest2();
	}
	void charToInt(){
		char c = 'A';
		System.out.println("c= "+c);
		int i = c;
		System.out.println("i= "+i);
	}
	
	private enum CoffeSize {BIG,HUGE,NORMAL}
	
	static void enumTest(){
		CoffeSize coffeSize = CoffeSize.BIG;
		System.out.println(coffeSize);
		System.out.println(CoffeSize.values()[1]);
	}
	
	static void enumTest2(){
		Complex complex = Complex.CDD4;
		System.out.println(complex.getDefaultMM());
		System.out.println(Complex.CDD3.getDefaultMM());
	}
}
enum CoffeSize {BIG,HUGE,NORMAL}

enum Complex {
	DATA,DATA1,	
	CDD(8),CDD2(10),
	CDD3(10,"Hai"){
		public String getDefaultMM(){
			return "OVERRIDED-DEF";
		}
	},CDD4(10,"Hai 4");

	Complex(){}
	
	private Complex(int data){
		this.data = data;
	}
	Complex(int data,String name){
		this.data = data;
		this.name = name;
	}
	
	private int data;
	private String name;
	
	public int getData() {
		return data;
	}

	public String getName() {
		return name;
	}
	
	public String getDefaultMM(){
		return "DEF";
	}
}


