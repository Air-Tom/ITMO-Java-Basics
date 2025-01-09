package Task2;

// Задача 2.1: Создание класса Calculator и 4-ех перегруженых методов
// способных вычислять 3 типа данных double, long и int

public class Calculator {
    // Класс для возврата результата деления
    public static class DivisionResult {
        public int quotient; // целая часть
        public int remainder; // остаток

        public DivisionResult(int quotient, int remainder) {
            this.quotient = quotient;
            this.remainder = remainder;
        }
    }

    // Создание метода "Сумма" для типа данных double
    public static double sum(double a, double b) {
        return a + b;
    }

    // Создание метода "Сумма" для типа данных long
    public static long sum(long a, long b) {
        return a + b;
    }

    // Создание метода "Сумма" для типа данных int
    public static int sum(int a, int b) {
        return a + b;
    }

    // // Перегрузка метода "Сумма" для трех чисел с различными типами данных
    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static long sum(long a, long b, long c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    // Создание метода "Деление" для типа данных double
    public static double division(double a, double b) {
        return a / b;
    }

    // Создание метода "Деление" для типа данных long
    public static DivisionResult division(long a, long b) {
        long quotient = a / b; // целая часть
        long remainder = a % b; // остаток
        return new DivisionResult((int) quotient, (int) remainder);
    }

    // Создание метода "Деление" для типа данных int
    public static DivisionResult division(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        return new DivisionResult(quotient, remainder);
    }

    // // Перегрузка метода "Деление" для трех чисел с различными типами данных
    public static double division(double a, double b, double c) {
        return a / b / c;
    }

    public static DivisionResult division(long a, long b, long c) {
        DivisionResult result1 = division(a, b);
        return division(result1.quotient, c);
    }

    public static DivisionResult division(int a, int b, int c) {
        DivisionResult result1 = division(a, b);
        return division(result1.quotient, c);
    }


    // Создание метода "Умножение" для типа данных double
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Создание метода "Умножение" для типа данных long
    public static long multiplication(long a, long b) {
        return a * b;
    }

    // Создание метода "Умножение" для типа данных int
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // // Перегрузка метода "Умножение" для трех чисел с различными типами данных
    public static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    public static long multiplication(long a, long b, long c) {
        return a * b * c;
    }

    public static int multiplication(int a, int b, int c) {
        return a * b * c;
    }


    // Создание метода "Вычитание" для типа данных double
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Создание метода "Вычитание" для типа данных long
    public static long subtraction(long a, long b) {
        return a - b;
    }

    // Создание метода "Вычитание" для типа данных int
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // // Перегрузка метода "Вычитание" для трех чисел с различными типами данных
    public static double subtraction(double a, double b, double c) {
        return a - b - c;
    }

    public static long subtraction(long a, long b, long c) {
        return a - b - c;
    }

    public static int subtraction(int a, int b, int c) {
        return a - b - c;
    }
}
