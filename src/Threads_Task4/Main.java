package Threads_Task4;
//Создать 2 произвольных класса с полями и методами. Необходимо синхронизировать методы этих классов между собой, т.е.
// чтобы выводило на экран значения друг за другом (1 класс, 2 класс, 1, 2 и т.д.).

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new First());
        Thread t2 = new Thread(new Second());
        t1.start();
        t2.start();




    }
}
