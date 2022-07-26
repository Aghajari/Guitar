package com.aghajari;

import com.aghajari.guitar.*;
import com.aghajari.tab.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Guitar guitar = new Guitar(8000, 1);
        guitar.start();

        Kooh.create().start(guitar);

        // Play Note
        /*
        guitar.playNote(GuitarNotes.SECOND_STRING[2]);
        Thread.sleep(1000);
         */

        // Play Chords
        /*
        guitar.playChordSubsequentlyReverse(GuitarChords.Em);
        Thread.sleep(2400);
        guitar.playChordSubsequentlyReverse(GuitarChords.Dm);
        */

        // Play Tablature
        //Kooh.create().start(guitar);
        //DoPanjereh.create().start(guitar);
        //Sarnevesht.create().start(guitar);

        // Custom GuitarString
        /*
        GuitarString string = new GuitarString(8000);
        new GuitarStringPlayer(string, 1).start();
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 3; j++) {
                Thread.sleep(200);
                string.setPitch(GuitarNotes.STRINGS[i][j].getFrequency(), 0);
            }
        }
         */
    }
}
