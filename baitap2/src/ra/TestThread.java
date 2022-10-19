package ra;

import java.security.spec.RSAOtherPrimeInfo;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try{
            oddThread.join();
        }catch (Exception e){
            System.err.println("dkasdjkals");
        }
        evenThread.start();
    }
}
