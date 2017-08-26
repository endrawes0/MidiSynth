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
public class Instrument {

    private javax.sound.midi.Instrument midiInstrument;
    private MidiChannel midiChannel;

    public Instrument(String instrumentName) throws MidiUnavailableException, UnknownInstrument, InvalidMidiDataException, IOException {
        this.midiInstrument = InstrumentMap.getInstance().get(instrumentName);
    }

    public void play(Playable playable, int tempo, TimeSignature timeSignature) {
        playable.play(midiChannel, tempo, timeSignature);
    }

    public void setChannel(MidiChannel channel) {
        this.midiChannel = channel;
        this.midiChannel.programChange(midiInstrument.getPatch().getProgram());
    }

    public int getChannelNumber(int channel){
        return channel;
    }
}
