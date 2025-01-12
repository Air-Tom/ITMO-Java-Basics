package Task2;

public class Main {
    public static void main(String[] args) {
        // Вызов класса Calculator с 2 параметрами
        System.out.println("Сумма (int): " + Calculator.sum(5, 10));
        System.out.println("Деление (double): " + Calculator.division(10.0, 3.0));
        System.out.println("Деление (long): " + Calculator.division(10L, 3L));
        System.out.println("Деление (int): " + Calculator.division(10, 3));
        System.out.println("Умножение (long): " + Calculator.multiplication(2500000L, 4000L));
        System.out.println("Вычитание (double): " + Calculator.subtraction(65.5, 7.0) + "\n");

        // Вызов класса Calculator с 3 параметрами
        System.out.println("Сумма (int): " + Calculator.sum(5, 10, 30));
        System.out.println("Деление (double): " + Calculator.division(10.0, 2.0, 2.5));
        System.out.println("Деление (long): " + Calculator.division(2500000L, 3345L, 123L));
        System.out.println("Деление (int): " + Calculator.division(234, 32, 3));
        System.out.println("Умножение (long): " + Calculator.multiplication(2500000L, 4000L, 700L));
        System.out.println("Вычитание (double): " + Calculator.subtraction(65.5, 7.0, 24.5) + "\n");

        // Вызов класса Person
        Person person1 = new Person();
        Person person2 = new Person("Artem", "Burkin", 32, 190000.65, "+7-921-561-9948");
        System.out.println(person1);
        System.out.println(person2);
    }
}