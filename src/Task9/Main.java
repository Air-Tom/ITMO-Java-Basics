package Task9;


import java.util.*;

import static Task9.LemonElem.getBigRandList;
import static Task9.LemonElem.getRandItemSomeTimes;
import static Task9.Player.getPlayerMap;
import static Task9.Player.showPlayerPoint;


public class Main {
    public static void main(String[] args) {
        // Задача 9.2: start

        Object objectFox = new Object();
        Object objectWolf = new Object();
        Object objectFoxWolf = objectFox;
        Object objectCat = new Object();
        Object objectDog = new Object();
        Object objectCatWolf = objectDog;

        List<Object> objectList = new ArrayList<>();
        objectList.add(objectFox);
        objectList.add(objectWolf);
        objectList.add(objectFoxWolf);
        objectList.add(objectCat);
        objectList.add(objectDog);
        objectList.add(objectCatWolf);

        System.out.println("Количество уникальных объектов в коллекции: " +
                RemoveDupl.removeDuplicates(objectList).size() + "\n");

        // Задача 9.3: start
        long startTime;
        long endTime;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Вызов метода для заполнения ArrayList 1000000 элементов от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        arrayList = getBigRandList(1000000, "ArrayList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("Время ArrayList: " + (endTime - startTime) + " мс.");

        System.out.println("Вызов метода для заполнения LinkedList 1000000 элементов от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        linkedList = getBigRandList(1000000, "LinkedList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("Время LinkedList: " + (endTime - startTime) + " мс.");

        System.out.println();

        System.out.println("Вызов метода для получения случайного элемента из ArrayList 100000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(arrayList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("Время ArrayList: " + (endTime - startTime) + " мс.");

        System.out.println("Вызов метода для получения случайного элемента из LinkedList 100000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(linkedList, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("Время LinkedList: " + (endTime - startTime) + " мс.");

        System.out.println("ArrayList будет значительно быстрее, так как он использует прямой доступ" +
                " к элементам по индексу, в то время как LinkedList требует линейного поиска");

        // Задача 9.4: start
        List<String> americanNames = Arrays.asList("Abigail", "Aiden", "Ashley", "Alexander", "Amelia", "Anthony",
                "Ava", "Andrew", "Abel", "Benjamin", "Brianna", "Brandon", "Brooklyn", "Carter", "Chloe", "Christopher",
                "Daniel", "David", "Ella", "Emily", "Ethan", "Grace", "Gabriel", "Hannah", "Henry", "Isabella",
                "Jackson", "James", "Liam", "Madison", "Matthew", "Mia", "Noah", "Olivia", "Sophia", "William", "Zoe");
        Set<String> names = new HashSet<>();
        Random random = new Random();

        while (names.size() < 33) {
            String randomName = americanNames.get(random.nextInt(americanNames.size()));
            names.add(randomName);
        }

        System.out.println("Выберите имя: " + names);
        Map<Player, Integer> playerMap = getPlayerMap(names, 42);
        showPlayerPoint(playerMap);
    }
}