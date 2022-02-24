package multiThreading.q3;

/*
* Use Synchronize method and synchronize block to enable
* synchronization between multiple threads trying to access method at same time.
*/


//Program to show working of synchronized keyword used with block.
class Table {
    void printTable(int n) {
        //synchronized block
        synchronized(this) {
            for(int i=1;i<=5;i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted.");
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t=t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class syncBlockExample {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}