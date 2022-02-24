package multiThreading.q2;

/*
* Use a singleThreadExecutor, newCachedThreadPool() and
* newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Class to implement newCachedThreadPool.
public class cachedThreadPoolExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts here.");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            service.execute(new LoopTask());
        }
        service.shutdown();
        System.out.println("Main thread ends here.");
    }
}