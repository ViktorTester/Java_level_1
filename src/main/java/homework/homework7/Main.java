package homework.homework7;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Лорд", 5, false);
        allCats[1] = new Cat("Барон", 30, false);
        allCats[2] = new Cat("Князь", 10, false);
        allCats[3] = new Cat("Виконт", 45, false);


        Plate plate = new Plate(120);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.satiety && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.satiety = true;
                System.out.println("Кот " + allCat.name + " покушал!");
            } else {
                System.out.println("Кот " + allCat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько еды еще добавить?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
