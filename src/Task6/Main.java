package Task6;

public class Main {
    public static void main(String[] args) {
        // Задача 6.4: start
        successorClass successor = new successorClass(33);
        successor.outputNumber();

        // Задача 6.5: start
        successorClass1 successor1 = new successorClass1();
        successor1.getAge();
        System.out.println("Имя: " + successor1.getFirstName());
    }
}
