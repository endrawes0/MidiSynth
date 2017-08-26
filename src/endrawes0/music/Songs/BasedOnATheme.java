package endrawes0.music.Songs;

import endrawes0.music.actions.Note;

import java.util.List;

/**
 * Created by ahaddad15 on 8/26/17.
 */
public class BasedOnATheme implements Song {

    List<Note> theme;

    public BasedOnATheme(Note ... notes){
        for (Note note : notes) {
            theme.add(note);
        }


    }

    @Override
    public void play() {

    }
}
