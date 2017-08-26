package endrawes0.music;

import endrawes0.music.actions.Playable;
import endrawes0.music.instruments.Instrument;

/**
 * Create on 8/19/17.
 */
public class Musician {

    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(int tempo, Sheet.Measure measure) {
        for (Playable playable : measure.getPlayables(instrument)) {
            instrument.play(playable, tempo, measure.getTimeSignature());
        }
    }

}
