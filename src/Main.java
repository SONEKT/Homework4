public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var age = 42;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        var thempirature = 6;
        if (thempirature >= 5) {
            System.out.println("На улице " + thempirature + " градусов. Сегодня тепло можно идти без шапки.");
        } else System.out.println("На улице " + thempirature + " градусов. Сегодня холодно нужно надеть шапку.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        var speed = 40;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        } else System.out.println("Если скорость " + speed + " придется заплатить штраф.");
    }

    public static void task4() {
        System.out.println("Задача 4");
    }

    public static void task5() {
        System.out.println("Задача 5");
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }
}