package Task9;

import java.util.*;

public class Player {
    // Задача 9.4:
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Map<Player, Integer> getPlayerMap(Set<String> names, int maxPoints) {
        Map<Player, Integer> playerMap = new HashMap<>();

        for (String name : names) {
            int points = (int) (Math.random() * (maxPoints * 2 + 1) - maxPoints);
            playerMap.put(new Player(name), points);
        }

        return playerMap;
    }

    public static Map<Player, Integer> showPlayerPoint(Map<Player, Integer> playerMap) {
        System.out.println("Введите имя игрока: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            Player thisPlayer = null;
            for (Player player : playerMap.keySet()) {
                if (player.getName().equals(name)) {
                    thisPlayer = player;
                    break;
                }
            }

            if (thisPlayer == null) {
                System.out.println("Данный игрок не существует.");
            } else {
                System.out.println("Количесто очков у игрока: " + name + " - " + playerMap.get(thisPlayer));
            }

            return playerMap;
        }
    }
}