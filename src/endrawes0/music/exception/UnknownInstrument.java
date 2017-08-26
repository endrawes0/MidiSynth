package endrawes0.music.exception;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class UnknownInstrument extends Throwable {
    public String instrumentName;

    public UnknownInstrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }
}
