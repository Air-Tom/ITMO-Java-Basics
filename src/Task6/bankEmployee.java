package Task6;

// Задача 6.1,2:
class bankEmployee extends Human implements Info{
    private String bankName;

    public bankEmployee(String firstName, String lastName, String bankName){
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName() + ", Банк: " + bankName);
    }
}
