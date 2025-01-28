package Task6;

// Задача 6.1:
// Задача 6.2: Интерфейс можно применить для определения общих методов showInfo
class Client extends Human implements Info{
    private String bankName;


    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName() + ", Банк: " + bankName);
    }
}