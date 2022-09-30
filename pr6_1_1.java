//Created By 21CE007 Daksh Bangoria
// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.
class MyThread extends Thread{
    public void run()
    {
    try {
    System.out.println("Hello World");
    } catch (Exception e) {
    System.out.println("Exception Occured");
    }
    }
    }
    public class pr6_1_1 {
    public static void main(String[] args) {
    MyThread t1= new MyThread();
    t1.start();
    }
    }
    