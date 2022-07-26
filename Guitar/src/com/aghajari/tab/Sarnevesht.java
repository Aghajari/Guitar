package com.aghajari.tab;

import com.aghajari.guitar.Tablature;

/**
 * Sarnevesht
 * Shadmehr Aghili
 */
public class Sarnevesht {

    public static Tablature create() {
        return new Tablature()
                .withListener((note, i) -> System.out.println(note))
                .add(0, 3, 0)
                .add(0, 2, 1800)
                .add(0, 3, 1800)
                .add(0, 5, 1800)
                .add(0, 3, 1800)
                .add(0, 2, 1800)
                .add(0, 0, 1500)
                .add(0, 2, 300)
                .add(0, 3, 300)
                .add(0, 3, 1000)
                .add(0, 7, 350)
                .add(0, 7, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 3, 350)
                .add(0, 3, 350)
                .add(0, 7, 350)
                .add(0, 7, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 3, 350)
                .add(0, 3, 350)
                .add(0, 7, 350)
                .add(0, 7, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 5, 350)
                .add(0, 3, 350)
                .add(0, 2, 200)
                .add(0, 3, 200)
                .add(0, 0, 1500)    // kho
                .add(0, 2, 200)     // na
                .add(0, 0, 200)     // moon
                .add(1, 0, 1500)    // mey
                .add(0, 0, 200)     // doo
                .add(1, 3, 200)     // ne
                .add(0, 0, 200)     // jang
                .add(1, 3, 450)     // nist
                .add(0, 0, 1500)    // man
                .add(0, 2, 200)     // be
                .add(0, 0, 200)     // kha
                .add(0, 0, 500)     // te
                .add(0, 0, 200)     // re
                .add(1, 0, 1500)    // to
                .add(1, 3, 200)     // in
                .add(1, 1, 450)     // jam
                .add(1, 3, 1500)    // sa
                .add(0, 0, 200)     // re
                .add(0, 2, 200)     // chi
                .add(1, 3, 1500)    // ba
                .add(1, 3, 250)     // yad
                .add(1, 1, 225)     // be
                .add(1, 3, 200)     // jan
                .add(0, 0, 400)     // gim
                .add(1, 1, 1500)    // man
                .add(1, 3, 200)     // a
                .add(0, 0, 200)     // zat
                .add(0, 0, 900)
                .add(0, 2, 200)
                .add(0, 0, 200)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(1, 1, 900)     // chi
                .add(1, 1, 300)     // zi
                .add(1, 0, 250)     // ne
                .add(0, 2, 220)     // mi
                .add(0, 0, 420);    // kham
    }
}
