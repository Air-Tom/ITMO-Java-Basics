package Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    // Метод проверки для числа 3, является или нет первым, или последним Э массива
    public static boolean isThreeFirstOrLast(int[] array) {
        // Проверка длины массива <=2
        if (array.length == 0) {
            System.out.println("Длина массива должна быть больше или равна двум.");
        }
        // Проверка певрого и последнего Э
        return array[0] == 3 || array[array.length - 1] == 3;
    }

    // Задача 4.1.6: метод проверки, содержит массив числа 1 или 3
    public static boolean isContainsOrNo(int[] array) {
        for (int num : array) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }

    // Задача 4.2.1: Метод проверки отсортирован масси или нет
    public static String isSorted(int[] array) {
        // Проверка, если массив содержит 1 Э или пустой, то считается отсортированным
        if (array.length < 2) {
            return "OK";
        }
        // Перебор Э-ов массива
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return "Please, try again";
            }
        }
        return "OK";
    }

    // Задача 4.2.2: Метод считывания с клавиатуры длины массива и заполнения
    public static void setLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        System.out.println("Array length: " + size);
        int[] array1 = new int[size];

        // Заполняем массив
        System.out.println("Enter numbers of array:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Numbers of array:");
        // Вывод каждый Э массива с новой строки
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i]);
        }
        // Выводим результат
        System.out.println("Result: " + Arrays.toString(array1) + "\n");
    }

    // Задача 4.2.3: метод, который меняет местами первый и последний элемент массива
    public static int[] change(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    // Задача 4.2.4: Найдите первое уникальное в этом массиве число
    public static int findFirstUnique(int[] arr) {


        // Проверка на уникальность Э массива
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            // Сравниваем с остальными Э-ми
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1; // Если уникальных чисел нет
    }
}