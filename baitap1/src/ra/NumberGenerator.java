package ra;

public class NumberGenerator implements Runnable{
    private final Thread myThread;

    public NumberGenerator() {
        this.myThread = new Thread(this,"number");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

}
