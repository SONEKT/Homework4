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
        var age = 24;
        if (age < 2) {
            System.out.println("eсли возраст человека равен " + age + ", то ему нужно спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("eсли возраст человека равен " + age + ", то ему нужно ходить в садик");
        } else if (age >= 7 && age <= 18) {
            System.out.println("eсли возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("eсли возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24 && age <= 60) {
            System.out.println("eсли возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else if (age > 60) {
            System.out.println("eсли возраст человека равен " + age + ", то ему можно отдохнуть");

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        var age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься без взрослых");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без взрослых");

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        var places = 65;
        if (places <= 60) {
            System.out.println("вы получили сидячее место");
        } else if (places > 60 && places <= 102) {
            System.out.println("Вы получили стоячее место");
        } else if (places > 102) {
            System.out.println("Вагон переполнен");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        }else if (two>one && two>three){
            System.out.println(two);
        }else if (three > one && three>two){
            System.out.println(three);
        }
    }
}