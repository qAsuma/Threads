package Threads_Task4;

public class First implements Runnable {
    private String first = "First";

    public String getFirst() {
        return first;
    }


    @Override
    public synchronized void run() {

        for (int i = 0; i < 50; i++) {
            try {

                Thread.sleep(300);


                System.out.println(getFirst() + " " + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

