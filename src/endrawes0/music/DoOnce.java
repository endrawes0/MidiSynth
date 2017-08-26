package endrawes0.music;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by ahaddad15 on 8/25/17.
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
