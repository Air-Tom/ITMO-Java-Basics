package Task3;

import java.time.Year;

// Задача 3.3: Создать класс House и добавить данные
public class House {
    private int numberFloor;
    private int yearConstruction;
    private String name;


    // Метод установки значений
    public void setValues(int numberFloor, int yearConstruction, String name) {
        this.numberFloor = numberFloor;
        this.yearConstruction = yearConstruction;
        this.name = name;
    }

    // Метод вывода значений
    public void outputValues() {
        System.out.println("Наименование: \"" + name + "\"");
        System.out.println("Всего этажей: " + numberFloor);
        System.out.println("Год постройки дома: " + yearConstruction);
        System.out.println("Количество лет с момента постройки дома: " + getYearConstruction() + "\n");
    }

    // Метод, возвращающий количество лет с момента постройки
    public int getYearConstruction() {
        return Year.now().getValue() - yearConstruction;
    }
}