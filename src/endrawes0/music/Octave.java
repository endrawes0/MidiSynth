package endrawes0.music;

/**
 * Create on 8/19/17.
 */
public enum Octave {
    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    FIFTH,
    SIXTH,
    SEVENTH,
    EIGHTH,
    NINTH;

    public int getNumber(){
        return ordinal() + 1;
    }

    public Octave transpose(int i) {
        return Octave.values()[(ordinal() + i) % Octave.values().length];
    }
}
