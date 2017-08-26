package endrawes0.music.actions;

import endrawes0.music.TimeSignature;

import javax.sound.midi.MidiChannel;

/**
 * Created by ahaddad15 on 8/20/17.
 */
public interface Playable {


    void play(MidiChannel midiChannel, int tempo, TimeSignature timeSignature);
    void play(MidiChannel midiChannel);

    double measurePortion(TimeSignature timeSignature);
}
