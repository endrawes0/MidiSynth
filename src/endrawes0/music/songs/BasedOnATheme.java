package endrawes0.music.songs;

import endrawes0.music.actions.Note;

import java.util.Collections;
import java.util.List;

/**
 * Create on 8/26/17.
 */
public class BasedOnATheme implements Song {

    private List<Note> theme;

    public BasedOnATheme(Note ... notes){
        Collections.addAll(theme, notes);
    }

    @Override
    public void play() {

    }
}
