package multiThreading.q2;

/*
* Use a singleThreadExecutor, newCachedThreadPool() and
* newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.
*/

import java.util.concurrent.TimeUnit;

//Class to represent a task
public class LoopTask implements Runnable {
    private static int count = 0;
    private int id;

    @Override
    public void run() {
        System.out.println("##### <Task-"+id+"> Starting #####");
        for (int i = 10; i > 0; i--) {
            System.out.println("<"+id+"> Tick Tick - "+i);
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("##### <Task-"+id+"> Completed #####");
    }

    LoopTask() {
        this.id = ++count;
    }
}