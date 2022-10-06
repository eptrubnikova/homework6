package cource1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 3");

        for (int i = 1; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Итерация цикла " + i);
            }
        }


    }
}


