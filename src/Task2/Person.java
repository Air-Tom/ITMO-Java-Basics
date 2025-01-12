package Task2;

// Задача 2.2: Создать класс и определить у него несколько конструкторов
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;
    private String phoneNumber;

    // Конструктор без параметров
    public Person() {
    }

    // Конструктор со всеми параметрами
    public Person(String firstname, String lastname, int age, double salary, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    // Геттеры и сеттеры
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person {" +
                "Firstname: '" + firstname + '\'' +
                ", Lastname: '" + lastname + '\'' +
                ", Age: " + age +
                ", Salary: " + salary +
                ", Phone number: '" + phoneNumber + '\'' +
                '}';
    }
}
