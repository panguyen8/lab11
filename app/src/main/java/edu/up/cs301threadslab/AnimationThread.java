package edu.up.cs301threadslab;

public class AnimationThread extends Thread {
    private AnimationView instance;
    AnimationThread(AnimationView v) {
        instance = v;
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            instance.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
