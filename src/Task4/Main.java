package Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers oddNumbers = new Numbers();
        oddNumbers.oddEnum();
        System.out.println();

        Numbers divisibleBy3 = new Numbers();
        divisibleBy3.Enum3();
        System.out.println();

        Numbers divisibleBy5 = new Numbers();
        divisibleBy5.Enum5();
        System.out.println();

        Numbers divisibleBy35 = new Numbers();
        divisibleBy35.Enum35();
        System.out.println();

        // Задача 4.1.3: вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        // Проверка суммы и вывод результата
        boolean result = Numbers.checkSum(firstNumber, secondNumber, thirdNumber);
        System.out.println("Результат: " + result + "\n");

        // Задача 4.1.4: Принимает от пользователя три целых числа и возвращает true,
        // если второе число больше первого числа, а третье число больше второго числа.
        System.out.println("Введите первое число: ");
        int firstNumber1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber1 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNumber1 = scanner.nextInt();

        // Проверка сравнения и вывод результата
        boolean result1 = Numbers.checkComparison(firstNumber1, secondNumber1, thirdNumber1);
        System.out.println("Результат: " + result1 + "\n");

        // Задача 4.1.5: Проверить появляется ли число 3 как первый или последний элемент массива целых чисел
        int[] array = {21, 235, 463, 64, 97, 23, 75, 68, 1};
        int[] array2 = {3, 235, 463, 64, 97, 23, 75, 68};
        int[] array3 = {-43, 235, 463, 64, 97, 23, 75, 3};
        int[] array4 = {4, 235};
        int[] array5 = {4, 65, 76, 127, 203, 233, 235};
        int[] array6 = new int[10];


        boolean result2 = Array.isThreeFirstOrLast(array);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(result2);

        boolean result3 = Array.isThreeFirstOrLast(array2);
        System.out.println("array = " + Arrays.toString(array2));
        System.out.println(result3);

        boolean result4 = Array.isThreeFirstOrLast(array3);
        System.out.println("array = " + Arrays.toString(array3));
        System.out.println(result4);

        boolean result5 = Array.isThreeFirstOrLast(array4);
        System.out.println("array = " + Arrays.toString(array4));
        System.out.println(result5 + "\n");

        // Задача 4.1.6: Проверить появляется ли число 3
        boolean result6 = Array.isContainsOrNo(array);
        System.out.println("Содержит массив числа 1 или 3: " + result6);

        boolean result7 = Array.isContainsOrNo(array4);
        System.out.println("Содержит массив числа 1 или 3: " + result7 + "\n");

        // Задача 4.2.1: Отсортированный массив или нет
        String result8 = Array.isSorted(array2);
        System.out.println(result8);

        String result9 = Array.isSorted(array5);
        System.out.println(result9);

        String result10 = Array.isSorted(array6);
        System.out.println(result10 + "\n");

        // Задача 4.2.2:
        Array.setLength();

        // Задача 4.2.3:
        int[] array1 = {23, 123, 423, 457, 78, 856, 88};
        System.out.println("Array 1: " + Arrays.toString(array1));

        int[] array7 = Array.change(array1);
        System.out.println("Array 2: " + Arrays.toString(array7));

        // Задача 4.2.4:
        int[] array8 = {1, 2, 3, 1, 2, 4};
        int uniqueNumber = Array.findFirstUnique(array8);
        if (uniqueNumber != -1) {
            System.out.println("Первое уникальное число: " + uniqueNumber);
        } else {
            System.out.println("Уникальных чисел нет.");
        }
    }
}