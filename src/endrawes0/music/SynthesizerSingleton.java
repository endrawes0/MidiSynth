package endrawes0.music;

import com.sun.media.sound.SoftSynthesizer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class SynthesizerSingleton {

    private static javax.sound.midi.Synthesizer ourInstance;
    public static javax.sound.midi.Synthesizer getInstance() {
        DoOnce.doOnce(() -> {
            try {
                ourInstance = new SoftSynthesizer();
                MySoundBank mySoundBank = new MySoundBank();
                ourInstance.loadAllInstruments(mySoundBank.createSoundbank());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return ourInstance;
    }
}
