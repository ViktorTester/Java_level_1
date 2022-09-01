package homework;

public class homework2 {
    public static void main(String[] args){
        System.out.println(CheckTheSum(5, 6));
        CheckPositiveOrNegative(-3);
        System.out.println(CheckPositiveOrNegative2(8));
        PrintTheTextNTimes("Hello, my Java friend", 3);
        System.out.println(CheckLeapYearOrNot(2020));

    }
    static boolean CheckTheSum(int a, int b){
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    static void CheckPositiveOrNegative(int a){
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    static boolean CheckPositiveOrNegative2(int a){
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    static void PrintTheTextNTimes(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
    static boolean CheckLeapYearOrNot(int a){
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}


