package endrawes0.music.songs;

import endrawes0.music.*;
import endrawes0.music.actions.Chord;
import endrawes0.music.actions.Note;
import endrawes0.music.exception.TooManyBeatsPerMeasure;
import endrawes0.music.exception.UnknownInstrument;
import endrawes0.music.instruments.DrumSet;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Create on 8/23/17.
 */
public class StandardKitTest implements Song {

    private static final int TEMPO = 60; //bpm
    private Band band = new Band();

    public StandardKitTest() throws UnknownInstrument, TooManyBeatsPerMeasure {
        DrumSet drums = new DrumSet();
        Sheet test = Sheet.Builder.instance()
                .loop(Sheet.Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.SNARE_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.SNARE_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED)
                        ), Duration.SIXTEENTH))
                        .build(), 16)
                .build();

        band.setMusic(test);
        band.addMember(drums);
    }

    @Override
    public void play() {
        band.play(TEMPO);
    }
}
