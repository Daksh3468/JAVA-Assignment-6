//Created By 21CE007 Daksh Bangoria
// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.
class MyThread1 implements Runnable {
    public void run() {
        try {
            System.out.println("Hello World  " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

public class pr6_1_2 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    Thread t = new Thread(t1);
    t.run();
    }
}
