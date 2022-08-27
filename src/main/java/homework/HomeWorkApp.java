package homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 10, b = -55;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = 56;
        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers(){
        int a = 9, b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}