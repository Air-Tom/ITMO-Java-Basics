package Task6;

import java.util.Scanner;

// Задача 6.4:
class mainClass {
    protected int number;

    public mainClass(int number){
        this.number = number;
    }
}

// Задача 6.5:
class mainClass1 {
    protected int age;

    public void getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        age = scanner.nextInt();
    }
}