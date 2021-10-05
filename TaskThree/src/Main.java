import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        customers.add(new Customer("Peter", "Thomsen", "PeterTom21"));
        customers.add(new Customer("Helle", "Gårdsen", "gaard4Helle"));
        customers.add(new Customer("Mika", "Hansen", "storBjoern42"));
        customers.add(new Customer("Heidi", "Månesen", "birdmom"));
        customers.add(new Customer("Lukas", "Hansen", "lookUpHans"));
        customers.add(new Customer("Morten", "Thomsen", "morthomsen"));

        printCustomers();

    }

    public static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
