package com.aghajari.tab;

import com.aghajari.guitar.Tablature;

/**
 * Do Panjereh
 * Googoosh
 */
public class DoPanjereh {

    public static Tablature create() {
        int gap = 320;
        int gap2 = 1000;

        return new Tablature()
                .withListener((note, i) -> System.out.println(note))
                .add(0, 0, 0)
                .add(1, 0, gap)
                .add(1, 0, gap)
                .add(0, 0, gap)
                .add(0, 0, gap)
                .add(0, 2, gap)
                .add(0, 2, gap)
                .add(0, 3, gap)
                .add(0, 3, gap + 20)
                .add(0, 2, gap + 40)
                .add(0, 2, gap + 60)
                .add(0, 0, gap + 80)
                .add(0, 0, gap2)
                .add(1, 1, gap)
                .add(1, 1, gap)
                .add(0, 0, gap)
                .add(0, 0, gap)
                .add(0, 2, gap)
                .add(0, 2, gap)
                .add(0, 3, gap)
                .add(0, 3, gap + 20)
                .add(0, 2, gap + 40)
                .add(0, 2, gap + 60)
                .add(0, 0, gap + 80)
                .add(0, 0, gap2)
                .add(1, 0, gap)
                .add(1, 0, gap)
                .add(0, 0, gap)
                .add(0, 0, gap)
                .add(0, 2, gap)
                .add(0, 2, gap)
                .add(0, 3, gap)
                .add(0, 3, gap + 20)
                .add(0, 2, gap + 40)
                .add(0, 2, gap + 60)
                .add(0, 0, gap + 80)
                .add(1, 4, gap2)
                .add(1, 5, gap)
                .add(1, 4, gap + 20)
                .add(1, 2, gap + 40)
                .add(1, 4, gap + 80)
                .add(0, 0, gap2 + 150);
    }
}
