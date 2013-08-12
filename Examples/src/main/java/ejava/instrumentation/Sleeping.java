/**
 * 
 */
package ejava.instrumentation;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class Sleeping {
    public void randomSleep() throws InterruptedException {
        
        // randomly sleeps between 500ms and 1200s
        long randomSleepDuration = (long) (500 + Math.random() * 700);
        System.out.printf("Sleeping for %d ms ..\n", randomSleepDuration);
        Thread.sleep(randomSleepDuration);
    }
}
