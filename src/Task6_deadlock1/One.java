package Task6_deadlock1;

public class One extends Thread {
    private Thread t2;
    String one = "One";

    public String getOne() {
        return one;
    }

    public void setT2(Thread t) {
        this.t2 = t;
    }

    @Override
    public void run() {
        System.out.println("One start");
        for (int i = 0; i < 20; i++) {
            try {

                Thread.sleep(300);
                t2.join();


                System.out.println(getOne() + " " + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("One finished");
    }
}


