/**
 * Created by Shoma on 07.04.2017.
 */
public class SimpleSemaphore {
    boolean taken = false;
Object simplerObj = new Object();
Object quadratorObj = new Object();
Object cubatorObj = new Object();

    public synchronized void take() {
        this.taken = true;
        this.notify();
    }



    public synchronized void release() throws InterruptedException {
        while (!this.taken) wait();
        this.taken = false;
    }

}
