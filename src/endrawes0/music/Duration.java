package endrawes0.music;

/**
 * Create on 8/20/17.
 */
public enum Duration {
    WHOLE,
    HALF,
    QUARTER,
    EIGTH,
    SIXTEENTH,
    THIRTY_SECOND,
    QUARTER_TRIPOLET,
    EIGTH_TRIPOLET,
    SIXTEENTH_TRIPOLET;

    public int milliseconds(int tempo, TimeSignature timeSignature){
        double bps = tempo/60;
        double seconds = portion(timeSignature)*timeSignature.getBeatsPerMeasure()/bps;
        return (int) (seconds * 1000);
    }

    public double portion(TimeSignature timeSignature){
        return ((double)timeSignature.getBeatDivisor().getDenominator()/getDenominator()/timeSignature.getBeatsPerMeasure());
    }


    private int getDenominator(){
        switch (this){
            case WHOLE:
                return 1;
            case HALF:
                return 2;
            case QUARTER:
                return 4;
            case EIGTH:
                return 8;
            case SIXTEENTH:
                return 16;
            case THIRTY_SECOND:
                return 32;
            case QUARTER_TRIPOLET:
                return 12;
            case EIGTH_TRIPOLET:
                return 24;
            case SIXTEENTH_TRIPOLET:
                return 48;
            default:
                return 0;
        }
    }

}
