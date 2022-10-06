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

        System.out.println("Задвча 4");
        for (int i = 1904; i <= 2096; i++){
            if (i % 4 == 0){
                System.out.println(i + " является високосным годом");
            }
        }

        System.out.println("Задача 5");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }

        System.out.println("Задача 6");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        System.out.println("Залача 7");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей");
            total = total + salary;
            System.out.println("Итого сумма = " + total + " рублей");
        }

        System.out.println("Залача 8");
        int salary1 = 29000;
        int total1 = 0;
        for (int a = 1; a <= 12; a++){
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total1 +" рублей");
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Итого сумма = " + total1 + " рублей");
        }
    }
}


