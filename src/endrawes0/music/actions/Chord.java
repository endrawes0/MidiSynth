package endrawes0.music.actions;

import endrawes0.music.Duration;

import javax.sound.midi.MidiChannel;
import java.util.List;

/**
 * Create on 8/20/17.
 */
public class Chord extends PlayableBase {

    private List<Playable> notes;

    public Chord(List<Playable> playable, Duration duration){
        super(duration);
        this.notes = playable;
    }

    public void play(MidiChannel midiChannel) {
        notes.forEach(playable -> playable.play(midiChannel));
    }
}
