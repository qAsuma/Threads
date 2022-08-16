package Threads_Task2;

public class Second implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("c = " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("end Second");
    }
}
