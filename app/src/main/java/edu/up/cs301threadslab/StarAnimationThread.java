package edu.up.cs301threadslab;

public class StarAnimationThread extends Thread {

    private StarAnimation instance;
    StarAnimationThread(StarAnimation v) {
        instance = v;
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            if ((int) Math.random()*2 == 0) {

                instance.addStar();

            } else {
                instance.removeStar();
            }
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
            }
        }

    }
}
