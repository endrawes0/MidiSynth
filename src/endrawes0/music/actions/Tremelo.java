package endrawes0.music.actions;

import endrawes0.music.TimeSignature;

import javax.sound.midi.MidiChannel;
import java.util.Random;

/**
 * Create on 8/26/17.
 */
public class Tremelo  extends PlayableBase {

    private Note note;

    public Tremelo(Note note) {
        super(note.duration);
        this.note = note;
    }

    @Override
    public void play(MidiChannel midiChannel, int tempo, TimeSignature timeSignature) {
        play(midiChannel);
        long ms, sms, dms; //current, start, difference
        ms = sms = System.currentTimeMillis();
        dms = duration.milliseconds(tempo, timeSignature);
        System.out.println("Playing a TREMELO for " + dms + "ms");
        try {
            Random rand = new Random(sms);
            while(ms <= sms + dms){
                midiChannel.noteOn(note.getNumber(), 80);
                Thread.sleep(90 + rand.nextInt(20));
                ms = System.currentTimeMillis();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play(MidiChannel midiChannel) {
    }
}
