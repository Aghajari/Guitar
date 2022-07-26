package com.aghajari.guitar;

/**
 * Simulates Guitar
 * Using Karplus–Strong string synthesis
 * Creates 6 thread for each {@link GuitarString}.
 *
 * @author AmirHossein Aghajari
 * @see <a href="https://en.wikipedia.org/wiki/Karplus%E2%80%93Strong_string_synthesis">Wikipedia</a>
 */
public class Guitar {

    private final GuitarString[] strings = new GuitarString[6];
    private final GuitarStringPlayer[] players = new GuitarStringPlayer[6];
    private boolean playUndefinedNotes = true;

    public boolean isPlayUndefinedNotes() {
        return playUndefinedNotes;
    }

    public void setPlayUndefinedNotes(boolean playUndefinedNotes) {
        this.playUndefinedNotes = playUndefinedNotes;
    }

    public Guitar(float rate, int channels) {
        for (int i = 0; i < 6; i++) {
            strings[i] = new GuitarString(rate);
            players[i] = new GuitarStringPlayer(strings[i], channels);
        }
    }

    public void start() {
        for (GuitarStringPlayer player : players)
            player.start();
    }

    public boolean isAlive() {
        return players[0].isAlive();
    }

    public boolean isDestroyed() {
        return players[0].isInterrupted();
    }

    public GuitarString getGuitarString(int index) {
        return strings[index];
    }

    public void playNote(Note note) {
        playNote(note, 0);
    }

    public void playNote(Note note, int delay) {
        if (note.getFrequency() == -1) {
            if (playUndefinedNotes)
                playNote(GuitarNotes.STRINGS[note.getIndex()][0], delay);

            return;
        }

        getGuitarString(note.getIndex()).setPitch(note.getFrequency(), delay);
    }

    public void playChord(Chord chord) {
        playChord(chord, (int) (strings[0].getTuner().getSampleRate() / 50));
    }

    public void playChordSubsequently(Chord chord) {
        playChord(chord, (int) (strings[0].getTuner().getSampleRate() / 4));
    }

    public void playChordSubsequentlyReverse(Chord chord) {
        playChordReverse(chord, (int) (strings[0].getTuner().getSampleRate() / 4));
    }

    public void playChord(Chord chord, int delay) {
        for (int i = 0; i < chord.getNotes().length; i++)
            playNote(chord.getNotes()[i], delay * i);
    }

    public void playChordReverse(Chord chord) {
        playChordReverse(chord, (int) (strings[0].getTuner().getSampleRate() / 50));
    }

    public void playChordReverse(Chord chord, int delay) {
        for (int i = 0; i < chord.getNotes().length; i++)
            playNote(chord.getNotes()[i], delay * (chord.getNotes().length - i - 1));
    }

    public void playChord(Chord chord, int[] delay) {
        for (int i = 0; i < chord.getNotes().length; i++)
            playNote(chord.getNotes()[i], delay[i]);
    }

    public void destroy() {
        for (int i = 0; i < 6; i++)
            players[i].interrupt();
    }
}
