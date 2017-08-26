package endrawes0.music.actions;

import endrawes0.music.Duration;
import endrawes0.music.Octave;

import javax.sound.midi.MidiChannel;

/**
 * Created by ahaddad15 on 8/19/17.
 */
public class Note extends PlayableBase {
    public enum Value {
        //melodic notes
        C(0),
        C_SHARP(1),
        D_FLAT(1),
        D(2),
        D_SHARP(3),
        E_FLAT(3),
        E(4),
        F(5),
        F_SHARP(6),
        G_FLAT(6),
        G(7),
        G_SHARP(8),
        A_FLAT(8),
        A(9),
        A_SHARP(10),
        B_FLAT(10),
        B(11),

        //rest
        REST(-1),

        //percussive notes
        BASS_DRUM(35),
        SNARE_DRUM(38),
        TOM(41),
        HI_HAT_OPEN(42),
        HI_HAT_CLOSED(46),
        CRASH_CYMBAL_1(49),
        RIM_CLICK(37);

        private int value;
        Value(int value){
            this.value = value;
        }

        public boolean isMelodic(){
            return value >= C.value && value <= B.value;
        }

        protected Value increment(int offset) {
            if(isMelodic())
                return fromInt((getValue() + offset) % 12);
            else
                return this;
        }

        protected static Value fromInt(int value){
            switch (value){
                case 0:
                    return C;
                case 1:
                    return C_SHARP;
                case 2:
                    return D;
                case 3:
                    return D_SHARP;
                case 4:
                    return E;
                case 5:
                    return F;
                case 6:
                    return F_SHARP;
                case 7:
                    return G;
                case 8:
                    return G_SHARP;
                case 9:
                    return A;
                case 10:
                    return A_SHARP;
                case 11:
                    return B;
                default:
                    return REST;
            }
        }

        protected int getValue(){
            return value;
        }


    };

    private Value value;
    private Octave octave = Octave.FIFTH;

    public Note(Value value, Octave octave, Duration duration){
        super(duration);
        this.value = value;
        this.octave = octave;
    }

    public Note(Value value, Octave octave){
        super(Duration.QUARTER);
        this.value = value;
        this.octave = octave;
    }

    public Note(Value value, Duration duration){
        super(duration);
        this.value = value;
    }

    public Note(Value value){
        super(Duration.QUARTER);
        this.value = value;
    }

    public int getNumber(){
        return Note.getNumber(value, octave);
    }

    public static int getNumber(Value value, Octave octave){
        if(value == Value.REST)
            return -1;
        else if(value.ordinal() <= 17)
            return octave.getNumber() * 12 + value.getValue();
        else
            return value.getValue();
    }

    @Override
    public void play(MidiChannel midiChannel) {
        if(this.value != Value.REST)
            midiChannel.noteOn(getNumber(), 100);
        System.out.println("Playing: " + this.value.name() + "(" + getNumber() + ")");
    }

    public Note transpose(int offset){
        //THIS IS NOT RIGHT!
        //NEED TO SKIP ALIASES
        if(value.ordinal() <= 17) {
            Octave octave = this.octave;
            if(value.ordinal() + offset > 17) {
                octave = octave.transpose(1);
            }else if(value.ordinal() + offset < 0) {
                octave = octave.transpose(-1);
            }
            return new Note(value.increment(offset), octave, duration);
        }
        else
            return this;
    }


}
