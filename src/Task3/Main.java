package Task3;

public class Main {
    public static void main(String[] args) {
        // Вызов класса Study и установление параметра
        Study study1 = new Study("Изучение Java - это просто!");
        System.out.println(study1.printCourse());

        // Создание 2 объектов Car и установление параметров
        Car car1 = new Car("Black");
        Car car2 = new Car("Green", 1500.75);
        System.out.println(car1);
        System.out.println(car2 + "\n");

        // Создание 2 объектов House и установление характеристик и вывод на консоль
        House house1 = new House();
        house1.setValues(9, 1988, "Дом на набережной");

        House house2 = new House();
        house2.setValues(21, 2020, "LSR - Цивилизация");

        System.out.println("Информация о первом доме:");
        house1.outputValues();
        System.out.println("Информация о втором доме:");
        house2.outputValues();

        // Создание 3 объектов Tree
        Tree tree1 = new Tree("Бамбук", 7);
        Tree tree2 = new Tree("Берёза", 35, true);
        Tree tree3 = new Tree();

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}