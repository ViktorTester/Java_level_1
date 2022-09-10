package homework.homework5;

public class Employee {
    String name;
    String surname;
    String patronymic;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String name, String surname, String patronymic, String email, int phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo(){
        System.out.println(String.format("Сотрудник: -%s- -%s- -%s-. Возраст: -%s-. Зарплата: -%s- рублей. " +
                "Телефон: -%s-, email: -%s-.", surname, name, patronymic, age, salary, phone, email));
    }


}
