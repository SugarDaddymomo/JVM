package multiThreading;

/*
* Write a program to simulate a deadlock in java and
* then improve the program to handle the deadlock using Re-entrant lock.
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A interrupted.");
        }
        System.out.println(name+" trying to call B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B interrupted.");
        }
        System.out.println(name+" trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside B.last");
    }
}

public class q5 implements Runnable {
    A a = new A();
    B b = new B();
    Thread t;

    //Making a object of Re-entrantlock to lock the operation
    //or should i say to make an operation, atomic operation.
    Lock lock = new ReentrantLock();

    q5() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadlockStart() {
        t.start();

        //locked before performing the operation.
        lock.lock();

        //get lock on a in this thread.
        a.foo(b);

        //unlocked after done with the operation.
        lock.unlock();
        System.out.println("Back in main thread.");
    }
    public void run() {
        //locked before performing the operation.
        lock.lock();

        //get lock on b in other thread.
        b.bar(a);

        //unlocked after done with the operation.
        lock.unlock();
        System.out.println("Back in other thread.");
    }
    public static void main(String[] args) {
        q5 obj = new q5();
        obj.deadlockStart();
    }
}