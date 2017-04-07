import java.util.Random;

/**
 * Created by Shoma on 07.04.2017.
 */
public class Simpler implements Runnable {
    SimpleSemaphore semaphore = new SimpleSemaphore();
    Consumer consumer = new Consumer();

    Random random;

    public Simpler(SimpleSemaphore semaphore, Consumer consumer) {
        this.semaphore = semaphore;
        this.consumer = consumer;


    }

    @Override
    public void run() {
        synchronized (semaphore.simplerObj) {
            random = new Random();
            int n = random.nextInt(5);


            consumer.met(0, 0, n,this);
        }
    }
}