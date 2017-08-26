package endrawes0.music.instruments;

import endrawes0.music.exception.UnknownInstrument;

/**
 * Create on 8/19/17.
 */
public class DrumSet extends Instrument {

    public DrumSet() throws UnknownInstrument {
        super("Standard Kit");
    }

    @Override
    public int getChannelNumber(int channel){
        return 9;
    }
}
