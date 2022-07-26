package com.aghajari.guitar;

public class GuitarTuner {

    private float sampleRate;
    private float stretchFactor = 2f;
    private long pluckPeriodInMillis = 1000;
    private long stopPeriodInMillis = 3000;

    public GuitarTuner(float sampleRate) {
        this.sampleRate = sampleRate;
    }

    public float getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(float sampleRate) {
        this.sampleRate = sampleRate;
    }

    public float getStretchFactor() {
        return stretchFactor;
    }

    public void setStretchFactor(float stretchFactor) {
        this.stretchFactor = stretchFactor;
    }

    public long getPluckPeriodInMillis() {
        return pluckPeriodInMillis;
    }

    public void setPluckPeriodInMillis(long pluckPeriod) {
        this.pluckPeriodInMillis = pluckPeriod;
    }

    public long getStopPeriodInMillis() {
        return stopPeriodInMillis;
    }

    public void setStopPeriodInMillis(long stopPeriodInMillis) {
        this.stopPeriodInMillis = stopPeriodInMillis;
    }

    public float calculateStretch(int pitch) {
        return stretchFactor * pitch / 98;
    }
}
