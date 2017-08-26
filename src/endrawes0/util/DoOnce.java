package endrawes0.util;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Create on 8/25/17.
 */
public class DoOnce {
    public interface Doable {
        void doIt();
    }

    private static AtomicBoolean beenDone = new AtomicBoolean(false);

    public static void doOnce(Doable doable){
        if(beenDone.compareAndSet(false, true)){
            doable.doIt();
        }
    }

}
