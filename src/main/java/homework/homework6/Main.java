package homework.homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        int runDistance = 200;
        int swimDistance = 0;
        Cat cat = new Cat(runDistance, swimDistance);

        runDistance = 500;
        swimDistance = 10;
        Animal dog = new Dog(runDistance, swimDistance);


        System.out.println("Кошка может пробежать: " + cat.getAnimalRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        int distance = scanner.nextInt();

        System.out.println("Кошка пытается пробежать " + distance + " метра(ов). Результат: " + cat.run(distance));
        System.out.println("Собака пытается пробежать " + distance + " метра(ов).  Результат: " + dog.run(distance));
        System.out.println();


        System.out.println("Кошка плавать не умеет" +
                "\nСобака может проплыть: " + dog.getAnimalSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextInt();

        System.out.println("Кошка пытается проплыть " + distance + " метра(ов). Результат: " + cat.swim(distance));
        System.out.println("Собака пытается проплыть " + distance + " метра(ов). Результат: " + dog.swim(distance));

    }


}