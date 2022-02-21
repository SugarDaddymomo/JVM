package java8;

//Create a thread using lambda function.

public class q3 {
    public static void main(String[] args) {
        //NORMAL VERSION
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run(){
//                System.out.println("Task #1 is running");
//            }
//        });
//        thread1.start();

        //LAMBDA VERSION
        Thread thread1 = new Thread(() -> System.out.println("Inside a thread using Lambda."));
        thread1.start();
    }
}