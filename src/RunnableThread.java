class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class");
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);
        t2.start();
    }
}
