package endrawes0.music.instruments;

import endrawes0.music.TimeSignature;
import endrawes0.music.actions.Playable;
import endrawes0.music.exception.UnknownInstrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiUnavailableException;
import java.io.IOException;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class DrumSet extends Instrument {

    public DrumSet() throws MidiUnavailableException, UnknownInstrument, InvalidMidiDataException, IOException {
        super("Standard Kit");
    }

    @Override
    public int getChannelNumber(int channel){
        return 9;
    }
}
