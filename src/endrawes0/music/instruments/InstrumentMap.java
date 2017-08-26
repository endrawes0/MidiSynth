package endrawes0.music.instruments;

import endrawes0.music.synth.SynthesizerSingleton;
import endrawes0.music.exception.UnknownInstrument;

import javax.sound.midi.*;
import javax.sound.midi.Instrument;
import java.util.HashMap;
import java.util.Map;

/**
 * Create on 8/19/17.
 */
public class InstrumentMap {

    private Map<String, Instrument> map = new HashMap<>();

    private static InstrumentMap ourInstance;

    public static InstrumentMap getInstance() {
        if(ourInstance == null)
            ourInstance = new InstrumentMap(SynthesizerSingleton.getInstance());

        return ourInstance;
    }

    private InstrumentMap(Synthesizer synthesizer) {
        javax.sound.midi.Instrument[] instruments = synthesizer.getAvailableInstruments();
        for (Instrument instrument : instruments) {
            map.put(instrument.getName(), instrument);
        }
    }

    public javax.sound.midi.Instrument get(String instrumentName) throws UnknownInstrument {
        if(!map.containsKey(instrumentName)) throw new UnknownInstrument(instrumentName);
        return map.get(instrumentName);
    }
}
