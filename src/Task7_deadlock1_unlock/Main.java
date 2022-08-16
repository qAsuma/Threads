package Task7_deadlock1_unlock;
public class Main {
    public static void main(String[] args) {


        One t1 = new One();
        Two t2 = new Two();

        t1.setT2(t2);
        t2.setT1(t1);

        t1.start();
        t2.start();



    }
}
