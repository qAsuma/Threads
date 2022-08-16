package Task6_deadlock2;

public class Main {
    public static void main(String[] args) {
        DeadLock1 d1 = new DeadLock1();
        DeadLock2 d2 = new DeadLock2();

        d1.start();
        d2.start();

    }

  static   class DeadLock1 extends Thread {
        @Override
        public void run() {
            synchronized (DeadLock1.class) {
                System.out.println("start");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("running");
                synchronized (DeadLock2.class){
                    System.out.println("hold");
                }
            }

        }
    }

     static    class DeadLock2 extends Thread {
            @Override
            public void run() {
                synchronized (DeadLock2.class) {


                    System.out.println("start");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("running");
                    synchronized (DeadLock1.class){
                        System.out.println("hold");
                    }

                }
            }
        }
    }

