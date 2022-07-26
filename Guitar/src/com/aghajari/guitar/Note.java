package com.aghajari.guitar;

public class Note {

    public static final Note[] UNDEFINED = new Note[] {
            new Note(null, -1, 0),
            new Note(null, -1, 1),
            new Note(null, -1, 2),
            new Note(null, -1, 3),
            new Note(null, -1, 4),
            new Note(null, -1, 5)
    };

    private final String name;
    private final int frequency;
    private int index;

    public Note(String name, int frequency) {
        this(name, frequency, 0);
    }

    public Note(String name, int frequency, int stringIndex) {
        this.name = name;
        this.frequency = frequency;
        this.index = stringIndex;
    }

    protected void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return Note Name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Note Frequency in Hz
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * @return Index of Guitar String
     */
    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name + " (" + frequency + "Hz)";
    }
}
