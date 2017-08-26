package endrawes0.music;

import endrawes0.music.instruments.Instrument;
import endrawes0.music.synth.SynthesizerSingleton;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class Band {

    private List<Musician> members = new ArrayList<>();
    private Sheet music = Sheet.Builder.instance().build();

    public void addMember(Instrument instrument) throws MidiUnavailableException, InvalidMidiDataException, IOException {
        Synthesizer synthesizer = SynthesizerSingleton.getInstance();

        int defaultChannel = instrument.getChannelNumber(members.size());

        MidiChannel channel = synthesizer.getChannels()[defaultChannel];
        instrument.setChannel(channel);

        members.add(new Musician(instrument));
    }

    public void play(int tempo) {
        for (Sheet.Measure measure : music) {
            members.parallelStream().forEach(musician -> musician.play(tempo, measure));
        }
    }

    public void setMusic(Sheet music) {
        this.music = music;
    }
}
