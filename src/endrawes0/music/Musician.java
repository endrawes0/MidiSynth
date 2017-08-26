package endrawes0.music;

import endrawes0.music.actions.Playable;
import endrawes0.music.exception.NullMidiChannelException;
import endrawes0.music.instruments.Instrument;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class Musician {

    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(int tempo, Sheet.Measure measure) {
        try {
            for (Playable playable : measure.getPlayables(instrument)) {
                instrument.play(playable, tempo, measure.getTimeSignature());
            }
        } catch (NullMidiChannelException e) {
            System.err.println("No midi channel found for " + instrument);
            System.err.println("Skipping the rest of this messure.");
            e.printStackTrace();
        }
    }

}
