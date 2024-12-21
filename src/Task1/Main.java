package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача 1: Вывод строк в заданном порядке
        System.out.println("Я\n" +
                "хорошо\n" +
                "знаю\n" +
                "Java.\n");

        // Задача 2: Посчитать результаты выражений
        int result1 = (46 + 10) * (10 / 3);
        int result2 = 29 * 4 * -15;

        // Задача 3: Вычисление выражения с переменной number
        int number = 10500;
        int result = number /10 /10;
        System.out.println("Результат выражения с переменной number = " + result + "\n");

        // Задача 4: Произведение трех чисел
        double result3 = 3.6 * 4.1 * 5.9;

        // Задача 5: Считывание и вывод целых чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа последовательно: 42, 100, 125");
        scanner.hasNextInt();
        int  input = scanner.nextInt();
        scanner.hasNextInt();
        int  input1 = scanner.nextInt();
        scanner.hasNextInt();
        int  input2 = scanner.nextInt();
        System.out.println(input);
        System.out.println(input1);
        System.out.println(input2 + "\n");


        // Задача 6: Вывод четного и нечетного числа
        System.out.println("Введите целое число");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (b >100) {
                System.out.println("Выход за пределы диапазона");
            }
            else {
                System.out.println("Четное");
            }
        }
        scanner.close();
    }
}