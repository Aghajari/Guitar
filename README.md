# Guitar
 Guitar simulation using [Karplus-Strong](https://en.wikipedia.org/wiki/Karplus%E2%80%93Strong_string_synthesis) written in pure java. Playing some famous iranian songs by tablature!

Creates 6 thread for each `GuitarString` whenever you start an instance of `Guitar`, So if you play two note on two different strings, they won't block each other, meanwhile you can't play two notes on same string at the same time! Just like a real Guitar :)

### **Create an instance of Guitar:**
```java
Guitar guitar = new Guitar(8000, 1);
guitar.start();
```

## **Play Note:**
```java
guitar.playNote(GuitarNotes.STRINGS[string_index][fret_index]);
// OR
guitar.playNote(new Note(null, 98 /* freq */));
```

![](https://i.pinimg.com/564x/e7/66/fe/e766fe6b05367c663a131809c5d5582d.jpg)

## **Play Chord:**

```java
guitar.playChordSubsequently(GuitarChords.Em);
// OR
guitar.playChordReverse(new Chord("Dm", 1, 3, 2, 0, -1, -1));
// OR
guitar.playChordSubsequentlyReverse(new Chord(3, "Gm", 0, 0, 0, 5, 5, 0));
```
*Note: There are more interesting functions to customize playing a chord*

<img src="https://user-images.githubusercontent.com/30867537/181079773-c1257cfb-06d0-4dee-bfb8-13ae9d5ba60d.jpeg" width=200 title="Dm"><img src="https://user-images.githubusercontent.com/30867537/181080123-a98d2031-836b-49e0-b05d-2f7e30af0c27.png" width=200 title="Gm">

## Custom GuitarString
Create a custom string with its own thread
```java
GuitarString string = new GuitarString(8000);
new GuitarStringPlayer(string, 1).start();
for (int i = 0; i < 6; i++) {
    for (int j = 1; j <= 3; j++) {
        Thread.sleep(200);
        string.setPitch(GuitarNotes.STRINGS[i][j].getFrequency(), 0);
    }
}
```

https://user-images.githubusercontent.com/30867537/181086019-d5841071-c2f9-4673-acef-3b714b812693.mov


## **Play Tablature:**

```java
new Tablature()
        .withListener((note, i) -> System.out.println(note))
        .add(2, 0, 0)
        .add(2, 3, 500)
        .add(1, 3, 200)
        .add(1, 1, 200)
        .add(2, 3, 500)
        ...
        .start(guitar);
```
<img src="https://user-images.githubusercontent.com/30867537/181081997-bfa895cc-788b-4413-a21d-9b73e4eacc5b.jpeg" height=500 title="Kooh-ShadmehrAghili">

https://user-images.githubusercontent.com/30867537/181081719-ff58b732-1c61-4217-9fa3-9e8118af6866.mp4

**See More:**
- Sarnevesht - Shadmehr Aghili
- Kooh - Shadmehr Aghili
- Do Panjereh - Googoosh

## Android Implementation

Replace [`javax.sound.sampled`](https://docs.oracle.com/javase/7/docs/api/javax/sound/sampled/package-summary.html) with [`android.media.AudioTrack`](https://developer.android.com/reference/android/media/AudioTrack) in `GuitarStringPlayer`.

## References
- [Karplus-Strong Wikipedia](https://en.wikipedia.org/wiki/Karplus%E2%80%93Strong_string_synthesis)
- [Karplus-Strong algorithm Python](https://flothesof.github.io/Karplus-Strong-algorithm-Python.html)
- [Digital Synthesis of Plucked-String](https://users.soe.ucsc.edu/~karplus/papers/digitar.pdf)
- [Guitar Frets & Their Notes vs Frequency](https://www.pinterest.com/pin/400257485634480639/)
- [Kooh-ShadmehrAghili Guitar Tab](https://www.notdoni.com/music/11351/%D9%86%D8%AA-%D9%88-%D8%AA%D8%A8%D9%84%DA%86%D8%B1-%DA%AF%DB%8C%D8%AA%D8%A7%D8%B1-%D8%A2%D9%87%D9%86%DA%AF-%DA%A9%D9%88%D9%87-%D8%A7%D8%B2-%D8%B4%D8%A7%D8%AF%D9%85%D9%87%D8%B1-%D8%B9%D9%82%DB%8C%D9%84%DB%8C--%D8%A8%D9%87-%D9%87%D9%85%D8%B1%D8%A7%D9%87-%D8%A2%DA%A9%D9%88%D8%B1%D8%AF/)

<br><br>
<div align="center">
  <img width="64" alt="LCoders | AmirHosseinAghajari" src="https://user-images.githubusercontent.com/30867537/90538314-a0a79200-e193-11ea-8d90-0a3576e28a18.png">
  <br><a>Amir Hossein Aghajari</a> • <a href="mailto:amirhossein.aghajari.82@gmail.com">Email</a> • <a href="https://github.com/Aghajari">GitHub</a>
</div>
