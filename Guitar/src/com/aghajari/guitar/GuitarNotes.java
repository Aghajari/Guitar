package com.aghajari.guitar;

public class GuitarNotes {

    public static final Note[] FIRST_STRING = new Note[]{
            new Note("E", 329),
            new Note("F", 349),
            new Note("F#", 370),
            new Note("G", 392),
            new Note("G#", 415),
            new Note("A", 440),
            new Note("A#", 466),
            new Note("B", 494),
            new Note("C", 523),
            new Note("C#", 554),
            new Note("D", 587),
            new Note("D#", 622),
            new Note("E", 659),
            new Note("F", 698),
            new Note("F#", 740),
            new Note("G", 784),
            new Note("G#", 831),
            new Note("A", 880),
            new Note("A#", 932),
            new Note("B", 988),
            new Note("C", 1047)
    };

    public static final Note[] SECOND_STRING = new Note[]{
            new Note("B", 247),
            new Note("C", 262),
            new Note("C#", 277),
            new Note("D", 294),
            new Note("D#", 311),
            new Note("E", 329),
            new Note("F", 349),
            new Note("F#", 370),
            new Note("G", 392),
            new Note("G#", 415),
            new Note("A", 440),
            new Note("A#", 466),
            new Note("B", 494),
            new Note("C", 523),
            new Note("C#", 554),
            new Note("D", 587),
            new Note("D#", 622),
            new Note("E", 659),
            new Note("F", 698),
            new Note("F#", 740),
            new Note("G", 784)
    };

    public static final Note[] THIRD_STRING = new Note[]{
            new Note("G", 196),
            new Note("G#", 208),
            new Note("A", 220),
            new Note("A#", 233),
            new Note("B", 247),
            new Note("C", 262),
            new Note("C#", 277),
            new Note("D", 294),
            new Note("D#", 311),
            new Note("E", 329),
            new Note("F", 349),
            new Note("F#", 370),
            new Note("G", 392),
            new Note("G#", 415),
            new Note("A", 440),
            new Note("A#", 466),
            new Note("B", 494),
            new Note("C", 523),
            new Note("C#", 554),
            new Note("D", 587),
            new Note("D#", 622)
    };

    public static final Note[] FOURTH_STRING = new Note[]{
            new Note("D", 147),
            new Note("D#", 156),
            new Note("E", 165),
            new Note("F", 175),
            new Note("F#", 185),
            new Note("G", 196),
            new Note("G#", 208),
            new Note("A", 220),
            new Note("A#", 233),
            new Note("B", 247),
            new Note("C", 262),
            new Note("C#", 277),
            new Note("D", 294),
            new Note("D#", 311),
            new Note("E", 329),
            new Note("F", 349),
            new Note("F#", 370),
            new Note("G", 392),
            new Note("G#", 415),
            new Note("A", 440),
            new Note("A#", 466)
    };

    public static final Note[] FIFTH_STRING = new Note[]{
            new Note("A", 117),
            new Note("A#", 123),
            new Note("B", 131),
            new Note("C", 139),
            new Note("C#", 147),
            new Note("D", 156),
            new Note("D#", 165),
            new Note("E", 175),
            new Note("F", 185),
            new Note("F#", 247),
            new Note("G", 196),
            new Note("G#", 208),
            new Note("A", 220),
            new Note("A#", 233),
            new Note("B", 247),
            new Note("C", 262),
            new Note("C#", 277),
            new Note("D", 294),
            new Note("D#", 311),
            new Note("E", 329),
            new Note("F", 349)
    };

    public static final Note[] SIXTH_STRING = new Note[]{
            new Note("E", 82),
            new Note("F", 87),
            new Note("F#", 92),
            new Note("G", 98),
            new Note("G#", 104),
            new Note("A", 110),
            new Note("A#", 117),
            new Note("B", 123),
            new Note("C", 131),
            new Note("C#", 139),
            new Note("D", 147),
            new Note("D#", 156),
            new Note("E", 165),
            new Note("F", 175),
            new Note("F#", 185),
            new Note("G", 196),
            new Note("G#", 208),
            new Note("A", 220),
            new Note("A#", 233),
            new Note("B", 247),
            new Note("C", 262)
    };

    public static final Note[][] STRINGS = new Note[][]{
            FIRST_STRING,
            SECOND_STRING,
            THIRD_STRING,
            FOURTH_STRING,
            FIFTH_STRING,
            SIXTH_STRING
    };

    static {
        for (int i = 0; i < 6; i++)
            for (Note n : STRINGS[i])
                n.setIndex(i);
    }
}
