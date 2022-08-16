package Task7_deadlock2_unlock;

public class Main {
    public static void main(String[] args) {
        UnLock1 u1 = new UnLock1();
        UnLock2 u2 = new UnLock2();

        u1.start();
        u2.start();

    }

    static class UnLock1 extends Thread {
        @Override
        public synchronized void run() {

                System.out.println("start");

                System.out.println("running");
                synchronized (UnLock2.class) {
                    System.out.println("hold");
                }
            }

        }


    static class UnLock2 extends Thread {
        @Override
        public synchronized void run() {

                System.out.println("start");

                System.out.println("running");
                synchronized (UnLock1.class) {

                    System.out.println("hold");
                }

            }
        }
    }



