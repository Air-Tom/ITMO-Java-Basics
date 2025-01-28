package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 5.1: start
        String text = "See I was on the verge of breaking down\n" +
                "Sometimes silence can seem so loud\n" +
                "There are miracles in life I must achieve\n" +
                "But first I know it starts inside of me, oh-oh\n" +
                "If I can see it, then I can be it\n" +
                "If I just believe it, there's nothing to it\n" +
                "I believe I can fly\n" +
                "I believe I can touch the sky\n" +
                "I think about it every night and day\n" +
                "Spread wings and fly away\n" +
                "I believe I can soar\n" +
                "I see me running through that open door\n" +
                "I believe I can fly\n" +
                "I believe I can fly\n" +
                "I believe I can fly (whoo!)";

        String result = Multypulty.longestWord(text);
        System.out.println("Самое длинное слово: " + result);

        // Задача 5.2: start
        String word1 = "Аргентина манит негра";
        System.out.println(word1 + " является палиндромом: " + Multypulty.isPalindrome(word1));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст или какое-нибудь слово");
        String word2 = scanner.next();
        boolean result1 = Multypulty.isPalindrome(word2);
        if (result1) {
            System.out.println("Найдено слово, которое является палиндромом: " + word2);
        } else {
            System.out.println("Слово палиндром не найдено");
        }

        // Задача 5.3: start
        String text1 = "Бяка, бяка, бЯка, бяКа, бякА - как-то так.";
        String censoredText = Multypulty.сensorshipCheck(text1);
        System.out.println(censoredText);

        // Задача 5.4: start
        String text2 = "Настоящее знание заключается в том, чтобы освободиться от страстей, " +
                "разорвать повторяющийся цикл рождения, смерти и перерождения. В этом — цель.";
        String substring = "рождения";
        int count = Multypulty.countOccurrences(text2, substring);
        System.out.println("Количество вхождений подстроки: '" + substring + "' в строку = " + count);

        // Задача 5.5: start
        String text3 = "Капля дробит камень не силой, но частым падением, так и человек делается мудрым не силою, " +
                "но часто повторяющимся чтением.";
        System.out.println("The given string is: " + text3);
        String inverter = Multypulty.wordsInverter(text3);
        System.out.println("The string reversed word by word is: " + inverter);
    }
}