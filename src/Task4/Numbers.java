package Task4;

// Задача 4.1.1: Вывод на консоль нечетных чисел
public class Numbers {
    public void oddEnum() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Задача 4.1.2: Вывод на консоль чисел, которые делятся на 3 и 5
    public void enum3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
        }
    }

    public void enum5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    public void enum35() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    // Метод проверки суммы
    public static boolean checkSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber;
        return sum == thirdNumber;
    }

    // Метод проверки сравнения
    public static boolean checkComparison(int firstNumber1, int secondNumber1, int thirdNumber1) {
        return firstNumber1 < secondNumber1 && secondNumber1 < thirdNumber1;
    }
}