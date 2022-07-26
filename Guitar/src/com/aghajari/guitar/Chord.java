package com.aghajari.guitar;

public class Chord {

    private final String name;
    private final Note[] notes;

    public Chord(String name, Note[] notes) {
        this.name = name;
        this.notes = notes;
    }

    public Chord(String name, int... tab) {
        this(0, name, tab);
    }

    public Chord(int barre, String name, int... tab) {
        this.name = name;
        this.notes = new Note[6];

        for (int i = 0; i < 6; i++) {
            if (tab.length <= i || tab[i] < 0 || tab[i] > 20)
                notes[i] = Note.UNDEFINED[i];
            else
                notes[i] = GuitarNotes.STRINGS[i][Math.max(tab[i], barre)];
        }
    }

    /**
     * @return Chord Name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Chord Notes
     */
    public Note[] getNotes() {
        return notes;
    }

}
