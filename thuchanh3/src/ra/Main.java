package ra;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();


        try {
            while (count.getMyThread().isAlive()) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
