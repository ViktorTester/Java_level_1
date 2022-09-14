package homework.homework5;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Барсик", "Котов", "Белович", "cat123@qateam.com", "29987856", 11000, 41);
        persArray[1] = new Employee("Шарик", "Кусаков", "Чернович", "cat567@qateam.com", "29987857", 13000, 43);
        persArray[2] = new Employee("Рыжик", "Пятнистый", "Моржович", "cat789@qateam.com", "29987859", 9000, 49);
        persArray[3] = new Employee("Салатик", "Обормотов", "Седович", "cat134@qateam.com", "29987858", 8000, 18);
        persArray[4] = new Employee("Персик", "Бегунов", "Желтович", "cat144@qateam.com", "29967858", 6000, 26);

        System.out.println();

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age > 40){
                persArray[i].printInfo();
            }
        }
    }
}
