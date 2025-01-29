package Task7;

// Задача 7.1:
public class Plane {
    private final MainPlane mainPlane1;
    private final MainPlane mainPlane2;

    public Plane(double mainPlane1Weight, double mainPlane2Weight) {
        System.out.println("Создание нового самолета");
        mainPlane1 = new MainPlane(mainPlane1Weight);
        mainPlane1.printMainPlaneInfo();
        mainPlane2 = new MainPlane(mainPlane2Weight);
        mainPlane2.printMainPlaneInfo();
        System.out.println("Самолет создан");
    }

    public MainPlane getMainPlane1() {
        return mainPlane1;
    }

    public MainPlane getMainPlane2() {
        return mainPlane2;
    }

    public static class MainPlane {
        private final double weight;

        public MainPlane(double weight) {
            System.out.println("Крыло самолета создано");
            this.weight = weight;
        }

        public void printMainPlaneInfo() {
            System.out.println("вес крыла = " + this.weight + " кг");
        }
    }
}