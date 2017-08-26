package endrawes0.music.songs;

import endrawes0.music.*;
import endrawes0.music.Sheet.Measure;
import endrawes0.music.actions.Chord;
import endrawes0.music.actions.Note;
import endrawes0.music.exception.TooManyBeatsPerMeasure;
import endrawes0.music.exception.UnknownInstrument;
import endrawes0.music.instruments.DrumSet;
import endrawes0.music.instruments.Instrument;

import javax.sound.midi.*;

import java.io.IOException;
import java.util.Arrays;

/**
 * Create on 8/19/17.
 */
public class MaryHadALittleLamb implements Song {

    private static final int TEMPO = 100; //bpm
    private Band band;

    public MaryHadALittleLamb() throws UnknownInstrument, TooManyBeatsPerMeasure {
        band = new Band();
        DrumSet drums = new DrumSet();

        Instrument jazzGuitar = new Instrument("Electric Guitar (jaz");
        Instrument grandPiano = new Instrument("Acoustic Grand Piano");

        Sheet music = Sheet.Builder.instance()
                .add(Measure.Builder.instance(new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(drums)
                        .add(new Note(Note.Value.RIM_CLICK, Duration.QUARTER))
                        .add(new Note(Note.Value.RIM_CLICK, Duration.QUARTER))
                        .add(new Note(Note.Value.RIM_CLICK, Duration.QUARTER))
                        .add(new Note(Note.Value.RIM_CLICK, Duration.EIGTH))
                        .add(new Note(Note.Value.RIM_CLICK, Duration.EIGTH))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FOURTH),
                                new Note(Note.Value.E, Octave.FOURTH),
                                new Note(Note.Value.G, Octave.FOURTH)), Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.C, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FOURTH),
                                new Note(Note.Value.E, Octave.FOURTH),
                                new Note(Note.Value.G, Octave.FOURTH)), Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.REST, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.REST, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.REST, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.REST, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.G, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.G, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.REST, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.B, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.REST, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FOURTH),
                                new Note(Note.Value.E, Octave.FOURTH),
                                new Note(Note.Value.G, Octave.FOURTH)), Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.C, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FOURTH),
                                new Note(Note.Value.E, Octave.FOURTH),
                                new Note(Note.Value.G, Octave.FOURTH)), Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.C, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .add(new Note(Note.Value.G, Octave.FIFTH, Duration.QUARTER_TRIPOLET))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.REST, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FOURTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FOURTH, Duration.QUARTER))
                        .setInstrument(grandPiano)
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER))
                        .add(new Note(Note.Value.E, Octave.FIFTH, Duration.QUARTER))
                        .add(new Note(Note.Value.D, Octave.FIFTH, Duration.QUARTER))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.REST, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .build())
                .add(Measure.Builder.instance(
                        new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(jazzGuitar)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FOURTH),
                                new Note(Note.Value.E, Octave.FOURTH),
                                new Note(Note.Value.G, Octave.FOURTH),
                                new Note(Note.Value.C, Octave.FIFTH)), Duration.WHOLE))
                        .setInstrument(grandPiano)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.C, Octave.FIFTH),
                                new Note(Note.Value.E, Octave.FIFTH),
                                new Note(Note.Value.G, Octave.FIFTH),
                                new Note(Note.Value.C, Octave.SIXTH)), Duration.WHOLE))
                        .setInstrument(drums)
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM),
                                new Note(Note.Value.CRASH_CYMBAL_1)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Chord(Arrays.asList(
                                new Note(Note.Value.HI_HAT_CLOSED),
                                new Note(Note.Value.BASS_DRUM)
                        ), Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.SNARE_DRUM, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.SIXTEENTH))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .add(new Note(Note.Value.HI_HAT_CLOSED, Duration.THIRTY_SECOND))
                        .build())
                .add(Measure.Builder.instance(new TimeSignature(4, Duration.QUARTER))
                        .setInstrument(drums)
                        .add(new Note(Note.Value.CRASH_CYMBAL_1, Duration.WHOLE))
                        .build())
                .build();

        band.addMember(drums);
        band.addMember(jazzGuitar);
        band.addMember(grandPiano);

        band.setMusic(music);
    }

    @Override
    public void play() {
        band.play(TEMPO);
    }
}
