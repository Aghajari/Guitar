package com.aghajari.guitar;

import javax.sound.sampled.*;

/**
 * Creates a new thread and starts listening to a {@link GuitarString}.
 */
public class GuitarStringPlayer extends Thread {

    private final GuitarString string;
    private SourceDataLine sound;
    private final byte[] bi = new byte[1];

    public GuitarStringPlayer(GuitarString string, int channels) {
        this.string = string;
        AudioFormat af = new AudioFormat(string.getTuner().getSampleRate(),
                8, channels,
                false, false);

        try {
            sound = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, af));
            sound.open(af);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        sound.start();
        string.setListener(pitch -> sound.flush());

        while (true) {
            if (isInterrupted())
                return;

            for (int i = 0; i < bi.length; i++)
                bi[i] = next(string.next());

            sound.write(bi, 0, bi.length);
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        sound.close();
        string.setListener(null);
    }

    // Convert 32-bit floating-point (signed) wav to 8-bit PCM (unsigned)
    protected byte next(float v) {
        return (byte) (v * 127 + 127);
    }

}
