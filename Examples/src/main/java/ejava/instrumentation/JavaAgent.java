/**
 * 
 */
package ejava.instrumentation;

import java.lang.instrument.Instrumentation;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class JavaAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println(inst.getClass() + ": " + inst); 
        // registers the transformer
        inst.addTransformer(new SleepingClassFileTransformer());
    }
}
