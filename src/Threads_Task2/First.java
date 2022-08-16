package Threads_Task2;

public class First implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("b = " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("end First");
    }
}