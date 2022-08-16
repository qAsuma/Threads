package Threads_Task4;

public class Second implements Runnable {
    private String second = "Second";

    public String getSecond() {
        return second;
    }


    @Override
    public synchronized void run() {


        for (int i = 0; i < 50; i++) {
            try {

                Thread.sleep(300);
                System.out.println(getSecond() + " " + i);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}




