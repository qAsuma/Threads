package Threads_Task2;
//Задержка потока. Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first),
// и когда эти потоки успешно отработают – вывести на экран сообщение (завершение потом first, second и main).


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread other = new Thread(new Second());
        Thread other1 = new Thread(new First());
        other.start();
        other1.start();

        for (int a = 0; a < 5; a++) {
            Thread.sleep(1000);
            System.out.println("a = " + a);

        }
        System.out.println("завершение Main");

    }
}
