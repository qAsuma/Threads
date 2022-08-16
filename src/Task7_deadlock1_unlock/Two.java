package Task7_deadlock1_unlock;

public class Two extends Thread {
    private Thread t1;
    String two = "Two";

    public String getTwo() {
        return two;
    }

    public void setT1(Thread t) {
        this.t1 = t;
    }

    @Override
    public void run() {
        System.out.println("Two start");
        for (int i = 0; i < 20; i++) {
            try {

                Thread.sleep(300);



                System.out.println(getTwo() + " " + i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Two finished");

    }


}


