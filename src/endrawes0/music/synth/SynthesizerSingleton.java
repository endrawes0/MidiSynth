package endrawes0.music.synth;

import com.sun.media.sound.SoftSynthesizer;
import endrawes0.music.synth.MySoundBank;
import endrawes0.util.DoOnce;

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
