import endrawes0.music.Songs.Song;
import endrawes0.music.Songs.MaryHadALittleLamb;
import endrawes0.music.SynthesizerSingleton;
import endrawes0.music.exception.TooManyBeatsPerMeasure;
import endrawes0.music.exception.UnknownInstrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.io.IOException;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class Main {

    public static void main(String argv[]) throws InterruptedException {
        try {
            for(int i = 0; i < SynthesizerSingleton.getInstance().getAvailableInstruments().length; ++i){
                System.out.println(i + ": " + SynthesizerSingleton.getInstance().getAvailableInstruments()[i].getName());
            }
            SynthesizerSingleton.getInstance().open();

            Thread.sleep(500);

            Song song = new MaryHadALittleLamb();
            song.play();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (UnknownInstrument e) {
            System.err.println("Unknown Instrument: " + e.instrumentName);
            e.printStackTrace();
        } catch (TooManyBeatsPerMeasure e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}