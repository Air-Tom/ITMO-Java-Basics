package Task6;

// Задача 6.3:
public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {
    }
}
class Truck extends Car{
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int numberOfWheels, int maxWeight){
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newWheels) {
        this.numberOfWheels = newWheels;
        System.out.println("Новое количество колес: " + numberOfWheels);
    }
}