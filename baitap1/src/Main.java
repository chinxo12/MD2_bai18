import ra.NumberGenerator;

import javax.crypto.MacSpi;

public class Main {
    public static void main(String[] args) {
        NumberGenerator count = new NumberGenerator();
        NumberGenerator count2 = new NumberGenerator();
        try
        {
            while(count.getMyThread().isAlive())
            {
//                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
        try
        {
            while(count2.getMyThread().isAlive())
            {
//                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
    }
}