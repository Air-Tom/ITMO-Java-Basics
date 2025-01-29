package Task6;

// Задача 6.4:
class successorClass extends mainClass{
    public successorClass(int number){
        super(number);
    }
    public void outputNumber() {
        System.out.println("Число из главного класса: " + number);
    }
}

// Задача 6.5:
class successorClass1 extends mainClass1 {

    @Override
    public void getAge() {
        super.getAge();
        System.out.println("Ваш возраст: " + age);
    }

    public String getFirstName() {
        return "Кристофер";
    }
}