public class OptimizedPrimeFactorization implements Runnable{
    private Thread thread;
    private final String threadName;
    public OptimizedPrimeFactorization(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        int cnt = 0;
        int N = 2;
        while (cnt!=30){
            boolean check =false;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N%i==0){
                    check=true;
                    break;
                }
            }
            if (!check){
                System.err.println(N);
                cnt++;
            }
            N++;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void start() {
        System.out.println("OptimizedPrimeFactorization " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
