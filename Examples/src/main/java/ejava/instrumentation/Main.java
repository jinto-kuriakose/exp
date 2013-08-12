/**
 * 
 */
package ejava.instrumentation;

import org.junit.Test;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class Main {

	   @Test
	    public void shouldInstantiateSleepingInstance() throws InterruptedException {
	 
	        Sleeping sleeping = new Sleeping();
	        sleeping.randomSleep();
	    }
}
