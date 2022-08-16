package Threads_Task3;
//Демонстрация приоритетов. Создать 2 класса PriorityRunner и PriorityThread. Запустить 3 потока с приоритетами (min, max, norm).
// При помощи цикла for выведем на экран значения от 1 до 50 и укажем, какой именно поток данную операцию делает.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        t.setPriority(1);
        System.out.println("Main: " + t.getPriority());


        Thread t1 = new Thread(new PriorityRunner());
        t1.start();


        Thread t2 = new Thread(new  PriorityThread());
        t2.start();


        t1.setPriority(10);
        System.out.println("PriorityThread: " + t1.getPriority());

        t2.setPriority(5);
        System.out.println("PriorityRunner: " + t2.getPriority());




        for (int j = 0; j < 50; j++) {
            Thread.sleep(500);

                System.out.println("Main = " + j);

            }
        }
    }

