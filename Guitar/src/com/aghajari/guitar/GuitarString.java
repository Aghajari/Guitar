package com.aghajari.guitar;

import java.util.Random;

public class GuitarString {

    private final GuitarTuner tuner;
    private float[] waveTable = null;

    private int pitch;
    private int currentSampleIndex;
    private float prevSample;
    private long startTime;
    private int delay;
    private OnPitchChanged listener = null;

    public interface OnPitchChanged {
        void onChange(int pitch);
    }

    public void setListener(OnPitchChanged listener) {
        this.listener = listener;
    }

    public GuitarString(float rate) {
        this(new GuitarTuner(rate));
    }

    public GuitarString(GuitarTuner tuner) {
        this.tuner = tuner;
    }

    public GuitarTuner getTuner() {
        return tuner;
    }

    public int getPitch() {
        return pitch;
    }

    public synchronized void setPitch(int pitch, int delay) {
        if (listener != null)
            listener.onChange(pitch);

        if (pitch < 0) {
            waveTable = null;
            return;
        }

        this.delay = delay;
        this.pitch = pitch;
        currentSampleIndex = 0;
        prevSample = 0;

        Random random = new Random();
        waveTable = new float[(int) (tuner.getSampleRate() / pitch)];
        for (int i = 0; i < waveTable.length; i++)
            waveTable[i] = random.nextInt(2) * 2 - 1; // -1 or 1
    }

    public synchronized float next() {
        if (waveTable == null || delay-- > 0)
            return 0;

        long now = System.currentTimeMillis();
        if (currentSampleIndex == 0)
            startTime = now;
        else if (now > startTime + tuner.getStopPeriodInMillis() + tuner.getPluckPeriodInMillis())
            return 0;

        int i = currentSampleIndex % waveTable.length;
        float gain = 1f;

        long duration = now - startTime;
        if (duration > tuner.getPluckPeriodInMillis()) {
            duration -= tuner.getPluckPeriodInMillis();
            gain = 1 - Math.min((duration * 1f) / tuner.getStopPeriodInMillis(), 1f);
        }

        if (Utils.getBinomial(1, 1 - (1 / tuner.calculateStretch(pitch))) == 0)
            waveTable[i] = 0.5f * (waveTable[i] + prevSample);

        currentSampleIndex++;
        return (prevSample = waveTable[i]) * gain;
    }
}
