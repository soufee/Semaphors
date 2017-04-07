import java.util.Random;

/**
 * Created by Shoma on 07.04.2017.
 */
public class Quadrator implements Runnable {
    static int counter = 0;
    SimpleSemaphore semaphore = new SimpleSemaphore();
    Consumer consumer = new Consumer();

    Random random;

    public Quadrator(SimpleSemaphore semaphore, Consumer consumer) {
        this.semaphore = semaphore;
        this.consumer = consumer;
counter++;
    }

    @Override
    public void run() {
        synchronized (semaphore.quadratorObj) {
            random = new Random();
            int n = random.nextInt(10);


            consumer.met(0, n, 0,this);
        }
    }
}
