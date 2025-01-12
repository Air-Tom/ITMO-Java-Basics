package Task3;


// Задача 3.4: Создать класс Tree и добавить поля и конструкторы
public class Tree {
    private int age;
    private boolean aliveOrNonliving;
    private String name;

    // Конструктор только для возраста и названия
    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор для всех переменных в классе Tree
    public Tree(String name, int age, boolean aliveOrNonliving) {
        this.name = name;
        this.age = age;
        this.aliveOrNonliving = aliveOrNonliving;
    }

    // Пустой   конструктор
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", aliveOrNonliving=" + aliveOrNonliving +
                ", name='" + name + '\'' +
                '}';
    }
}
