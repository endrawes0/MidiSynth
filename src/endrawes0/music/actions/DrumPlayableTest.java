package endrawes0.music.actions;

import endrawes0.music.Duration;

import javax.sound.midi.MidiChannel;

/**
 * Create on 8/24/17.
 */
public class DrumPlayableTest extends PlayableBase {

    private int value;

    public DrumPlayableTest(Duration duration, int value) {
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
