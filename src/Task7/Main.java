package Task7;


public class Main {
    public static void main(String[] args) {
        // Задача 7.2: start
        Plane plane1 = new Plane(13350.7, 13465.4);

        System.out.println();
        System.out.print("Крыло eins: ");
        plane1.getMainPlane1().printMainPlaneInfo();
        System.out.print("Крыло zwei: ");
        plane1.getMainPlane2().printMainPlaneInfo();

        Plane plane2 = new Plane(40150.9, 40222.3);

        System.out.println();
        System.out.print("Крыло eins: ");
        plane2.getMainPlane1().printMainPlaneInfo();
        System.out.print("Крыло zwei: ");
        plane2.getMainPlane2().printMainPlaneInfo();
    }
}