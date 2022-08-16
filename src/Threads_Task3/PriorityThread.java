package Threads_Task3;

public class PriorityThread implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
            try {
                Thread.sleep(500);
                System.out.println("PThread = " + j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
