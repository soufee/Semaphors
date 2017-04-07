import java.util.Random;

/**
 * Created by Shoma on 07.04.2017.
 */
public class Cubator implements Runnable{
    SimpleSemaphore semaphore = new SimpleSemaphore();
    Consumer consumer = new Consumer();

    Random random;

    public Cubator(SimpleSemaphore semaphore, Consumer consumer) {
        this.semaphore = semaphore;
        this.consumer = consumer;

    }

    @Override
    public void run() {
        synchronized (semaphore.cubatorObj) {
            random = new Random();
            int n = random.nextInt(15);
          
            consumer.met(n, 0, 0,this);
        }
    }
}
