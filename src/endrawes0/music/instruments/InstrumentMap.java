package endrawes0.music.instruments;

import endrawes0.music.synth.SynthesizerSingleton;
import endrawes0.music.exception.UnknownInstrument;

import javax.sound.midi.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class InstrumentMap {

    Map<String, javax.sound.midi.Instrument> map = new HashMap();

    private static InstrumentMap ourInstance;

    public static InstrumentMap getInstance() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        if(ourInstance == null)
            ourInstance = new InstrumentMap(SynthesizerSingleton.getInstance());

        return ourInstance;
    }

    private InstrumentMap(Synthesizer synthesizer) {
        javax.sound.midi.Instrument[] instruments = synthesizer.getAvailableInstruments();
        for(int i = 0; i < instruments.length; i++){
            map.put(instruments[i].getName(), instruments[i]);
        }
    }

    public javax.sound.midi.Instrument get(String instrumentName) throws UnknownInstrument {
        if(!map.containsKey(instrumentName)) throw new UnknownInstrument(instrumentName);
        return map.get(instrumentName);
    }
}
