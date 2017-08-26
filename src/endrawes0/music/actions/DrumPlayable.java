package endrawes0.music.actions;

import endrawes0.music.Duration;

import javax.sound.midi.MidiChannel;

/**
 * Created by ahaddad15 on 8/24/17.
 */
public class DrumPlayable extends PlayableBase {

    private int value;

    public DrumPlayable(Duration duration, int value) {
        super(duration);
        this.value = value;
    }

    //35

    @Override
    public void play(MidiChannel midiChannel) {
        midiChannel.noteOn(this.value, 200);
        System.out.println("Playing " + this.value);
    }
}
