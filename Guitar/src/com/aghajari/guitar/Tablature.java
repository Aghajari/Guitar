package com.aghajari.guitar;

import java.util.ArrayList;

public class Tablature {

    private TablatureThread thread;
    private final ArrayList<Data> list = new ArrayList<>();

    private OnNotePlayed listener = null;

    public interface OnNotePlayed {
        void onPlay(Note note, int index);
    }

    public Tablature add(int stringIndex, int fret, int gap) {
        return add(GuitarNotes.STRINGS[stringIndex][fret], gap);
    }

    public Tablature add(Note note, int sleep) {
        if (isPlaying())
            throw new RuntimeException("Can not add note to tablature while is playing!");

        list.add(new Data(note, sleep));
        return this;
    }

    public Tablature withListener(OnNotePlayed listener) {
        this.listener = listener;
        return this;
    }

    public void start(Guitar guitar) {
        stop();
        thread = new TablatureThread(guitar);
        thread.start();
    }

    public void stop() {
        if (thread != null)
            thread.interrupt();
    }

    public boolean isPlaying() {
        return thread != null && thread.isAlive();
    }

    public boolean isStopped() {
        return thread != null && !thread.isInterrupted();
    }

    public int getSize() {
        return list.size();
    }

    public Note getNoteAt(int index) {
        return list.get(index).note;
    }

    public int getGapAt(int index) {
        return list.get(index).sleep;
    }

    public void setGapAt(int index, int gap) {
        list.get(index).sleep = gap;
    }

    private class TablatureThread extends Thread {

        private final Guitar guitar;

        private TablatureThread(Guitar guitar) {
            this.guitar = guitar;
        }

        @Override
        public void run() {
            super.run();

            int i = 0;
            for (Data data : list) {
                try {
                    Thread.sleep(data.sleep);
                } catch (InterruptedException e) {
                    break;
                }
                listener.onPlay(data.note, i++);
                guitar.playNote(data.note);
            }
        }
    }

    private static class Data {
        private final Note note;
        private int sleep;

        private Data(Note note, int sleep) {
            this.note = note;
            this.sleep = sleep;
        }
    }
}
