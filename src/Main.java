import endrawes0.music.songs.Song;
import endrawes0.music.songs.MaryHadALittleLamb;
import endrawes0.music.synth.SynthesizerSingleton;
import endrawes0.music.exception.TooManyBeatsPerMeasure;
import endrawes0.music.exception.UnknownInstrument;

import javax.sound.midi.MidiUnavailableException;

/**
 * Create on 8/19/17.
 */
class Main {

    public static void main(String argv[]) throws InterruptedException {
        try {
            for(int i = 0; i < SynthesizerSingleton.getInstance().getAvailableInstruments().length; ++i){
                System.out.println(i + ": " + SynthesizerSingleton.getInstance().getAvailableInstruments()[i].getName());
            }
            SynthesizerSingleton.getInstance().open();

            Thread.sleep(500);

            Song song = new MaryHadALittleLamb();
            song.play();
        } catch (MidiUnavailableException | TooManyBeatsPerMeasure e) {
            e.printStackTrace();
        } catch (UnknownInstrument e) {
            System.err.println("Unknown Instrument: " + e.instrumentName);
            e.printStackTrace();
        }
    }

}