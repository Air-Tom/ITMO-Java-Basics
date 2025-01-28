package Task5;


public class Multypulty {
    // Задача 5.1: метод для поиска самого длинного слова в тексте
    public static String longestWord(String text) {
        // Убираем знаки препинания, разбивая текст на слова
        String[] words = text.split("\\s+");
        String longest = "";

        for (String word : words) {
            // Убираем знаки препинания с начала и конца слова
            String cleanWord = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
            // Проверка, является ли текущее слово длинее самого длинного
            if (cleanWord.length() > longest.length()) {
                longest = cleanWord;
            }
        }
        return longest;
    }

    // Задача 5.2: метод, который проверяет является ли слово палиндромом
    public static boolean isPalindrome(String word) {
        // Убираем знаки препинания, пробелы и приводим слово к нижнему регистру
        String cleanWord = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanWord.length() - 1;

        // Проверяем символы с начала и конца
        while (left < right) {
            if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Задача 5.3: метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
    public static String сensorshipCheck(String text) {
        // Делаем все слова в тексте в нижнем регистре и заменяем все слова "бяка"
        String lowerText = text.toLowerCase();
        return lowerText.replace("бяка", "[вырезано цензурой]");
    }

    // Задача 5.4: Написать метод, который находит количество вхождений одной (являющейся подстрокой) в другую
    public static int countOccurrences(String text, String substring) {
        // Инициилизируем счетчик и индекс
        int count = 0;
        int index = 0;
        // Пробегаем по индексам и считаем количество вхождений подстроки в строку
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    // Задача 5.5: метод, который инвертирует слова в строке
    public static String wordsInverter(String text) {
        // Разделяем строку на слова по пробелам
        String[] words = text.split(" ");
        StringBuilder inverterString = new StringBuilder();

        // Проходим по всем словам и переворачиваем с ног на голову каждое из них
        for (String word : words) {
            String wordInverter = new StringBuilder(word).reverse().toString();
            inverterString.append(wordInverter).append(" ");
        }
        return inverterString.toString().trim();
    }
}