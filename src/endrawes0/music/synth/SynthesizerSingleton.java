package endrawes0.music.synth;

import com.sun.media.sound.SoftSynthesizer;
import endrawes0.music.synth.MySoundBank;
import endrawes0.util.DoOnce;

/**
 * Create on 8/19/17.
 */
public class SynthesizerSingleton {

    private static javax.sound.midi.Synthesizer ourInstance;
    public static javax.sound.midi.Synthesizer getInstance() {
        DoOnce.doOnce(() -> {
            try {
                ourInstance = new SoftSynthesizer();
                ourInstance.loadAllInstruments(MySoundBank.createSoundbank());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return ourInstance;
    }
}
