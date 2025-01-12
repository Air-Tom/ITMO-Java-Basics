package Task3;

// Задача 3.2: Создать простой класс и метод вывода
public class Car {
    private String model;
    private String color;
    private double weight;

    // Метод вывода данных класса Car
    @Override
    public String toString() {
        return "Car {" +
                "Модель: '" + model + '\'' +
                ", Цвет: '" + color + '\'' +
                ", Вес " + weight +
                '}';
    }

    // Конструктор только цвета
    public Car(String color) {
        this.color = color;
    }

    // Конструктор цвета и веса
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // Конструктор пустой
    public Car() {
    }
}