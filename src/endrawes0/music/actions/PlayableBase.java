package endrawes0.music.actions;

import endrawes0.music.Duration;
import endrawes0.music.TimeSignature;

import javax.sound.midi.MidiChannel;

/**
 * Create on 8/24/17.
 */
public abstract class PlayableBase implements Playable {
    protected Duration duration;

    public  PlayableBase(Duration duration){
        this.duration = duration;
    }

    @Override
    public void play(MidiChannel midiChannel, int tempo, TimeSignature timeSignature) {
        play(midiChannel);

        try {
            System.out.println("Playing for " + duration.milliseconds(tempo, timeSignature) + "ms");
            Thread.sleep(duration.milliseconds(tempo, timeSignature));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public double measurePortion(TimeSignature timeSignature) {
        return duration.portion(timeSignature);
    }
}
