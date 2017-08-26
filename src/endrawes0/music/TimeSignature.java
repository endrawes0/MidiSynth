package endrawes0.music;

/**
 * Create on 8/23/17.
 */
public class TimeSignature {
    private int beatsPerMeasure;
    private Duration beatDivisor;

    public TimeSignature(int beatsPerMeasure, Duration beatDivisor){
        this.beatsPerMeasure = beatsPerMeasure;
        this.beatDivisor = beatDivisor;
    }

    public Duration getBeatDivisor(){
        return beatDivisor;
    }

    public int getBeatsPerMeasure() {
        return beatsPerMeasure;
    }
}
