package com.aghajari.tab;

import com.aghajari.guitar.Tablature;

/**
 * Kooh
 * Shadmehr Aghili
 */
public class Kooh {

    public static Tablature create() {
        return new Tablature()
                .withListener((note, i) -> System.out.println(note))
                .add(2, 0, 0)
                .add(2, 3, 500)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(2, 3, 500)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(2, 3, 800)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(1, 1, 800)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(2, 3, 200)
                .add(1, 1, 200)
                .add(2, 0, 850)
                .add(2, 3, 500)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(2, 3, 500)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(2, 0, 800)
                .add(2, 3, 200)
                .add(2, 1, 200)
                .add(2, 1, 800)
                .add(2, 3, 200)
                .add(2, 1, 200)
                .add(2, 0, 200)
                .add(2, 1, 200)
                .add(2, 0, 800)
                .add(1, 3, 400)
                .add(1, 3, 300)
                .add(1, 3, 300)
                .add(1, 3, 300)
                .add(1, 3, 300)
                .add(1, 3, 300)
                .add(1, 3, 300)
                .add(1, 3, 600) // a
                .add(1, 4, 200) // room
                .add(0, 1, 200) // a
                .add(0, 3, 200) // room
                .add(1, 3, 600) // mard
                .add(1, 3, 500) // mi
                .add(1, 3, 400) // shod
                .add(0, 1, 800) // ran
                .add(1, 4, 200) // ge
                .add(1, 3, 200) // cheh
                .add(1, 1, 200) // rash
                .add(1, 1, 600) // zard
                .add(1, 1, 600) // mi
                .add(1, 1, 400) // shod
                .add(2, 0, 600) // az
                .add(1, 1, 200) // bo
                .add(1, 3, 200) // lan
                .add(1, 4, 200) // di
                .add(1, 4, 700) // part
                .add(1, 3, 500) // mi
                .add(1, 3, 400) // shod
                .add(2, 3, 800) // ghe
                .add(1, 3, 200) // se
                .add(1, 3, 230) // in
                .add(1, 1, 430) // bood
                .add(1, 1, 800)
                .add(1, 3, 200)
                .add(1, 1, 200)
                .add(1, 3, 200)
                .add(1, 4, 200)
                .add(0, 3, 850) // ghe
                .add(0, 6, 200) // se
                .add(0, 6, 230) // in
                .add(0, 6, 430) // bood
                .add(0, 6, 800)
                .add(0, 8, 200)
                .add(0, 6, 200)
                .add(0, 8, 200)
                .add(0, 10, 200)
                .add(2, 0, 500) // ba
                .add(2, 1, 200) // ye
                .add(2, 3, 200) // mosht
        ;
    }
}
